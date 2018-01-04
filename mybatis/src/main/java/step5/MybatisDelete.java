package step5;

import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MybatisDelete {
    public static void main(String[] args) throws Exception {
        
        InputStream inputStream = Resources.getResourceAsStream("step5/mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        
        
        int count = sqlSession.delete("JdbcTestMapper.delete", 15);

        sqlSession.commit();
        System.out.printf("%d개가 삭제되었습니다.\n",count);
        
        sqlSession.close();
    }
}
