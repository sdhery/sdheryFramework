import com.sdhery.module.tree.domain.SysTree;
import com.sdhery.module.tree.service.ISysTreeService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: sdhery
 * Date: 13-6-22
 * Time: 下午4:35
 * To change this template use File | Settings | File Templates.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath*:config/spring/*.xml")
public class SysTreeTest {
    @Resource
    ISysTreeService sysTreeService;

    @Test
    public void test() {
        try {
            List<SysTree> result = sysTreeService.getSysTreeListByParentId(1);
            System.out.println(result.size());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
