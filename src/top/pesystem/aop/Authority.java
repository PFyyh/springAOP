package top.pesystem.aop;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;


@Aspect
public class Authority {
    @Pointcut(value = "execution(* top.pesystem.model.Performance.setPersonNum(int)) && args(num)")
    public void setPersonNum(int num) {
    }

    @Before(value = "setPersonNum(num)", argNames = "num")
    public void getNum(int num) {
        //传入参数
        System.out.println("传入参数：" + num);
    }

    @AfterReturning(value = "setPersonNum(num)", returning = "result", argNames = "num,result")
    public void getMethodReturn(int num, int result) {
        System.out.println("修改后参数：" + result);
    }

}
