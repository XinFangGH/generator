package com.xfanread.service.impl.content.dao;

import com.xfanread.service.impl.content.po.BookEsotericaRecord;
import com.xfanread.service.impl.content.po.BookEsotericaRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BookEsotericaRecordMapper {
    int countByExample(BookEsotericaRecordExample example);

    int deleteByExample(BookEsotericaRecordExample example);

    int insert(BookEsotericaRecord record);

    int insertSelective(BookEsotericaRecord record);

    List<BookEsotericaRecord> selectByExample(BookEsotericaRecordExample example);

    int updateByExampleSelective(@Param("record") BookEsotericaRecord record, @Param("example") BookEsotericaRecordExample example);

    int updateByExample(@Param("record") BookEsotericaRecord record, @Param("example") BookEsotericaRecordExample example);
}