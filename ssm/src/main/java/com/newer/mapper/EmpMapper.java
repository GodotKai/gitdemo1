package com.newer.mapper;

import com.newer.domain.Emp;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author shining
 */
//@Component通用组件注解：任何需要bean容器生产的组件都可使用
//@Repository持久层专用组件注解
public interface EmpMapper {

    @Insert("insert into emp values(null,#{ename}," +
            "#{sal},#{hiredate},#{dept.deptno},#{job})")
    int addEmp(Emp emp);

    @Update("update emp set ename=#{ename},sal=#{sal},hiredate=#{hiredate}," +
            "deptno=#{dept.deptno} where empno=#{empNo}")
    int updateEmp(Emp emp);

    @Delete("delete from emp where empno=#{empno}")
    int deleteEmp(@Param("empno") int empno);

    @Results(value = {@Result(property = "empNo",column = "empno",id = true),
                        @Result(property = "ename",column = "ename"),
                        @Result(property = "sal",column = "sal"),
                        @Result(property = "hiredate",column = "hiredate"),
                        @Result(property = "dept",javaType = com.newer.domain.Dept.class,
                        column = "deptno",one = @One(select = "com.newer.mapper.DeptMapper.findByNo"))})
    @Select("select * from emp where empno=#{empno}")
    Emp findById(@Param("empno") int empno);


    @ResultMap(value = "com.newer.mapper.EmpMapper.emp1")
    @Select("select empno,ename,sal,hiredate,e.deptno,dname " +
            "from emp e left join dept d on e.deptno=d.deptno ")
    List<Emp> findAll();

}
