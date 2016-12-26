package test1.file;

import java.io.*;
import java.util.ArrayList;


/**
 * Created by diana on 12.12.16.
 */
public class FileSeacher {

    private static ArrayList<File> result = new ArrayList<>();


    public static void main(String[] args) {
    }

    public static void searchFile(String path, String file_name) {

        File directory = new File("home/diana/file_1");

        try {
            if (!result.isEmpty()) {
                throw new FileNotFoundException();

            }
        } catch (FileNotFoundException exe) {
            System.out.println("По указанному пути файл не найден");

        }

        System.out.println("Файл для поиска:" + file_name + "\n");
        System.out.println("Каталог в котором ищем:" + path);
        find_file(directory, file_name);

        if (!directory.exists()) {
            System.out.println("Не корректный путь к файлу,введите путь");

        } else {
            for (File f : result)
                System.out.println(f.getAbsolutePath());
            System.out.println(result.size());


        }
    }

    public static void find_file(File direct, String name) {

        if (direct.exists()) {
            if (direct.listFiles().length > 0) {

                for (File fileInfo : direct.listFiles()) {
                    if (fileInfo.getName().equals(name)) {
                        result.add(fileInfo);

                    }

                }
            }
        }
    }

    public void openTxtFile(File file) throws FileNotFoundException {

        try {
            if (!file.exists()) {
                throw new FileNotFoundException();

            }
        } catch (FileNotFoundException exe) {
            System.out.println("Файл не существует");
        }

        if (!file.getName().endsWith(".txt")) {
            System.out.println("Не корректный формат файла");
            return;
        }
        if (file.getName().indexOf(".") == -1 ||
                !file.getName().substring(file.getName().lastIndexOf(".") + 1).equals("txt")) {
            System.out.println("Не верный формат файла");
            return;

        }


        if (file.isFile() && file.canRead()) {
            try {
                FileReader fileReader = new FileReader(file);
                int c;
                while ((c = fileReader.read()) != -1) {
                    System.out.println((char) c);
                }


            } catch (IOException e) {
                e.printStackTrace();
                System.out.println(e.getMessage());


            }

        }
    }
}

