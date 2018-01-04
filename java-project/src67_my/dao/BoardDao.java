package java100.app.dao;

import java.util.List;
import java.util.Map;

import java100.app.domain.Board;

public interface BoardDao {
    List<Board> selectList();
    Board selectOne(int no);
    void upView(int no);
    int insert(Board board);
    int update(Board board);
    int delete(int no);
}














