package step9;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MybatisInsert {
    public static void main(String[] args) throws Exception {
        
        BoardDao boardDao = new BoardDao();
        boardDao.setSqlSessionFactory(SqlSessionBean.getObject());
        
        Board board = new Board();
        board.setTitle("오호라~ 제목이래요!2");
        board.setContents("내용이드래요~~~~2");
        
        int count = boardDao.insert(board);

        System.out.printf("%d개가 입력되었습니다.\n",count);
        
    }
}
