package com.Darshan.TKA.AOP.Project;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	@RequestMapping("Aoppp")
	public String aopp() {
		return "hello Coustomer";
	}
}
