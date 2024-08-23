// src/main/java/com/example/coreproject/chap04_02/aspect/LoggingAndSecurityAspect.java
package com.example.coreproject.chap04_02.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAndSecurityAspect {

    @Around("execution(* com.example.coreproject.chap04_02.service.UserService.getUserDetails(..))")
    public Object logExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable {
        long startTime = System.currentTimeMillis();

        System.out.println("실행시간 측정 시작!!");
        Object result = joinPoint.proceed(); // 실제 메서드 실행

        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;
        System.out.println("실행 시간: " + executionTime + "ms");

        return result;
    }


    @Before("execution(* com.example.coreproject.chap04_02.service.UserService.performAdminTask(..))")
    public void checkUserAuthorization() {
        // 여기서는 간단히 관리자 권한을 가진 사용자만이 작업을 수행할 수 있다고 가정
        // 실제 애플리케이션에서는 인증된 사용자 정보를 가져와 권한을 검사해야 함
        String currentUser = "user"; // 예를 들어, 현재 사용자를 "user"로 설정
        if (!"admin".equals(currentUser)) {
            throw new SecurityException("접근 거부: 관리자 권한이 필요합니다.");
        }
    }
}
