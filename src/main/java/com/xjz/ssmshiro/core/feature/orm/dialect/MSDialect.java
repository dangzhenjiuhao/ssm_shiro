package com.xjz.ssmshiro.core.feature.orm.dialect;

/**
 * MSSQL 数据库方言
 */
public class MSDialect extends Dialect {
    protected  static final String SQL_END_DELIMITER = ";";
    @Override
    public String getLitmitString(String sql, int offset, int limit) {
        return MSPageHelper.getLimitString(sql, offset, limit);
    }

    @Override
    public String getCountString(String sql) {
        return MSPageHelper.getCountString(sql);
    }
}
