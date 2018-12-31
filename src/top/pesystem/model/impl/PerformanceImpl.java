package top.pesystem.model.impl;

import org.springframework.stereotype.Service;
import top.pesystem.model.Performance;

@Service("performance")
public class PerformanceImpl implements Performance {
    @Override
    public void perform() {
        System.out.println("PerformanceImpl.peform");
    }

    @Override
    public int setPersonNum(int num) {
        ++num;
        System.out.println("人数："+num);
        return num;
    }
}
