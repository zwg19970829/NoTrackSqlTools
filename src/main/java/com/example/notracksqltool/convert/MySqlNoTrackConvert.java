package com.example.notracksqltool.convert;

import com.example.notracksqltool.entity.NoTrackEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * MySQL无轨迹转换器
 */
public class MySqlNoTrackConvert extends AbstractSqlNoTrackConvert {

    private static final Logger LOGGER = LoggerFactory.getLogger(MySqlNoTrackConvert.class);

    @Override
    public String convertDelete(String sql, NoTrackEntity noTrackEntity) {

        return null;
    }

    @Override
    public String convertInsert(String sql, NoTrackEntity noTrackEntity) {
        noTrackEntity.setWhereCond("");
        noTrackEntity.setAddSql(sql.charAt(sql.length() - 1) == ';' ? sql.substring(0, sql.length() - 1) : sql);
        return null;
    }
}
