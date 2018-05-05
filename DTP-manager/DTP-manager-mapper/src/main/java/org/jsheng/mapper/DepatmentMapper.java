package org.jsheng.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.jsheng.bean.Depatment;
import org.jsheng.bean.DepatmentExample;

public interface DepatmentMapper {
    long countByExample(DepatmentExample example);

    int deleteByExample(DepatmentExample example);

    int deleteByPrimaryKey(Integer deptId);

    int insert(Depatment record);

    int insertSelective(Depatment record);

    List<Depatment> selectByExample(DepatmentExample example);

    Depatment selectByPrimaryKey(Integer deptId);

    int updateByExampleSelective(@Param("record") Depatment record, @Param("example") DepatmentExample example);

    int updateByExample(@Param("record") Depatment record, @Param("example") DepatmentExample example);

    int updateByPrimaryKeySelective(Depatment record);

    int updateByPrimaryKey(Depatment record);
}