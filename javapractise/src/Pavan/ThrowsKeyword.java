package Pavan;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ThrowsKeyword {
    public static void main(String[] args) throws IOException, InterruptedException {
        FileReader fr =null;
        fr=new FileReader("E:\\wj.txt");

        BufferedReader bfr=new BufferedReader(fr);
        System.out.println(bfr.readLine());
        Thread.sleep(5000);
    }

}
