package step5;

import java.io.InputStream;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MybatisSelectList {
    public static void main(String[] args) throws Exception {
        
        InputStream inputStream = Resources.getResourceAsStream("step5/mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        
        // <mapper namespace="네임스패이스명">
        List<Board> records = sqlSession.selectList("JdbcTestMapper.findAll");
        
        for(Board board : records) {
            System.out.printf("%d,%s,%s,%s\n", 
                    board.getNo(), 
                    board.getTitle(), 
                    board.getCreateDate(), 
                    board.getViewCount());
        }
        
        sqlSession.close();
    }
}
  