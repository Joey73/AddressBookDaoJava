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
	
	/**
	 * Advice - Print out the name of the method the pointcut refers to.
	 * @param joinPoint
	 */
	@Before("execution(* com.addressbookdao.controller.AddressBookController.*(..))")
	public void before(JoinPoint joinPoint){
		String className = joinPoint.getSignature().getClass().getName();
		String methodName = joinPoint.getSignature().getName();
		String arguments = Arrays.toString(joinPoint.getArgs());
		logger.info("Before " + className + "." + methodName + " with arguments: " + arguments);
	}

	@AfterReturning(pointcut="execution(* com.addressbookdao.controller.AddressBookController.*(..))", returning="result")
	public void afterPlusReturnValue(JoinPoint joinPoint, Object result){
		String className = joinPoint.getSignature().getClass().getName();
		String methodName = joinPoint.getSignature().getName();
		logger.info("After " + className + "." + methodName + " with result: " + result);
	}
}
