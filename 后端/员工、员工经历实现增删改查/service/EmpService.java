package com.litao.service;

import com.litao.mapper.EmpMapper;
import com.litao.pojo.Emp;
import com.litao.pojo.EmpQueryParam;
import com.litao.pojo.LoginInfo;
import com.litao.pojo.PageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.List;

public interface EmpService {

    PageResult<Emp> page(EmpQueryParam empQueryParam);

    /**
     * 新增员工信息
     */
    void save(Emp emp);

    /**
     * 批量删除员工信息
     */
    void delete(List<Integer> ids);
    /**
     * 根据ID查询员工的详细信息
     */
    Emp getInfo(Integer id);

    /**
     * 更新员工信息
     * @param emp
     */
    void update(Emp emp);
    /**
     * 登录
     */
    LoginInfo login(Emp emp);


    //PageResult<Emp> page(Integer page, Integer pageSize,String name, Integer gender, LocalDate begin, LocalDate end);
}
