import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * Created by clouway on 31.05.16.
 */
public class Demo {
  public static void main(String[] args) {

    Book book1 = new Book("How Not To Java", "Alexander Vladimirov", 1234589012, 111 );
    DataClass data = new DataClass();
    Book bookCopy= null;
    try {
      FileOutputStream fileOut = new FileOutputStream("/home/clouway/developmnet/input-output/book.ser");
      data.saveObject(fileOut, book1);
      FileInputStream fileIn = new FileInputStream("/home/clouway/developmnet/input-output/book.ser");
      bookCopy = (Book) data.getObject(fileIn);
    }catch (Exception e){
      e.printStackTrace();
    }
    System.out.println(book1.getAuthor() + " = " + bookCopy.getAuthor());
    System.out.println(book1.getTitle()+ " = " + bookCopy.getTitle());
    System.out.println(book1.getIsbn()+ " = " + bookCopy.getIsbn());
    System.out.println(book1.getPages()+ " = " + bookCopy.getPages());
  }
}
