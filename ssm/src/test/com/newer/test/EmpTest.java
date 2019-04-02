package com.newer.test;

import com.newer.domain.Emp;
import com.newer.service.EmpService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author shining
 */
public class EmpTest {

    @Test
    public void test1(){
        ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
        EmpService empService=ctx.getBean("empServiceImpl",EmpService.class);
        Emp emp=empService.findById(2000);

        emp.setSal(4892d);
        empService.updateEmp(emp);

        empService.findAll().forEach(emp1 -> {
            System.out.println(emp1.getEname()+"\t"+emp1.getDept().getDname());
        });
    }
}
