package com.litao.mapper;

import com.litao.pojo.EmpExpr;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 员工工作经历
 */
@Mapper
public interface EmpExprMapper {
    /**
     * 批量保存员工的工作经历
     */

    void insertBatch(List<EmpExpr> exprList);

    /**
     * 根据员工id批量删除工作经历信息
     */
    void deleteByEmpIds(List<Integer> empIds);
}
