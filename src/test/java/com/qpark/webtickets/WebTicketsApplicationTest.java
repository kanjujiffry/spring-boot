package com.qpark.webtickets;

import org.junit.Test;
import hello.Application;
import org.junit.runner.RunWith;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes={Application.class})
@EnableAutoConfiguration
public class WebTicketsApplicationTest extends Application {

    @Test
    public void testMain() {
        String [] args = { "test" };
        main(args);
    }
}
