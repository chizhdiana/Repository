package test1.file;

/**
 * Created by diana on 09.11.16.
 */

        import java.io.File;
        import java.io.FileWriter;
        import java.io.IOException;

/**
 * Created by acer on 09.10.2016.
 */
public class FileEx {
    public static void main(String[] args) throws IOException {
        // олучение списка физических дисков на компьютере
        File[]drives = File.listRoots();
        for(File drive:drives){
            System.out.println(drive.getPath());
        }

        // Создание файла либо каталога
        File directory = new File("C:\\Users\\acer\\Downloads\\FileTest");

        System.out.println("Имя файла" + directory.getName());
        System.out.println("Путь к файлу" + directory.getPath());
        System.out.println("Полный путь к файлу" + directory.getAbsolutePath());
        System.out.println("Путь к родителю" + directory.getParent());

        System.out.println("Проверка существует ли файл, каталог" + directory.exists());

        // Проверка существует или нет директория, если нет, то создаем ( относится к файлам)
        if(directory.exists())directory.mkdir();
        // Создадим новую папку в ней файл
        File child = new File(directory, "/test/dir");
        child.mkdirs();
        System.out.println("Имя файла" + child.getName());
        System.out.println("Путь к файлу" + child.getPath());

        // Создание файла по указанному пути
        File newFile = new File(directory, "test.doc");
        if(newFile.exists());

        newFile.createNewFile();
        // Запись тестовой строки в файл
        String data = "Тестовая строка для записи";
        FileWriter writer = new FileWriter(newFile);
        writer.write(data);
        writer.flush();
        writer.close();

        // Для технической информации используем, просто посмотреть
        String[]fileInfo = directory.list();
        for(String file:fileInfo){
            System.out.println(file);

        }
        // ругой вариант, если нужно как то работать с содержимом
        File [] files = directory.listFiles();
        for(File file:files){
            System.out.println(file.getName());

        }





    }}
