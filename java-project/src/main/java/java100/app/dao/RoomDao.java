package java100.app.dao;

import java.util.List;

import java100.app.domain.Room;

public interface RoomDao {
    public List<Room> selectList();
    public int insert(Room room); 
    public int delete(int no) ;
    public Room selectOne(int no);
}