package com.sdhery.module.privilege.filter;

import com.sdhery.module.core.filter.FilterUtil;
import com.sdhery.module.core.util.spring.SpringContextHolder;

import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import java.io.IOException;
import java.util.Enumeration;

/**
 * Created with IntelliJ IDEA.
 * User: sdhery
 * Date: 13-7-20
 * Time: 下午2:34
 * To change this template use File | Settings | File Templates.
 */
public class PrivilegeFilter extends HttpServlet implements Filter {
    private Filter delegate;

    protected FilterConfig filterConfig;

    public void init(FilterConfig filterConfig) throws ServletException {
        this.filterConfig = filterConfig;
    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain) throws IOException, ServletException {

        //非加载URL
        if (!FilterUtil.doInclude(request, response, filterConfig)) {
            filterChain.doFilter(request, response);
            return;
        }

        //过滤的URL
        if (FilterUtil.doExclude(request, response, filterConfig)) {
            filterChain.doFilter(request, response);
            return;
        }
        if(delegate==null){
            delegate = SpringContextHolder.getBean(getTargetBeanName(),Filter.class);
            if(delegate!=null){
                delegate.init(filterConfig);
            }
        }

        if(delegate!=null){
            delegate.doFilter(request,response,filterChain);
        }else {
            filterChain.doFilter(request, response);
        }
    }

    public String getTargetBeanName() {
        return getInitParameter("targetBean");
    }

    public String getInitParameter(String name) {
        return filterConfig.getInitParameter(name);
    }

    public Enumeration getInitParameterNames() {
        return filterConfig.getInitParameterNames();
    }
}
