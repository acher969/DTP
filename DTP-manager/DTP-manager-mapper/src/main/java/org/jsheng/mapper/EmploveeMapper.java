package org.jsheng.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.jsheng.bean.Emplovee;
import org.jsheng.bean.EmploveeExample;

public interface EmploveeMapper {
    long countByExample(EmploveeExample example);

    int deleteByExample(EmploveeExample example);

    int deleteByPrimaryKey(Integer empId);

    int insert(Emplovee record);

    int insertSelective(Emplovee record);

    List<Emplovee> selectByExample(EmploveeExample example);

    Emplovee selectByPrimaryKey(Integer empId);

    List<Emplovee> selectByExampleWithDept(EmploveeExample example);

    Emplovee selectByPrimaryKeyWithDept(Integer empId);

    int updateByExampleSelective(@Param("record") Emplovee record, @Param("example") EmploveeExample example);

    int updateByExample(@Param("record") Emplovee record, @Param("example") EmploveeExample example);

    int updateByPrimaryKeySelective(Emplovee record);

    int updateByPrimaryKey(Emplovee record);
}