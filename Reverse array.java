import java.io.*;
public class reverseArray{
    public static void reverseExtraArray(int[] arr)
{
    int[] rvarr = new int(arr.length);
    for(int i=0;i<arr.length;i++)
{
    rvarr[i]= arr[arr.length-i-1];
}
System.out.println("Reverse Array");
for (int i:rvarr)
{
    System.out.println(i+" ");
}}
public static void main(String[] args)
{
    int[] orgarr = {1,2,3,4,5};
    reverseExtraArray(orgarr);
}}