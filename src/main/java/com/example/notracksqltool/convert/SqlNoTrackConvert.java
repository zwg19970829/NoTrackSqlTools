package com.example.notracksqltool.convert;

import com.example.notracksqltool.entity.NoTrackEntity;

import java.util.List;

public interface SqlNoTrackConvert {

    List<String> convert(List<String> sqlList);

    String convert(String sql);

    String convertDelete(String sql, NoTrackEntity noTrackEntity);

    String convertInsert(String sql, NoTrackEntity noTrackEntity);
}
