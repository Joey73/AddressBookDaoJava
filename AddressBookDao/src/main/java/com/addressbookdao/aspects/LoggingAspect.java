package com.addressbookdao.aspects;

import java.util.Arrays;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
	private static Logger logger = LogManager.getLogger();
	
	@Before("execution(* com.addressbookdao.controller.AddressBookController.*(..))")
	public void before(JoinPoint joinPoint){
		String className = joinPoint.getTarget().getClass().getName();
		String methodName = joinPoint.getSignature().getName();
		
		Object[] args = joinPoint.getArgs();
		StringBuffer argumentsSb = new StringBuffer();
		for(int i = 0; i < args.length; i++){
			argumentsSb.append(args[i]);
			if(i != args.length - 1){
				argumentsSb.append(", ");
			}
		}
		
		logger.info("Before " + className + "." + methodName + "(" + argumentsSb.toString() + ")");
	}

	@AfterReturning(pointcut="execution(* com.addressbookdao.controller.AddressBookController.*(..))", returning="result")
	public void afterPlusReturnValue(JoinPoint joinPoint, Object result){
		String className = joinPoint.getTarget().getClass().getName();
		String methodName = joinPoint.getSignature().getName();
		logger.info("After " + className + "." + methodName + " with result: " + result);
	}
}
