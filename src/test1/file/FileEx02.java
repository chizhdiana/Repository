package test1.file;

/**
 * Created by diana on 09.11.16.
 */


        import java.io.*;
        import java.util.Scanner;

/**
 * Created by acer on 09.10.2016.
 */
public class FileEx02 {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\acer\\Downloads\\FileTest\\ test.doc");
        // позволяет установить полномочия на чтение
        // если тру чтение открыто если фолс закрыто
        file.setReadable(true);

        if(file.canRead()){
            Scanner scanner = new Scanner(new FileReader(file));
            while(scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        }
        // позволяет установить полномочия на запись
        // если тру чтение открыто если фолс закрыто
        file.setReadable(true);
        String data = "Новые данные";
        FileWriter writer = new FileWriter(file);
        writer.write(data);
        writer.flush();
        writer.close();
    }
}
