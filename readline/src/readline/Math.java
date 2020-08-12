package readline;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import javax.print.DocFlavor.CHAR_ARRAY;
import com.google.common.*;

/*
1、首先创建FileReader对象
2、将FileReader传递给BufferedReader
3、采用BufferedReader的readLine()方法和read()方法来读取文件内容
4、最后一定要的finally语句中关闭BufferedReader15  */
public class Math {
    public List<String> Arr() {
        List<String> arr1 = new ArrayList<>();
        BufferedReader br = null;
        // BufferedReader br2 = null;
        try {
            br = new BufferedReader(
                    new FileReader("C:\\Users\\97207\\Desktop\\7000-D.txt"));
            // 第一种读取文件方式
            // System.out.println("Reading the file using readLine() method: ");
            String contentLine;

            while ((contentLine = br.readLine()) != null) {
                // contentLine = br.readLine();
                // 读取每一行，并输出
                // System.out.println(contentLine);
                // 将每一行追加到arr1
                arr1.add(contentLine);
            }
            // 输出数组
            // System.out.println(arr1);
            return arr1;
            /*
             * // 第二种读取文件方式 br2 = new BufferedReader( new
             * FileReader("C:\\Users\\91911\\Desktop\\test.txt"));
             * System.out.println("Reading the file using read() method: "); int
             * num = 0; char ch; while ((num = br2.read()) != -1) { ch = (char)
             * num; System.out.print(ch); }
             */
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
                // if (br2 != null) {
                // br2.close();
                // }
            } catch (IOException e) {
                System.out.println("Error in closing the BufferedReader");
            }
        }
        return arr1;
    }
}
