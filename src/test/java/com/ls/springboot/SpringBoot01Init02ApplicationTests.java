package com.ls.springboot;

import com.ls.springboot.beam.Emp;
import com.ls.springboot.service.EmpService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
public class SpringBoot01Init02ApplicationTests {
    @Autowired
    Emp emp;
    @Autowired
    ApplicationContext context;
    @Test
    public void getXml(){
        EmpService empService = (EmpService)context.getBean("empService2");
         empService.add();
    }
    @Test
    public void contextLoads() {
        System.out.println(emp);
    }

}
