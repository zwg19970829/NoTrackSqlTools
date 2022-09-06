package com.example.notracksqltool.convert;

import com.example.notracksqltool.configuration.MysqlPropertiesConfiguration;
import com.example.notracksqltool.entity.NoTrackEntity;
import com.example.notracksqltool.utils.NoTrackSqlBuildUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * MySQL无轨迹转换器
 */
@Component
public class MySqlNoTrackConvert extends AbstractSqlNoTrackConvert {

    @Autowired
    private MysqlPropertiesConfiguration propertiesConfiguration;

    private static final Logger LOGGER = LoggerFactory.getLogger(MySqlNoTrackConvert.class);

    @Override
    public String convertDelete(String sql, NoTrackEntity noTrackEntity) {

        return null;
    }

    @Override
    public String convertInsert(String delSql, String addSql, NoTrackEntity noTrackEntity) {
        delSql = delSql.charAt(delSql.length() - 1) == ';' ? delSql.substring(0, delSql.length() - 1) : delSql;
        noTrackEntity.setWhereCond("where" + delSql.split("where")[1]);
        noTrackEntity.setNeedRollback(propertiesConfiguration.getNeedRollBack());
        noTrackEntity.setAddSql(addSql.charAt(addSql.length() - 1) == ';' ? addSql.substring(0, addSql.length() - 1) : addSql);
        return NoTrackSqlBuildUtil.buildInsertData(noTrackEntity, propertiesConfiguration);
    }
}
