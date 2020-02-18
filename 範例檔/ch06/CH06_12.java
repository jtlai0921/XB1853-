import java.io.*;
public class ch06_12
{
    public static void main(String args[]) throws IOException 
    {  
        int[][][] num=new int[][][]
                  {{{43,45,67},
                   {73,71,56},
                   {55,38,66}},
                  {{21,39,25 },
                   {38,89,18},
                   {90,101,89}}};/* 宣告三維陣列 */
        System.out.print("三維陣列的最小值= "+min(num,2,3,3)+"\n"); 
    }	
    static int min(int[][][] arr,int a,int b,int c)/* 定義min()函數主體 */ 
    {
        int i,j,k,min_value;
        min_value=arr[0][0][0];/* 設定min_value的值為陣列的第一個元素值 */ 
        for(i=0;i<a;i++)	     
            for(j=0;j<b;j++)    
                for(k=0;k<c;k++)           
                    if(min_value>=arr[i][j][k])
                        min_value=arr[i][j][k]; /* 利用三層迴圈找出最小值 */
        return min_value; /* 傳回整數 min_value */ 
    }
}