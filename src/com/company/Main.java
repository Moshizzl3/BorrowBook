package com.company;

import com.company.data.entity.Book;
import com.company.data.service.DataService;
import com.company.data.service.Datasource;

import java.util.Iterator;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    Datasource datasource = new Datasource();
    DataService dataService = new DataService(datasource);
    List<Book> books = dataService.getBooks();
    Iterator<Book> bookIterator = books.iterator();
    while (bookIterator.hasNext()){
      System.out.println(bookIterator.next());
    }
  }

}
