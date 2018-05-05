package org.jsheng;

import java.util.List;
import java.util.UUID;

import org.apache.ibatis.session.SqlSession;
import org.jsheng.bean.Depatment;
import org.jsheng.bean.Emplovee;
import org.jsheng.mapper.DepatmentMapper;
import org.jsheng.mapper.EmploveeMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext.xml" })
public class MapperTest {

	@Autowired
	DepatmentMapper deptMapper;

	@Autowired
	EmploveeMapper empMapper;
	@Autowired
	SqlSession sqlSession;

	@Test
	public void test1(){
		System.out.println(deptMapper);

		empMapper.insertSelective(new Emplovee(null,"Jerry","男","Jerry@guigu.com",1));
	}
	@Test
	public void testCRUD() {

		// 批量插入
		EmploveeMapper mapperPL = sqlSession.getMapper(EmploveeMapper.class);
		for (int i = 0; i < 1000; i++) {
			String uid = UUID.randomUUID().toString().substring(0, 5) + i;
			mapperPL.insert(new Emplovee(null,"Jerry"+ uid,"男","Jerry@guigu.com",1));
		}

//		List<Example> list=mapper.selectByExample(null);
//		for (Example example : list) {
//			System.out.println("ID"+example.getId());
//			System.out.println("姓名"+example.getName());
//			System.out.println("性别"+example.getSex());
//		}
	}
}
