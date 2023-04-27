import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

class Main{
    public static void main(String[] args) {
        //code to create a new file
        /*
        File myfile = new File("huuu.txt");

        try {
            myfile.createNewFile();
            System.out.println("File is created ! Check it out !");
        }
        catch (IOException e) {
            System.out.println("Unable to create file !");
            System.out.println(e);
        }

        try {
            FileWriter a = new FileWriter("huuu.txt");
            a.write("Hello sir , this is your new created file !!");
            a.close(); // it is mandatory to close file otherwise it will not give you output in file
            System.out.println("FILE EDITED ! CHECK IT OUT ! 😉");
        }
        catch (Exception abc){
            System.out.println("Sorry sir there is some exception to write in file . ");
        }

          try {
              Scanner sc = new Scanner(myfile);
              while (sc.hasNextLine()){
                  String line = sc.nextLine();
                  System.out.println(line);
              }
              sc.close();
          }
          catch (Exception ea){
              System.out.println("Can't Read File ! ");
          }
*/

        File myfile = new File("hu.txt");
        if (myfile.delete()){
            System.out.println("I have deleted a File! \nFile name : " + myfile.getName());
        }



    }
}
