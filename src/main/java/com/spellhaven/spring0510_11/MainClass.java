package com.spellhaven.spring0510_11;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationCTX.xml");
		Student student1 = ctx.getBean("stu1", Student.class);
		Worker worker1 = ctx.getBean("worker1", Worker.class);
		
		student1.printStudentInfo(); // Student 클래스의 핵심 기능 메서드 호출
		worker1.printWorkerInfo(); // Worker 클래스의 핵심 기능 메서드 호출
		
		ctx.close();
	}

}
