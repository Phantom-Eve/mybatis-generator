package com.htsc.ocrm.core.service.strategy.entity;

import java.util.Date;

public class BusinessStrategyPO {
    private String id;

    private String strategyName;

    private String strategyType;

    private String setTarget;

    private String selectPersons;

    private String strategyState;

    private Date createTime;

    private String createUser;

    private Date updateTime;

    private String updateUser;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStrategyName() {
        return strategyName;
    }

    public void setStrategyName(String strategyName) {
        this.strategyName = strategyName;
    }

    public String getStrategyType() {
        return strategyType;
    }

    public void setStrategyType(String strategyType) {
        this.strategyType = strategyType;
    }

    public String getSetTarget() {
        return setTarget;
    }

    public void setSetTarget(String setTarget) {
        this.setTarget = setTarget;
    }

    public String getSelectPersons() {
        return selectPersons;
    }

    public void setSelectPersons(String selectPersons) {
        this.selectPersons = selectPersons;
    }

    public String getStrategyState() {
        return strategyState;
    }

    public void setStrategyState(String strategyState) {
        this.strategyState = strategyState;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }
}