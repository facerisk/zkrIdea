package com.lpl.springboot.nb1.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

@Aspect //声明一个切面
@Component //让该切面成为spring管理的bean
public class LogAspect {
    @Pointcut("@annotation(com.lpl.springboot.nb1.aop.Action)")
    public void annotationPointCut(){};

    @After("annotationPointCut()")
    public void after(JoinPoint joinPoint){
        MethodSignature signature =(MethodSignature)joinPoint.getSignature();
        Method method = signature.getMethod();
        Action action = method.getAnnotation(Action.class);
        System.out.println("注解式拦截："+action.name());
    }

    @Before("execution(* com.lpl.springboot.nb1.aop.DemoMethodService.*(..))")
    public void before(JoinPoint joinPoint){
        MethodSignature signature =(MethodSignature)joinPoint.getSignature();
        Method method = signature.getMethod();
        System.out.println("方法规则式拦截,"+method.getName());
    }

    @Around("annotationPointCut()")
    public void around(ProceedingJoinPoint point) throws Throwable { //参数就留这一个就可正确运行
//        MethodSignature signature =(MethodSignature)joinPoint.getSignature();
//        Method method = signature.getMethod();
//        Action action = method.getAnnotation(Action.class);
        System.out.println("around注解式拦截 前：");
        point.proceed();
        System.out.println("around注解式拦截 后：");
    }
}
