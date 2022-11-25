package com.dw.emp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dw.emp.service.DeptService;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin
public class DeptController {

	@Autowired
	private DeptService deptService;
	
}
