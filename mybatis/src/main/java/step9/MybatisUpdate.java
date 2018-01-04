package step9;

public class MybatisUpdate {
    public static void main(String[] args) throws Exception {
        
        BoardDao boardDao = new BoardDao();
        boardDao.setSqlSessionFactory(SqlSessionBean.getObject());
        
        Board board = new Board();
        board.setNo(20);
        board.setTitle("제목 변경2");
        board.setContents("내용 변경2");
        
        
        int count = boardDao.update(board);

        System.out.printf("%d개 가 변경되었습니다.\n",count);
        
    }
}
