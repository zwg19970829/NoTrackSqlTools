package com.example.notracksqltool.utils;

public class SqlParseUtil {
    /**
     * 根据delete from xxx|insert into xxx来进行切分返回
     * @param sql
     * @return
     */
    public static String getTableNameByDelAndAdd(String sql) {
        String array[] = sql.split(" ");
        return array[2];
    }
}
