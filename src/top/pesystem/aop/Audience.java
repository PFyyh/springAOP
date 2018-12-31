package top.pesystem.aop;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;


//声明切面
@Aspect
public class Audience {
    //    设置切点
    @Pointcut("execution(* top.pesystem.model.Performance.perform(..))")
    public void perform() { }
    //前置通知
    @Before("perform()")
    public void silenceCellPhones() {
        System.out.println("silencing cell phones");
    }
    //前置通知
    @Before("perform()")
    public void takeSeats() {
        System.out.println("Task seats");
    }
    //返回通知
    @AfterReturning("perform()")
    public void applause() {
        System.out.println("CLAP CLAP CLAP CLAP");
    }
    //异常通知
    @AfterThrowing("perform()")
    public void demandReFund() {
        System.out.println("Demanding a refund");
    }
}
