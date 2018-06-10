package com.qltd.backend;

import com.cmeza.sdgenerator.annotation.SDGenerator;
import com.qltd.backend.dto.Result;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SDGenerator(
//        entityPackage = "com.qltd.backend.entity",
//        repositoryPackage = "com.qltd.backend.repositories",
//        managerPackage = "com.qltd.backend.service",
//        repositoryPostfix = "Repository",
//        managerPostfix = "Service",
//        onlyAnnotations = false,
//        debug = false,
//        overwrite = false
//)
@SpringBootApplication
public class QltdbackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(QltdbackendApplication.class, args);
//        Result<String> r = new Result<>();

    }
}
