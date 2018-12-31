package top.pesystem.model.impl;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import top.pesystem.model.Performance;
import top.pesystem.springConfig.springConfig;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = springConfig.class)
public class PerformanceImplTest {
    @Autowired
    private Performance performance;

    @Test
    public void perform() {
        performance.perform();
    }

    @Test
    public void setPersonNum() {
        performance.setPersonNum(123);
    }
}