package org.automation;

import org.automation.app.SeleniumBootStarter;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = SeleniumBootStarter.class)
@WebAppConfiguration
public class SeleniumBootApplicationTests {

	@Test
	public void contextLoads() {
	}

}
