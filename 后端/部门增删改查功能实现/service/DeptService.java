package com.litao.service;

import com.litao.pojo.Dept;

import java.util.List;

public interface DeptService {
    /**
     * 查询所有部门的数据
     */
    List<Dept> findAll();


    /**
     * 根据id删除操作
     */
    void deleteById(Integer id);


    /**
     * 新增部门
     */
    void add(Dept dept);

    /**
     * 根据ID查询部门
     */
    Dept getById(Integer id);

    /**
     * 修改部门
     */
    void updateById(Dept dept);
}
