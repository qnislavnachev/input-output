import java.io.Serializable;

/**
 * Created by clouway on 31.05.16.
 */
public class Book implements Serializable {
  private String title;
  private String author;
  private int isbn;
  private int pages;

  public Book(String title, String author, int isbn, int pages){
    this.title = title;
    this.author = author;
    this.isbn=isbn;
    this.pages=pages;
  }

  public String getTitle(){
    return title;
  }
  public String getAuthor(){
    return author;
  }
  public int getIsbn(){
    return isbn;
  }
  public int getPages(){
    return pages;
  }
}
