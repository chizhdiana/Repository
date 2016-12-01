package test1.file;

/**
 * Created by diana on 09.11.16.
 */

        import java.io.File;
        import java.io.FileFilter;


public class FileEx03 {
    public static void main(String[] args) {
        File directory = new File("C:\\Users\\acer\\Downloads\\FileTest");
        if (directory.exists()) {
            directory.delete();
        }
        if (directory.exists()) {
            File[] files = directory.listFiles();
            for (File f : files) {
                if (f.getName().equals("test.dat")) {
                    f.delete();

                }
                directory.delete();
            }
        }
    }


    // Получение расширения файла
    public static String getFileExtencion(File file) {
        String name = file.getName();
        if(name.lastIndexOf(".")>1){
            return name.substring(name.lastIndexOf(".")+1);
        }
        return null;
    }


}




















