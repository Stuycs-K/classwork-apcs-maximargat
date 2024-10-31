import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {

  public static void main(String[] args) {
    try {
      File file = new File("input.txt");
      Scanner input = new Scanner(file);

      while(input.hasNextLine())
      {
          String next = input.nextLine();
          if(next.contains("{"))
            System.out.println(next);
          //input.nextLine();

          // should be according..., the..., ooh..., barry..., hang...
      }

      input.close();

    } catch (FileNotFoundException e) {
      System.out.println("File not found!");
      return;
    }
  }
}