package com.company.data.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class Datasource {
  private Connection connection;

  public void openConnection(){
    Properties properties = new Properties();
    String conUrl = "jdbc:mysql://127.0.0.1:3306/library";
    properties.put("user", "root");
    properties.put("password", "");
    try {
      this.connection = DriverManager.getConnection(conUrl, properties);
    }catch (SQLException se){
      System.out.println(se.getMessage());
    }
  }

  public void closeConnection(){

    try {
      this.connection.close();
    }catch (SQLException se){
      se.getMessage();
    }
  }

  public Connection getConnection() {
    return connection;
  }
}
