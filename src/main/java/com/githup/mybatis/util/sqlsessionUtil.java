package com.githup.mybatis.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class SqlSessionUtil {
    //私有化构造
    private SqlSessionUtil(){};
    //提供静态的获取sessionUtil的实例
    public static SqlSessionFactory sqlSessionFactory;
    //使用单例模式
    public static SqlSessionFactory getSqlSessionFactoryInstence() throws IOException {
        if(sqlSessionFactory==null){
            InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
        }
        return sqlSessionFactory;
    }
    public static SqlSession getSqlsession()throws  IOException{
        return getSqlSessionFactoryInstence().openSession(false);
    }
    public static  void  closeSqlSession(SqlSession sqlSession){
        sqlSession.close();
    }
}
