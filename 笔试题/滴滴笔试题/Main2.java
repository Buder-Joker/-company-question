package com.bittch.笔试题.滴滴;

import java.util.Scanner;

/*
序列移除
时间限制：C/C++语言 1000MS；其他语言 3000MS
内存限制：C/C++语言 131072KB；其他语言 655360KB
题目描述：
现在有A，B两个序列，两个序列都是拥有n个元素，你有两种操作：

1. 从A序列中选择一个非空前缀，再从B序列中选择一个非空前缀，要求选择的这两个前缀的末尾元素相等。把这两个前缀移除，
这个操作将花费Cost代价，但是这个操作可以使你得到一颗宝石。

2. 您可以重复第1步的操作；最终，您需要花费两个序列剩余元素数量之和大小的代价，移除两个序列中剩下的所有元素
（这最后一步是没有宝石的），这时游戏结束。

要求总代价不超过Total，且序列中不得有剩余，那么最多可以获得多少宝石。

输入
输入第一行包含三个正整数n, Total , Cost ,  (1<=n<=5*10^4 , 1<=Total<=3*10^5 , 10^3<=Cost<=10^4)

接下来两行，每行n个数，表示A，B序列

输出
一个数表示最多可以获得的宝石数量

样例输入
5 10000 1000
1 5 4 2 3
5 4 3 2 1
样例输出
3

提示
按顺序消除末尾为5，4，3的前缀，最后再消除2，1可以获得3颗宝石。
 */
public class Main2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int Total = in.nextInt();
        int Cost = in.nextInt();
        int[] arr = new int[n];
        int[] brr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = in.nextInt();
        }
        for(int i=0; i<n; i++){
            brr[i] = in.nextInt();
        }
        int m = Total/Cost;
        int MaxStone = 0;
        while(m>0){
            for(int i=0; i<arr.length; i++){
                for(int j=i; j<brr.length; j++){
                    if(arr[i]==brr[j]){
                        MaxStone++;
                        if(i==arr.length-1){
                            MaxStone+=arr.length-i-1;
                            break;
                        }if(j==brr.length-1){
                            MaxStone+=brr.length-j-1;
                            break;
                        }
                    }
                }
            }
            m--;
        }
        System.out.println(MaxStone);
    }
}
