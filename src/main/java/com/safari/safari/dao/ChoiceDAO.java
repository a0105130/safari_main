package com.safari.safari.dao;

import com.safari.safari.common.Common;
import com.safari.safari.vo.ChoiceVO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ChoiceDAO {
    Connection conn = null;
    PreparedStatement pstmt = null;
    ResultSet rs = null;

    public List<ChoiceVO> selectChoiceInfo(){
        List<ChoiceVO> cvl = new ArrayList<>();
        try{
            conn = Common.getConnection();
            String sql = "SELECT InfoDetails\n" +
                    "                    FROM Information WHERE TYPEID = 1";
            pstmt = conn.prepareStatement(sql);
            rs = pstmt.executeQuery();

            while(rs.next()){
                String InfoDetails = rs.getString("InfoDetails");

                cvl.add(new ChoiceVO(InfoDetails));

            }
            Common.close(rs);
            Common.close(pstmt);
            Common.close(conn);
        }catch(Exception e) {
            e.printStackTrace();
        }
        return cvl;
    }

    public List<ChoiceVO> selectChoiceInfo2(){
        List<ChoiceVO> cvl = new ArrayList<>();
        try{
            conn = Common.getConnection();
            String sql = "SELECT InfoDetails\n" +
                    "                    FROM Information WHERE TYPEID = 2";
            pstmt = conn.prepareStatement(sql);
            rs = pstmt.executeQuery();

            while(rs.next()){
                String InfoDetails = rs.getString("InfoDetails");

                cvl.add(new ChoiceVO(InfoDetails));

            }
            Common.close(rs);
            Common.close(pstmt);
            Common.close(conn);
        }catch(Exception e) {
            e.printStackTrace();
        }
        return cvl;
    }

    public List<ChoiceVO> selectChoiceInfo3(){
        List<ChoiceVO> cvl = new ArrayList<>();
        try{
            conn = Common.getConnection();
            String sql = "SELECT InfoDetails\n" +
                    "                    FROM Information WHERE TYPEID = 3";
            pstmt = conn.prepareStatement(sql);
            rs = pstmt.executeQuery();

            while(rs.next()){
                String InfoDetails = rs.getString("InfoDetails");

                cvl.add(new ChoiceVO(InfoDetails));

            }
            Common.close(rs);
            Common.close(pstmt);
            Common.close(conn);
        }catch(Exception e) {
            e.printStackTrace();
        }
        return cvl;
    }


}
