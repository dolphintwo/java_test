package com.dolphin.jdbc_demo;
import java.sql.*;


public class practices {
    public static void main(String[] args){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Connecting to database...");
            Connection conn = DriverManager.getConnection("jdbc:mysql://60.205.231.165:3306/test?useSSL=false","jdbctest","jdbctest");

            System.out.println("Creating Statement...");
            Statement stmt = conn.createStatement();
            String sql;
            sql = "select id,age from Employees;";
            ResultSet rs = stmt.executeQuery(sql);

            while(rs.next()){
                int id = rs.getInt("id");
                int age = rs.getInt("age");
                System.out.print("ID: "+id);
                System.out.println(", Age: " + age);
            }
            rs.close();
            stmt.close();
            conn.close();
        }catch (SQLException se){
            se.printStackTrace();
        }catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Connection Closed, Bye!");
    }
}
