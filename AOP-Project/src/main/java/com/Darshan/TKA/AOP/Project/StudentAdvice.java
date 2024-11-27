package com.Darshan.TKA.AOP.Project;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class StudentAdvice {

	@Before("execution(* com.Darshan.TKA.AOP.Project.StudentController.aopp())")
	public void message1() {
		System.out.println("Project Start");
	}

	@After("execution(* com.Darshan.TKA.AOP.Project.StudentController.aopp())")
	public void message2() {
		System.out.println("Project End");
	}

	@Around("execution(* com.Darshan.TKA.AOP.Project.StudentController.aopp())")
	public void message3() {
		System.out.println("submit!!!");
	}
}