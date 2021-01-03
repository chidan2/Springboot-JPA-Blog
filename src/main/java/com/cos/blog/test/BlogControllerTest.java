package com.cos.blog.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
//특정 어노테이션이 붙어 있는 클래스 파일들을 new 해서 (IoC) 스프링 컨테이너에 관리해준다.

@RestController

public class BlogControllerTest {

	//http://localhost:8080/test/hello
	@GetMapping("/test/hello")
	public String hello() {
		return "<h1>hello spring boot</h1>";
	}

}
