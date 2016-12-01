package test1.file;

/**
 * Created by diana on 09.11.16.
 */


        import java.io.File;
        import java.io.FileFilter;

/**
 * Created by nucleos on 09.10.16.
 *
 * Написать метод который выводит информацию в консосль
 * о содержимом каталога и подкаталогов если они есть
 */
public class Task01 {

    public static void main(String[] args) {
        File directory = new File("/home/nucleos/FilesTest");
        printDirInfo(directory);
    }

    public static void printDirInfo(File directory) {
        if (!directory.exists()) return;

        File[] files = directory.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isDirectory()) {
                    printDirInfo(file);
                } else {
                    System.out.println(file.getPath());
                }
            }
        }
        System.out.println(directory.getPath());
        return;
    }

    public static void printDirInfo(File directory, FileFilter fileFilter) {
        if (!directory.exists()) return;

        File[] files = directory.listFiles(fileFilter);
        if (files != null) {
            for (File file : files) {
                if (file.isDirectory()) {
                    printDirInfo(file, fileFilter);
                } else {
                    System.out.println(file.getPath());
                }
            }
        }
        System.out.println(directory.getPath());
        return;
    }
}

