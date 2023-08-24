package com.boot.app.emp.mapper;

import java.util.List;

import com.boot.app.emp.service.EmpVO;

public interface EmpMapper {
	// 전체조회
	public List<EmpVO> selectAllEmp();
	
	// 단건조회
	public EmpVO selectEmpInfo(EmpVO empVO);
	
	// 등록
	public int insertEmpInfo(EmpVO empVO);
}
