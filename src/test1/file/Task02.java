package test1.file;

/**
 * Created by diana on 09.11.16.
 */

import com.sun.istack.internal.Nullable;

import java.io.File;
import java.io.FileFilter;

/**
 * Created by nucleos on 09.10.16.
 *
 * Написать метод который вернет расширение файла
 *
 */

public class Task02 {
    public static void main(String[] args) {
        File file = new File("/home/nucleos/FilesTest/test.dat");
        System.out.println(getFileExtension(file));
        File directory = new File("/home/nucleos/FilesTest");
        FileFilter filter = filter(getFileExtension(file));
        Task01.printDirInfo(directory, filter);
    }

    @Nullable
    public static String getFileExtension(File file) {
        String name = file.getName();
        if (name.lastIndexOf(".") > 1) {
            return name.substring(name.lastIndexOf(".") + 1);
        }
        return null;
    }

    public static FileFilter filter(String ext) {
        class ExtFilter implements FileFilter {
            private  String ext;

            public ExtFilter(String ext) {
                this.ext = ext;
            }

            @Override
            public boolean accept(File pathname) {
                String extention = pathname
                        .getName().substring(pathname.getName().lastIndexOf(".") + 1);
                return extention.equals(ext);
            }
        }
        return new ExtFilter(ext);
    }


}

