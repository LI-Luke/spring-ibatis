package tw.com.luke.service.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tw.com.luke.config.DataSourceContextHolder;
import tw.com.luke.mapper.StudentMapper;
@Service
public class TestService {
	private static final Logger log = LoggerFactory.getLogger(TestService.class);
	@Autowired
	private StudentMapper studentMapper;
	public void getDate(String string) {
		System.out.println(DataSourceContextHolder.getDBType());
		if(!string.equals(DataSourceContextHolder.getDBType())){
			DataSourceContextHolder.setDBType(string);
		}
		log.info(studentMapper.selectByPrimaryKey(24).toString());
	}
}
