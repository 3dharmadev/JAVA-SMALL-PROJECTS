package SB_101.Sprint_2.Day5;

import java.io.File;
import java.io.IOException;

public class Demo {
    public static void readFiles(File f){
  File[]  files =  f.listFiles();
        for (File file: files) {
                 if(file.isFile()) System.out.println(file.getName());
                 else readFiles(file);
        }
    }
    public static void main(String[] args) throws IOException {
  /*      File f = new File("a1.txt");
//        boolean flag = f.createNewFile();
//        System.out.println("file created ..."+flag);
        System.out.println(f.length()); */

      /*  File mkdir = new File("abd","a2.txt");
     // boolean flg = mkdir.mkdir();  System.out.println(flg);
        mkdir.createNewFile(); */


       // File f = new File("d://");
//   String[] str = f.list();
//        for (String s: str) {
//            System.out.println(s);
//        }


//        File[] file = f.listFiles();
//        for (File ff: file) {
//            System.out.println(ff);
//        }

        File rootFile = new File("abd");
        readFiles(rootFile);






    }
}
