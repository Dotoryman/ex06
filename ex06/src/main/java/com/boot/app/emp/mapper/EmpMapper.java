package com.boot.app.emp.mapper;

import java.util.List;

import com.boot.app.emp.service.EmpVO;

public interface EmpMapper {
	public EmpVO getEmp(EmpVO empVO);
	public List<EmpVO> getEmpList(EmpVO empVO);
	public void empInsert(EmpVO empVO);
}