package com.boot.app.emp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boot.app.emp.mapper.EmpMapper;
import com.boot.app.emp.service.EmpService;
import com.boot.app.emp.service.EmpVO;

@Service
public class EmpServiceImpl implements EmpService{

	@Autowired
	EmpMapper empMapper;
	
	@Override
	public EmpVO getEmp(EmpVO empVO) {
		return empMapper.getEmp(empVO);
	}

	@Override
	public List<EmpVO> getEmpList(EmpVO empVO) {
		return empMapper.getEmpList(empVO);
	}

	@Override
	public void empInsert(EmpVO empVO) {
		empMapper.empInsert(empVO);
	}

}
