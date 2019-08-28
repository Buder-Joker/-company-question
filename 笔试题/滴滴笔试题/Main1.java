package com.bittch.笔试题.滴滴;

import javax.swing.plaf.nimbus.State;
import java.util.Scanner;
import java.util.Stack;

/*
算式转移
时间限制：C/C++语言 1000MS；其他语言 3000MS
内存限制：C/C++语言 65536KB；其他语言 589824KB
题目描述：
给出一个仅包含加减乘除四种运算符的算式(不含括号)，如1+2*3/4，在保持运算符顺序不变的情况下，现在你可以进行若干次
如下操作：如果交换相邻的两个数，表达式值不变，那么你就可以交换这两个数。

现在你可以进行任意次操作，使得算式的数字序列字典序最小，然后输出结果，数字之间的字典序定义为若a<b则a的字典序小于b。

输入
第一行包含一个整数n，表示算式的长度，即包含n个数字和n-1个运算符。(1≤n≤100000)。

第二行包含一个含有n个非0整数和n-1个运算符的算式，整数与运算符用空格隔开，运算符包括“+，-，*，/”，整数的绝对值
不超过1000。

输出
按要求输出字典序最小的表达式，数字与符号之间用空格隔开。

样例输入
6
3 + 2 + 1 + -4 * -5 + 1
样例输出
1 + 2 + 3 + -5 * -4 + 1
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        int n = in.nextInt();
        String str = in.nextLine();
        String[] strings = str.split(" ");
        int sum = 0;
        for(int i=0; i<strings.length; i++){
            int num1 = 0;
            if(!isFuhao(strings[i])){
                num1 = Integer.parseInt(strings[i]);
                stack.push(num1);
            }else{
                switch (Fuhao(strings[i])){
                    case '+':
                        int num2 = stack.peek();
                        stack.pop();
                        stack.push(num2);
                        break;
                    case '-':
                        int num3 = stack.peek();
                        stack.pop();
                        stack.push(num3);
                        break;
                    case '*':
                        int num4 = stack.peek();
                        stack.pop();
                        stack.push(num4);
                        break;
                    case '/':
                        int num5 = stack.peek();
                        stack.pop();
                        stack.push(num5);
                        default:
                }
            }
        }
        sum = stack.peek();
        swaich(strings,sum);
    }

    private static void swaich(String[] strings, int sum) {

    }

    private static char Fuhao(String string) {
        if(string=="+"){
            return '+';
        }
        if(string=="-"){
            return '-';
        }
        if(string=="*"){
            return '*';
        }
        if(string=="/"){
            return '/';
        }
        return ' ';
    }
    private static boolean isFuhao(String string) {
        if(string=="+"){
            return true;
        }
        if(string=="+"){
            return true;
        }
        if(string=="+"){
            return true;
        }
        if(string=="/"){
            return true;
        }
        return false;
    }
}
