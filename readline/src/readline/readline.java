package readline;

import java.net.*;
import java.util.List;
import java.io.*;

public class readline {
    /** * @param args */
    public static void main(String[] args) {

        URL url = null;
        InputStream is = null;

        List<String> words = new Math().Arr();

        for (int i = 0; i < words.size(); i++) {
            try {
                url = new URL("https://baike.baidu.com/item/" + words.get(i));
                is = url.openStream();
                BufferedReader br = new BufferedReader(
                        new InputStreamReader(is));
                String line;
                boolean res = false;
                while ((line = br.readLine()) != null) {
                    // System.out.println(line);
                    if (line.contains("您所访问的页面不存在..")) {
                        res = true;
                        break;
                    }
                }
                if (res == true) {
                    System.out.println(words.get(i));
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            } finally {
                try {
                    if (is != null)
                        is.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}