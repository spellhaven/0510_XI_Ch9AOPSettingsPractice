package com.spellhaven.spring0510_11;

public class Student {
	
	// 우리 교수님은 어떤 클래스를 만들어야 할 때 꼭 Student.java를 만드시는 습관이 있는데...
	// 어, 게터세터 뒤엔 핵심 기능 메서드도 만드시네.
	// '핵심 기능 메서드' 그 자체 내용이 중요한 게 아니다. AOP의 개념을 가슴에 새겨 보디.
	
	private String name;
	private String age;
	private String gradeNum; // 학년
	private String classNum; // 반
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getGradeNum() {
		return gradeNum;
	}
	public void setGradeNum(String gradeNum) {
		this.gradeNum = gradeNum;
	}
	public String getClassNum() {
		return classNum;
	}
	public void setClassNum(String classNum) {
		this.classNum = classNum;
	}
	
	// Student 클래스의 헥심기능
	public void printStudentInfo() {
		
		// System.out.println('이름: '+ getName()); 이렇게 작은따옴표 쓰면서 왜 에러 뜨는지 모르고 있었다.
		// 여기 '파이썬' 아니야 "자바"야...
		
		System.out.println("이름: "+ getName());
		System.out.println("나이: " + getAge());
		System.out.println("학년: " + getGradeNum());
		System.out.println("반(1/2 아님): " + getClassNum());
	}
	
	
	

}
