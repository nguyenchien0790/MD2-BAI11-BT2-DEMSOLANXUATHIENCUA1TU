import com.sun.javafx.collections.MappingChange;

import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Map<String,Integer> treemap = new TreeMap<>();
        System.out.println("truoc khi them phan tu : "+treemap);
        treemap.put("aaa",1);
        treemap.put("bbb",2);
        treemap.put("ccc",3);
        System.out.println("sau khi them phan tu : "+treemap);
        treemap.put("ddd",1);
        System.out.println("sau khi put tiep tai vi tri 1 : " +treemap);
        treemap.put("aaa",0);
        System.out.println("sau khi them phan tu co cung Key <aaa> : "+ treemap );



    }
}
