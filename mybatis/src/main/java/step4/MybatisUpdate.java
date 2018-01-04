package step4;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MybatisUpdate {
    public static void main(String[] args) throws Exception {
        
        InputStream inputStream = Resources.getResourceAsStream("step4/mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        
        Map<String,Object> data = new HashMap<>();
        data.put("no",10);
        data.put("title", "제목 변경");
        data.put("conts", "내용 변경");
        
        int count = sqlSession.insert("JdbcTestMapper.update", data);

        sqlSession.commit();
        System.out.printf("%d개 가 변경되었습니다.\n",count);
        
        sqlSession.close();
    }
}
