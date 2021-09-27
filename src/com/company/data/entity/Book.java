package com.company.data.entity;

public class Book {

  private long bookId;
  private String topic;
  private String iSBN;
  private String author;
  private String title;
  private String countryOfPublication;
  private String publisher;
  private String dateOfPublication;
  private String genre;
  private String language;

  public long getBookId() {
    return bookId;
  }

  public void setBookId(long bookId) {
    this.bookId = bookId;
  }

  public String getTopic() {
    return topic;
  }

  public void setTopic(String topic) {
    this.topic = topic;
  }

  public String getiSBN() {
    return iSBN;
  }

  public void setiSBN(String iSBN) {
    this.iSBN = iSBN;
  }

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getCountryOfPublication() {
    return countryOfPublication;
  }

  public void setCountryOfPublication(String countryOfPublication) {
    this.countryOfPublication = countryOfPublication;
  }

  public String getPublisher() {
    return publisher;
  }

  public void setPublisher(String publisher) {
    this.publisher = publisher;
  }

  public String getDateOfPublication() {
    return dateOfPublication;
  }

  public void setDateOfPublication(String dateOfPublication) {
    this.dateOfPublication = dateOfPublication;
  }

  public String getGenre() {
    return genre;
  }

  public void setGenre(String genre) {
    this.genre = genre;
  }

  public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }
}
