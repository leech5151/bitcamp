package java100.app.src38_40.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import java100.app.domain.Board;
import java100.app.src38_40.util.DataSource;

public class BoardDao {

    public List<Board> selectList(){
        Connection con = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        
        try {
            con = DataSource.getConnection();
            pstmt = con.prepareStatement(
                    "select no,title,conts,vwcnt from ex_board");
                    rs = pstmt.executeQuery();

            ArrayList<Board> list = new ArrayList<>();

            while (rs.next()) {
                Board Board = new Board(
                        rs.getInt("no"),
                        rs.getString("title"),
                        rs.getString("conts"));
                list.add(Board);
            }

            return list;

        } catch (Exception e) {
            throw new DaoException(e);
        } finally {
            try {rs.close();} catch(Exception e) {}
            try {pstmt.close();} catch(Exception e) {}
            DataSource.returnConnection(con);
        }
    }

    public int insert(Board Board) {
        Connection con = null;
        PreparedStatement pstmt = null;
        try {
            con = DataSource.getConnection();
            pstmt = con.prepareStatement(
                    "insert into ex_board(title,conts,regdt)"
                            + " values(?,?,now())");

            pstmt.setString(1, Board.getTitle());
            pstmt.setString(2, Board.getContent());

            return pstmt.executeUpdate();

        } catch (Exception e) {
            throw new DaoException(e);
        }
    }

    public int update(Board Board) {
        Connection con = null;
        PreparedStatement pstmt = null;
        try {
            con = DataSource.getConnection();
            pstmt = con.prepareStatement(
                    "update ex_board set title=?, conts=? where no=?");
            
            pstmt.setString(1, Board.getTitle());
            pstmt.setString(2, Board.getContent());
            pstmt.setInt(3, Board.getNo());


            return pstmt.executeUpdate();
        } catch (Exception e) {
            throw new DaoException(e);
        } finally {
            try {pstmt.close();} catch(Exception e) {}
            DataSource.returnConnection(con);
        }
    }

    public int delete(int no) {
        Connection con = null;
        PreparedStatement pstmt = null;
        try {
            con = DataSource.getConnection();
            pstmt = con.prepareStatement(
                    "delete from ex_board where no=?");

            pstmt.setInt(1, no);

            return pstmt.executeUpdate();

        } catch (Exception e) {
            throw new DaoException(e);
        } finally {
            try {pstmt.close();} catch(Exception e) {}
            DataSource.returnConnection(con);
        }
    }

    @SuppressWarnings("resource")
    public Board selectOne(int no) {
        Connection con = null;
        PreparedStatement pstmt = null;
        try {
            
            try {
                con = DataSource.getConnection();
                pstmt = con.prepareStatement(
                        "update ex_board set vwcnt = vwcnt + 1 where no=?");
                pstmt.setInt(1, no);
                pstmt.executeUpdate();
            } catch (Exception e) {throw e;}
            
            try {
                con = DataSource.getConnection();
                pstmt = con.prepareStatement(
                        "select no,title,conts,regdt,vwcnt from ex_board where no=?");
                pstmt.setInt(1, no);
                
                ResultSet rs = pstmt.executeQuery();
                
                Board board = null;
                
                if (rs.next()) {
                    board = new Board();
                    board.setNo(no);
                    board.setTitle(rs.getString("title"));
                    board.setContent(rs.getString("contens"));
                    board.setRegDate(rs.getDate("regdt"));
                    board.setViewCount(rs.getInt("vwcnt"));
                    
                } 
                
                rs.close();
                return board;
            } catch (Exception e) {throw e;}
            
        } catch (Exception e) {
            throw new DaoException(e);
        } finally {
            try {pstmt.close();} catch(Exception e) {}
            DataSource.returnConnection(con);
        }
    }
}