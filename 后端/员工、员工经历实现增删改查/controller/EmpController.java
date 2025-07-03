package com.litao.controller;


import com.litao.pojo.Emp;
import com.litao.pojo.EmpQueryParam;
import com.litao.pojo.PageResult;
import com.litao.pojo.Result;
import com.litao.service.EmpService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

/**
 * 员工管理Controller
 */
@Slf4j
@RequestMapping("/emps")
@RestController
public class EmpController {

    @Autowired
    public EmpService empService;

    /**
     * 分页查询
     */

    @GetMapping
    public Result page(EmpQueryParam empQueryParam){
        log.info("分页查询：{}",empQueryParam);
        PageResult<Emp> pageResult =  empService.page(empQueryParam);
        return Result.success(pageResult);

    }
    @PostMapping
    public Result save(@RequestBody Emp emp){
        log.info("新增员工：{}", emp);
        empService.save(emp);
        return Result.success();
    }

    /**
     * 删除员工-List
     */
    @DeleteMapping
    public Result delete(@RequestParam List<Integer> ids){
        log.info("删除员工：{}", ids);
        empService.delete(ids);
        return Result.success();
    }
    /**
     * 查询回显
     */
    @GetMapping("/{id}")
    public Result getInfo(@PathVariable Integer id){
        log.info("根据id查询员工的详细信息");
        Emp emp  = empService.getInfo(id);
        return Result.success(emp);
    }
    /**
     * 更新员工信息
     */
    @PutMapping
    public Result update(@RequestBody Emp emp){
        log.info("修改员工信息, {}", emp);
        empService.update(emp);
        return Result.success();
    }





}
