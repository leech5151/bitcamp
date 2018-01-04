package step11;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MybatisUpdate {
    public static void main(String[] args) throws Exception {
        
        ClassPathXmlApplicationContext iocContainer = 
                new ClassPathXmlApplicationContext("step11/application-context.xml");
        
        BoardDao boardDao = iocContainer.getBean(BoardDao.class);
        Board board = new Board();
        board.setNo(20);
        board.setTitle("제목 변경23");
        board.setContents("내용 변경23");
        
        
        int count = boardDao.update(board);

        System.out.printf("%d개 가 변경되었습니다.\n",count);
        
    }
}
