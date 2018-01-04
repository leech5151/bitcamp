package step2;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;


public class MybatisTest {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = Resources.getResourceAsStream("step2/mybatis-config.xml");
        
        // SqlSessionFactoryBuilder 역할
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        
        // SqlSessionFactory 역할
        SqlSession sqlSession = sqlSessionFactory.openSession();
        
        // SqlSession 역할
        sqlSession.close();
        System.out.println("종료");
    }
}
