import com.sdhery.module.core.commons.Condition;
import com.sdhery.module.info.service.IInfoArticleService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: sdhery
 * Date: 13-7-16
 * Time: 上午10:44
 * To change this template use File | Settings | File Templates.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath*:config/spring/*.xml")
public class InfoArticleTest {
    @Resource
    IInfoArticleService infoArticleService;

    @Test
    public void test() {
        try {
            Condition condition = new Condition();
            Condition.ConditionItem conditionItem = null;
            conditionItem = new Condition.ConditionItem();
            conditionItem.setCondition("TITLE = ");
            conditionItem.setValue("好的");
            conditionItem.setSingleValue(true);
            condition.getConditionItems().add(conditionItem);
            System.out.println(infoArticleService.search(condition));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
