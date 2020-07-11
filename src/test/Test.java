package test;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
//        System.out.println(age(8));
        maopao();
        charu();
        xuanze();
//        stringtest();

    }
//用递归计算：第一个人10，第二个人比第一个大2，依次递推，求第8个人多大。
    public static int age(int n){
        if(n==1){
            return 10;
        }
        return age(n-1)+2;

    }
//冒泡排序  * 比较相邻的元素
//    从小到大
    public static void maopao(){
        int[] arr={10, 20 ,90 , 5, 18, 33, 46, 66};
        //冒泡排序	外层循环 N-1 内层循环 N-1-i
        for(int i=0; i<arr.length-1;i++){
            for(int j=0; j<arr.length-1-i;j++){
                if(arr[j] > arr[j+1]){
                    int t=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=t;
                }
            }
        }
        System.out.println("冒泡排序结果："+ Arrays.toString(arr));
    }
//    插入排序
//* 将数组中的所有元素依次跟前面已经排好的元素相比较
//    从小到大
    public static void charu() {
        int temp;
        int[] numbers={32,54,1,21,8,3,88,345,32,6};
        //{32,54,1,21,8,3,88,345,32,6};
        for(int i=1;i<numbers.length;i++) {
            for(int j=0;j<i-1;j++) {
                if(numbers[i]<numbers[j]) {
                    temp = numbers[j];
                    numbers[j]=numbers[i];
                    numbers[i]=temp;
                }
            }
        }

        System.out.println("插入排序结果："+ Arrays.toString(numbers));
    }
//    （4）快速排序
//    从待排序序列中，找到关键字最小的元素；
//            * 如果最小元素不是待排序序列的第一个元素，将其和第一个元素互换；
//            * 从余下的 N - 1 个元素中，找出关键字最小的元素，重复①、②步，直到排序结束。
//    从小到大
    public static void xuanze() {
        int temp;
        int[] numbers={32,54,1,21,8,3,88,345,32,6};
        for(int i=0;i<numbers.length;i++) {
            int min = i;
            for(int j=i+1;j<numbers.length;j++) {
                if(numbers[j]<numbers[min]) {
                    min = j;
                }
            }
            if(min !=0) {
                temp = numbers[i];
                numbers[i] = numbers[min];
                numbers[min] = temp;
            }
        }
        System.out.println("选择排序结果："+Arrays.toString(numbers));
    }
//    字符串反转
    public static void stringtest(){
        StringBuilder s=new StringBuilder("asdfghjkl");
        System.out.println(s.reverse());
    }

}


