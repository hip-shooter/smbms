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
//		User user=userMapper.findUserByUserName("敏");
			//迭代userList
//		for (User user : userList) {
//			System.out.println(user);
//		}
			//1适用对象来传参数
//			User user = new User();
//			user.setUserName("敏");
//			user.setUserRole(2);
//			user =userMapper.findUserByUserNameAndUserRole(user);
			//2.多个参数使用map集合传参
//			Map<String, Object> map = new HashMap<>();
//			map.put("userName","敏");
//			map.put("userRole",2);
//			User user =userMapper.findUserByMap(map);
			//3.多参数
			User user =userMapper.findUserByUserNameAndUserRole1("敏",2);
			System.out.println(user);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
