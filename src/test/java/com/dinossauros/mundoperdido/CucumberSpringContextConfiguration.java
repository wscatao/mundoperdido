package com.dinossauros.mundoperdido;

import io.cucumber.spring.CucumberContextConfiguration;
import lombok.extern.slf4j.Slf4j;
import org.junit.Before;
import org.springframework.boot.test.context.SpringBootContextLoader;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.ContextConfiguration;

/**
 * Class to use spring application context while running cucumber
 */
@SpringBootTest(webEnvironment = WebEnvironment.DEFINED_PORT)
@ContextConfiguration(classes = MundoperdidoApplication.class, loader = SpringBootContextLoader.class)
@CucumberContextConfiguration
@Slf4j
public class CucumberSpringContextConfiguration {

  /**
   * Need this method so the cucumber will recognize this class as glue and load spring context configuration
   */
  @Before
  public void setUp() {
    log.info("-------------- Spring Context Initialized For Executing Cucumber Tests --------------");
  }
}