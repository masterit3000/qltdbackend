package com.qltd.backend;

import com.qltd.backend.dto.Result;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class QltdbackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(QltdbackendApplication.class, args);
                Result<String> r = new Result<>();
               
	}
}
