package com.xjz.ssmshiro.core.feature.orm.dialect;

public class MySql5Dialect extends Dialect {

    protected static final String SQL_END_DELIMITER = ";";

    @Override
    public String getLitmitString(String sql, int offset, int limit) {
        return MySql5PageHelper.getLimitString(sql,offset,limit);
    }

    @Override
    public String getCountString(String sql) {
        return MySql5PageHelper.getCountString(sql);
    }
}
