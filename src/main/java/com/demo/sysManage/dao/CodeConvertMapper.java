package com.demo.sysManage.dao;

import com.demo.sysManage.model.CodeConvert;
import org.apache.ibatis.annotations.Param;

public interface CodeConvertMapper {
    /**
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(@Param("codeType") String codeType, @Param("codeCode") String codeCode);

    /**
     *
     * @mbggenerated
     */
    int insert(CodeConvert record);

    /**
     *
     * @mbggenerated
     */
    int insertSelective(CodeConvert record);

    /**
     *
     * @mbggenerated
     */
    CodeConvert selectByPrimaryKey(@Param("codeType") String codeType, @Param("codeCode") String codeCode);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(CodeConvert record);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(CodeConvert record);
}