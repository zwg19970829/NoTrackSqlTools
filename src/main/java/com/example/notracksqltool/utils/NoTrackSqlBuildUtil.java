package com.example.notracksqltool.utils;

import com.example.notracksqltool.configuration.PropertiesConfiguration;
import com.example.notracksqltool.entity.NoTrackEntity;

public class NoTrackSqlBuildUtil {
    public static String buildInsertData(NoTrackEntity noTrackEntity, PropertiesConfiguration propertiesConfiguration) {
        return String.format(propertiesConfiguration.getTemplate(),
                noTrackEntity.getTableName(),
                noTrackEntity.getNeedRollback(),
                noTrackEntity.getWhereCond(),
                noTrackEntity.getAddSql());
    }
}
