package step6;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MybatisSelect1 {
    public static void main(String[] args) throws Exception {
        
        InputStream inputStream = Resources.getResourceAsStream("step6/mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        
        // <mapper namespace="네임스패이스명">
        Board board = sqlSession.selectOne("JdbcTestMapper.findByNo",19);
        
            System.out.printf("번호=%d\n", board.getNo());
            System.out.printf("제목=%s\n", board.getTitle());
            System.out.printf("내용=%s\n", board.getContents());
            System.out.printf("날짜=%s\n", board.getCreateDate());
            System.out.printf("조회수=%d\n", board.getViewCount());
        
        sqlSession.close();
    }
}
