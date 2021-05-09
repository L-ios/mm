package com.lios.jdbc.demo;

import java.sql.*;

/**
 * Project: MyBatisDemo
 *
 * @author: Lionseun Ling
 * @create: 2021/5/9
 */
public class JDBCDemo {
    public static void main(String[] args) throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/MyBatisDemo", "root", "MyNewPass4!");
        PreparedStatement preparedStatement = connection.prepareStatement("select * from Blog where id = ?");
        preparedStatement.setInt(1, 1);
        ResultSet resultSet = preparedStatement.executeQuery();
        if (resultSet.next()) {
            String string = resultSet.getString(2);
            System.out.printf(string);
        }
    }
}
