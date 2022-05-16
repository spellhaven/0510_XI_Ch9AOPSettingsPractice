package com.spellhaven.spring0510_11;

import org.aspectj.lang.ProceedingJoinPoint;

public class LogAop {
	
	public Object loggerAop(ProceedingJoinPoint joinpoint) throws Throwable {
		
		/*
		 사실 나 이 프로젝트 뭔 말인지 몰갣디, joinpoint가 대체 뭐임, ㅋ.
		 5월 16일 월요일부터는 이해가 되기를... "간절히 기원함, ㅋ"
		 https://shlee0882.tistory.com/206 여기 얘기 읽어 보면 좀 더 말이 됨, ㅋ,
		
		 핵심 기능과 공통 기능의 개념을 헷갈리지 말도록 해.
		 
		 업무 로직을 포함하는 기능을 핵심 기능(Core Concerns)
		 핵심 기능을 도와주는 부가적인 기능(로깅, 보안)을 부가기능(Cross-cutting Concerns) 이라고 부른다.
		 우리는 공통 기능이라고도 부른다. (핵심 기능들에 다 곁다리로 들어가는 밑반찬 같은 놈이니까.)
		 
		 짜장면, 짬뽕, 볶음밥... = 핵심 기능
		 단무지, 양파 = 공통 기능
		*/
	
				
		// 공통 기능이 적용될 메소드(joinpoint)의 이름 불러오기
		String signatureStr = joinpoint.getSignature().toShortString();
		
		// joinpoint 메소드의 이름 출력, ㅋ
		System.out.println(signatureStr + "메소드가 시작되었습니다, ㅋ");	
		
		long st = System.currentTimeMillis(); // start time으로 현재 시간 가져오기(밀리초 단위)해 봤다, ㅋ.
		
		
		try {
			Object obj = joinpoint.proceed();  // joinpoint 메소드 ㄱㄱ하는 놈.
			return obj;
		} finally {
			long et = System.currentTimeMillis(); // 느그는 end time이야.
			System.out.println(signatureStr + "메소드가 종료되었디!");
			System.out.println(signatureStr + "경과 시간: " + (et - st)); // et - st 하면 이 메소드가 얼마나 실행됐는지 걸린 시간이 나옴.
		}
			
	}
}
