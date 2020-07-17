import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class IODemo1 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        File f = new File("D:\\java\\IOdemo.txt");
        BufferedWriter bw = new BufferedWriter(new FileWriter(f));
        if(!f.exists()){
            f.createNewFile();
        }
        while(true){
            String s = sc.nextLine();
            bw.write(s);
            bw.flush();
            if(s.equals("结束") || s.equals("")){
                System.out.println("写入数据结束! ");
                return;
            }
        }
    }
}
