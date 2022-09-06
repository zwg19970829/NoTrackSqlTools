package com.example.notracksqltool.convert;

import com.example.notracksqltool.constant.Constants;
import com.example.notracksqltool.entity.NoTrackEntity;
import com.example.notracksqltool.queue.AddAndDelConnectSingleQueue;
import com.example.notracksqltool.utils.SqlParseUtil;
import org.apache.logging.log4j.util.Strings;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractSqlNoTrackConvert implements SqlNoTrackConvert {

    private static final Logger LOGGER = LoggerFactory.getLogger(AbstractSqlNoTrackConvert.class);

    /**
     * 进行sql与无轨迹sql转换
     * @param sqlList sql列表
     * @return 无轨迹sql列表
     */
    public List<String> convert(List<String> sqlList) {
        if (CollectionUtils.isEmpty(sqlList)) {
            return new ArrayList<>();
        }

        List<String> result = new ArrayList<>();
        for (String sql : sqlList) {
            String convertSql = convert(sql);
            if (Strings.isNotBlank(convertSql)) {
                result.add(convertSql);
            }
        }

        return result;
    }

    public String convert(String sql) {
        NoTrackEntity noTrackEntity = new NoTrackEntity();
        noTrackEntity.setTableName(SqlParseUtil.getTableNameByDelAndAdd(sql));

        if (StringUtils.startsWithIgnoreCase(sql, Constants.DELETE)) {
            AddAndDelConnectSingleQueue.put(sql);
            return convertDelete(sql, noTrackEntity);
        }

        if (StringUtils.startsWithIgnoreCase(sql, Constants.INSERT)) {
            String delSql = AddAndDelConnectSingleQueue.get();
            return convertInsert(delSql, sql, noTrackEntity);
        }

        LOGGER.error("Do not support this sql: %s", sql);
        return Strings.EMPTY;
    }

    @Override
    public String convertDelete(String sql, NoTrackEntity noTrackEntity) {
        return Strings.EMPTY;
    }

    @Override
    public String convertInsert(String delSql, String sql, NoTrackEntity noTrackEntity) {
        return Strings.EMPTY;
    }
}
