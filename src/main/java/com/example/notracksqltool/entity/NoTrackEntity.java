package com.example.notracksqltool.entity;

public class NoTrackEntity {
    /**
     * 表名称
     */
    private String tableName;
    /**
     * 是否需要回滚，默认回滚
     */
    private Boolean needRollback = true;

    /**
     * 删除条件
     */
    private String whereCond;

    /**
     * 插入语句
     */
    private String addSql;

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public Boolean getNeedRollback() {
        return needRollback;
    }

    public void setNeedRollback(Boolean needRollback) {
        this.needRollback = needRollback;
    }

    public String getWhereCond() {
        return whereCond;
    }

    public void setWhereCond(String whereCond) {
        this.whereCond = whereCond;
    }

    public String getAddSql() {
        return addSql;
    }

    public void setAddSql(String addSql) {
        this.addSql = addSql;
    }
}
