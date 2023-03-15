package com.jetbrains;

import java.sql.*;

public class Main {
    void showData()
    {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/juniv";
            String userName="root";
            String password="";
            Connection connection= DriverManager.getConnection(url,userName,password);
            if(connection.isClosed()){
                System.out.printf("Not Connected");
            } else {
                System.out.println("Connected");
            }

            Statement statement=connection.createStatement();
            ResultSet resultSet=statement.executeQuery("SELECT * FROM student");
            while(resultSet.next()){
                System.out.println(resultSet.getInt("id") +" "+ resultSet.getString("registration_number")+" "+resultSet.getInt("name"));
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

    }

    void insertData()
    {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/juniv";
            String userName="root";
            String password="";
            Connection connection=DriverManager.getConnection(url,userName,password);
            Statement statement=connection.createStatement();
            statement.executeUpdate("INSERT INTO student (id,registration_number, class_roll, exam_roll, name, mobile, email) values (3255,325,183654,'James Cameroon', '0155', 'email@email.com')");
            //statement.executeUpdate("INSERT INTO student values (3,3255,325,183654,James Cameroon, 0155, email@email.com)");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        // write your code here
        Main obj=new Main();
        obj.insertData();
        obj.showData();

    }
}

