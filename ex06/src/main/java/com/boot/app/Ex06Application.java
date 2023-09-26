package com.boot.app;

import java.io.FileInputStream;
import java.net.http.HttpHeaders;
import java.util.HashMap;
import java.util.List;

import org.apache.tomcat.util.http.parser.MediaType;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.boot.app.emp.service.EmpService;
import com.boot.app.emp.service.EmpVO;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
@Controller
@SpringBootApplication
@MapperScan(basePackages = "com.boot.app.**.mapper" )
public class Ex06Application {

	public static void main(String[] args) {
		SpringApplication.run(Ex06Application.class, args);
	}
	
}
