package com.demo.sysManage.model;

public class CodeConvert {
    /**
     * 码值类型
     */
    private String codeType;

    /**
     * 码值代码
     */
    private String codeCode;

    /**
     * 码值名称
     */
    private String codeName;

    /**
     * 上级代码
     */
    private String upperCode;

    /**
     * 状态：0-无效，1-有效
     */
    private String validStatus;

    /**
     * 补充说明
     */
    private String remark;

    /**
     * 标识字段
     */
    private String flag;

    /**
     * 码值类型
     * @return codeType 码值类型
     */
    public String getCodeType() {
        return codeType;
    }

    /**
     * 码值类型
     * @param codeType 码值类型
     */
    public void setCodeType(String codeType) {
        this.codeType = codeType;
    }

    /**
     * 码值代码
     * @return codeCode 码值代码
     */
    public String getCodeCode() {
        return codeCode;
    }

    /**
     * 码值代码
     * @param codeCode 码值代码
     */
    public void setCodeCode(String codeCode) {
        this.codeCode = codeCode;
    }

    /**
     * 码值名称
     * @return codeName 码值名称
     */
    public String getCodeName() {
        return codeName;
    }

    /**
     * 码值名称
     * @param codeName 码值名称
     */
    public void setCodeName(String codeName) {
        this.codeName = codeName;
    }

    /**
     * 上级代码
     * @return upperCode 上级代码
     */
    public String getUpperCode() {
        return upperCode;
    }

    /**
     * 上级代码
     * @param upperCode 上级代码
     */
    public void setUpperCode(String upperCode) {
        this.upperCode = upperCode;
    }

    /**
     * 状态：0-无效，1-有效
     * @return validStatus 状态：0-无效，1-有效
     */
    public String getValidStatus() {
        return validStatus;
    }

    /**
     * 状态：0-无效，1-有效
     * @param validStatus 状态：0-无效，1-有效
     */
    public void setValidStatus(String validStatus) {
        this.validStatus = validStatus;
    }

    /**
     * 补充说明
     * @return remark 补充说明
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 补充说明
     * @param remark 补充说明
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * 标识字段
     * @return flag 标识字段
     */
    public String getFlag() {
        return flag;
    }

    /**
     * 标识字段
     * @param flag 标识字段
     */
    public void setFlag(String flag) {
        this.flag = flag;
    }
}