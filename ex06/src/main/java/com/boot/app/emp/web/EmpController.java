package com.boot.app.emp.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.boot.app.emp.service.EmpService;
import com.boot.app.emp.service.EmpVO;

@Controller
public class EmpController {

	@Autowired
	EmpService empService;
	
	// 전체조회
	@GetMapping("empList")
	public String empList(Model model) {
		model.addAttribute("empList", empService.getEmpList());
		return "empList";
	}
	
	// 단건조회
	@GetMapping("empInfo")
	public String empInfo(Model model, EmpVO empVO) {
		EmpVO findEmp = empService.getEmp(empVO);
		model.addAttribute("empInfo",findEmp);
		return "empInfo";
	}	
	// 등록 - 페이지
	
	// 등록 - 처리
}
