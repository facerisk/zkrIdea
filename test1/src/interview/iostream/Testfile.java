package interview.iostream;

import java.io.*;
import java.util.Scanner;

public class Testfile {
    public static void main(String[] args) {
//        File f = new File("e:/test.txt");
//        FileInputStream fis = null;
//        try {
//            fis = new FileInputStream(f);
//            byte[] b = new byte[1024];
//            int i;
//            String ss;
//            while ((i = fis.read(b)) != -1) {
//                ss = new String(b, 0, i);
//                System.out.println(ss);
//            }
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            if (fis != null) {
//                try {
//                    fis.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
        File f = new File("e:/test.txt");
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(f);
            byte[] b = new byte[1024];
            int len;
            String ss;
            while ((len = fis.read(b)) != -1) {
                ss = new String(b, 0, len);
                System.out.println(ss);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fis == null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        //写
        Scanner sc = new Scanner(System.in);
        FileOutputStream ops = null;


        try {
            ops = new FileOutputStream(f,true);
            while (true) {
                String s = sc.nextLine();
                byte[] b = s.getBytes();
                if ("q".equals(s)) {
                    return;
                }

                ops.write(b);
                ops.write("\r\n".getBytes());


            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (ops == null) {
                try {
                    ops.flush();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }


        }


    }
}




