package com.boot.app.emp.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.boot.app.emp.service.EmpService;
import com.boot.app.emp.service.EmpVO;

@RestController
public class EmpRestController {
	@Autowired
	EmpService empService;
	
	// 전체조회
	@GetMapping("empAllList")
	public List<EmpVO> empList(Model model){
		return empService.getEmpList(null);
	}
}
