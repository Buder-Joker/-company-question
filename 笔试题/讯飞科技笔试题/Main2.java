package 剑指Offer.讯飞科技;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[6];
        for(int i=0; i<arr.length; i++){
            arr[i] = in.nextInt();
        }
        int left = 0;
        int right = arr.length-1;
        System.out.println(erfenFind(arr,left,right,10));
    }

    private static int erfenFind(int[] arr,int left,int right,int targr) {
        int mid = (left+right)>>1;
        if(arr[mid]==targr){
            return mid+1;
        }
        if(arr[mid]<targr){
            return erfenFind(arr,mid+1,right,targr);
        }
        if(arr[mid]>targr){
            return erfenFind(arr,left,mid-1,targr);
        }
        return 0;
    }
}
