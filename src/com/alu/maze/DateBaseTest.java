package com.alu.maze;

import java.sql.*;

/**
 * @author alu
 * @date 2021/2/6 11:17
 */
public class DateBaseTest {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/db_user?useSSL=true&serverTimezone=UTC";
        String userName = "root";
        String psw = "123456";
        String mysqlDriver = "com.mysql.cj.jdbc.Driver";
        try {
            Class.forName(mysqlDriver);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            final Connection connection = DriverManager.getConnection(url, userName, psw);
            String sql = "select * from emp where sal > ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1,1600);
            System.out.println(preparedStatement.toString());
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                System.out.println(resultSet.getInt(1)+"::"+resultSet.getString(2));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
