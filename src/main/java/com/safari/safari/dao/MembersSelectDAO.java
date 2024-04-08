package com.safari.safari.dao;

import com.safari.safari.common.Common;
import com.safari.safari.vo.MembersVO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.*;



public class MembersSelectDAO {

    Connection conn = null;
    PreparedStatement pstmt = null;
    ResultSet rs = null;

    public List<MembersVO> selectMembersInfo(){
        List<MembersVO> mvl = new ArrayList<>();
        try{
            conn = Common.getConnection();
            String sql = "SELECT USER_ID, USER_PW, USER_NAME, USER_EMAIL, USER_PHONE\n" +
                    "                    FROM MEMBERS";
            pstmt = conn.prepareStatement(sql);
            rs = pstmt.executeQuery();

            while(rs.next()){
                String UserId = rs.getString("USER_ID");
                String Password = rs.getString("USER_PW");
                String UserName = rs.getString("USER_NAME");
                String Email = rs.getString("USER_EMAIL");
                String Phone = rs.getString("USER_PHONE");

                mvl.add(new MembersVO(UserId,Password,UserName,Email,Phone));

            }
            Common.close(rs);
            Common.close(pstmt);
            Common.close(conn);
        }catch(Exception e) {
            e.printStackTrace();
        }
        return mvl;
    }




}