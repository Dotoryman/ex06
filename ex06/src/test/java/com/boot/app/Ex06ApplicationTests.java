package com.boot.app;

import org.jasypt.encryption.StringEncryptor;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Ex06ApplicationTests {
	@Autowired
	StringEncryptor jasyptStringEncryptor;
	
	@Test
	void contextLoads() {
		// 테스트 끝나면 지우기!
		String[] datas = {
				"oracle.jdbc.OracleDriver"
				,"jdbc:oracle:thin:@127.0.0.1:1521/xe"
				,"hr"
				,"hr"
		};
		
		for(String data : datas) {
			String enyData = jasyptStringEncryptor.encrypt(data);
			System.out.println(enyData);
		}
	}

}
