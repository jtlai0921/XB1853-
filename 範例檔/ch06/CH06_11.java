import java.io.*;
public class ch06_11 
{
    public static void main(String args[]) throws IOException 
    {  
        int[][] arr=new int[2][2];
        int sum;
        java.util.Scanner input_obj=
            new java.util.Scanner(System.in);
        System.out.print("|a1 b1|\n");
        System.out.print("|a2 b2|\n");
  
        System.out.print("請輸入a1:");
        arr[0][0]=input_obj.nextInt();
        System.out.print("請輸入b1:");
        arr[0][1]=input_obj.nextInt();
        System.out.print("請輸入a2:");
        arr[1][0]=input_obj.nextInt();
        System.out.print("請輸入b2:");
        arr[1][1]=input_obj.nextInt();
        /* 求二階行列式的值 */
        sum = arr[0][0]*arr[1][1]-arr[0][1]*arr[1][0];
        System.out.printf("|%d %d|\n",arr[0][0],arr[0][1]);
        System.out.printf("|%d %d|\n",arr[1][0],arr[1][1]);
        System.out.print("sum="+sum+"\n");
    }	
}