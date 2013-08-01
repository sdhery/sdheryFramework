import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created with IntelliJ IDEA.
 * User: sdhery
 * Date: 13-7-29
 * Time: 上午11:37
 * To change this template use File | Settings | File Templates.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath*:config/spring/*.xml")
public class PrivilegeTest {

    @Test
    public void testRun() {
        System.out.println("222");
    }
}
