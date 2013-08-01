package com.sdhery.module.helper;

import com.sdhery.module.core.util.spring.SpringContextHolder;
import org.springframework.context.support.AbstractMessageSource;
import javax.servlet.http.HttpServletRequest;

/**
 * Created with IntelliJ IDEA.
 * User: sdhery
 * Date: 13-6-9
 * Time: 下午3:08
 * To change this template use File | Settings | File Templates.
 */
public class MessageSourceManager {
    public static String getMessage(String key, HttpServletRequest request){
        AbstractMessageSource abstractMessageSource = (AbstractMessageSource) SpringContextHolder.getBean("messageSource");
        return abstractMessageSource.getMessage(key, new Object[0], request.getLocale());
    }
}
