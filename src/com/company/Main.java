package com.company;

import com.company.data.entity.Book;
import com.company.data.service.DataFixer;
import com.company.data.service.Datasource;

import java.util.Iterator;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    Datasource datasource = new Datasource();
    DataFixer dataFixer = new DataFixer(datasource);
    List<Book> books = dataFixer.getBooks();
    Iterator<Book> bookIterator = books.iterator();
    while (bookIterator.hasNext()){
      System.out.println(bookIterator.next());
    }
  }

}
