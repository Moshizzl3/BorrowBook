package com.company.data.service;

import com.company.data.entity.Book;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DataService {
  private final Datasource DATASOURCE;

  public DataService(Datasource datasource) {
    DATASOURCE = datasource;
  }

  public ArrayList<Book> getBooks(){
    String sqlstantement ="SELECT bookid, author, title, genre FROM books";
    ArrayList<Book> books = new ArrayList<>();
    PreparedStatement preparedStatement;
    ResultSet resultSet;
    DATASOURCE.openConnection();
    try {
      preparedStatement = DATASOURCE.getConnection().prepareStatement(sqlstantement);
      resultSet = preparedStatement.executeQuery();
      while (resultSet.next()){
        Book book = new Book();
        book.setBookId(resultSet.getLong("bookid"));
        book.setAuthor(resultSet.getString("author"));
        book.setTitle(resultSet.getString("title"));
        book.setGenre(resultSet.getString("genre"));
        books.add(book);
      }

    }catch (SQLException sq){
      sq.getMessage();
    }finally {
      DATASOURCE.closeConnection();
    }
    return books;
  }
}
