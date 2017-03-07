package decoratorPattern.IODecorator;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        int c;
        try {
            InputStream in = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream("/home/axltop/Projects/DesignPaterns/src/decoratorPattern/IODecorator/test.txt")));

            while((c = in.read()) >= 0){
                System.out.print((char) c);
            }
            in.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
