package net.xdclass.demoproject.gaode;

import com.alibaba.fastjson.JSON;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class PoiFetch {
    public static String uri = "https://restapi.amap.com";

    /**
     * Get方法
     */
    public static void test1() {
        try {
            URL url = new URL(uri + "/v3/place/text?key=1063f6bc8d3403f6596ae8c3857ad964&keywords=丰巢&city=天津市&offset=20&page=14");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            connection.setDoOutput(true); // 设置该连接是可以输出的
            connection.setRequestMethod("GET"); // 设置请求方式
            connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8");

            BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream(), "utf-8"));
            String line = null;
            StringBuilder result = new StringBuilder();
            while ((line = br.readLine()) != null) { // 读取数据
                result.append(line + "\n");
            }
            connection.disconnect();
            PoiDate poiDate = JSON.parseObject(result.toString(), PoiDate.class);
            System.out.println(poiDate.getCount());
            int count1 = 0;
            for (Poi poi : poiDate.getPois()) {
                System.out.println("名称：" + poi.getName() + "  城市名：" + poi.getPname() + "  区名：" + poi.getAdname() +
                        "  坐标:" + poi.getLocation() + "  地址：" + poi.getAddress());
                count1++;
            }
            System.out.println(count1);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        test1();
    }
}
