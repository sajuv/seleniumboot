package demo;

import org.automation.App.SeleniumBootApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = SeleniumBootApplication.class)
@WebAppConfiguration
public class SeleniumBootApplicationTests {

	@Test
	public void contextLoads() {
	}

}
