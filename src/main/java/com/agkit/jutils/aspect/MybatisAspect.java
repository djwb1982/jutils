package com.agkit.jutils.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Pointcut;
/**
 * @program: com.agcloud.common.aspect.MybatisAspect
 * @description:
 * @author: king djwb1982@163.com
 * @create: 2018-11-20 09:29
 **/
public class MybatisAspect {

    @Pointcut("execution(public * com.example.demo.controller.HelloController.add*(..)) && @annotation(com.example.demo.controller.MyAnnotation)" )
    public void addAdvice(){}
    @Around("addAdvice()")
    public Object Interceptor(ProceedingJoinPoint pjp){
        Object result = null;
        Object[] args = pjp.getArgs();
        if(args != null && args.length >0) {
            String deviceId = (String) args[0];
             if(!"03".equals(deviceId)) {
                 return "no anthorization";
             }
        }
        try {
            result =pjp.proceed();
        } catch (Throwable e) {
            e.printStackTrace();
        }
        return result;
    }
}
