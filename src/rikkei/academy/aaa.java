package rikkei.academy;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class aaa {
    public static void main(String[] args) {
        Map<String,Integer> treeMap = new TreeMap<>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap chuoi : ");
        String input = scanner.nextLine();
        String[] list = input.toLowerCase().split(" ");

        for (int i = 0; i < list.length; i++) {
            if(treeMap.containsKey(list[i])){
                treeMap.put( list[i], (treeMap.get(list[i])+1) );
            }else {
                treeMap.put(list[i],1);
            }
        }
        System.out.println("So lan xuat hien cua cac tu trong chuoi : " + treeMap);
    }
}