package com.spellhaven.spring0510_11;

public class Worker {

	private String name;
	private String job;
	private String age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	
	// Worker 클래스의 핵심기능
	public void printWorkerInfo() {
		System.out.println("이름: " + getName());
		System.out.println("나이: " + getAge());
		System.out.println("직업: " + getJob());
	}
	
}
