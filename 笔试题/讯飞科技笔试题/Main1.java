package 剑指Offer.讯飞科技;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        List<Integer> list = new ArrayList();
        char[] arr = str.toCharArray();
        for(int i=0; i<arr.length; i++){
            if(arr[i]>='0'&&arr[i]<='9'){
                list.add(Integer.parseInt(arr[i]+""));
            }
        }
        Collections.sort(list);
        for(int i:list){
            System.out.print(i);
        }
    }
}
