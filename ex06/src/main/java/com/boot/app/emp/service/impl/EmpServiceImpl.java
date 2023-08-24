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
	
	// 전체조회
	@Override
	public List<EmpVO> getEmpList() {
		return empMapper.selectAllEmp();
	}
	//단건조회
	@Override
	public EmpVO getEmp(EmpVO emp) {
		return empMapper.selectEmpInfo(emp);
	}
	//등록
	@Override
	public int insertEmp(EmpVO emp) {
		return empMapper.insertEmpInfo(emp);
	}

}
