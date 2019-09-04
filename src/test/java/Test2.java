import com.githup.mybatis.dao.UserMapper;
import com.githup.mybatis.pojo.User;
import com.githup.mybatis.util.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;

import java.io.IOException;

public class Test2 {
public static void main(String[] args) {
	SqlSession sqlSession;
	try {
		//获取session对象
		sqlSession = SqlSessionUtil.getSqlsession();
		//通过sqlsession获取UserMapper对象
		UserMapper userMapper=sqlSession.getMapper(UserMapper.class);
		//通过UserMapper来执行各种操作
//		List<User> userist=userMapper.findUser();
		User user=userMapper.findUserByUserName("敏");
		//迭代userList
//		for (User user : userList) {
//			System.out.println(user);
//		}
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
