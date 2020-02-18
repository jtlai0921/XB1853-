// 利用動態規畫法來計算費伯那序列的值
public class CH05_09 {
    static int[] output=new int[1000];//fibonacci的暫存區
    static int fib(int n){
        int result;
        result=output[n];
        if (result==0) 
        {
            if(n==0)
                return 0;
            if(n==1)
                return 1;
            else
                return (fib(n-1)+fib(n-2));      
        }
        output[n]=result;
        return result;
    }
    public static void main(String args[]){
        int i,n;
        System.out.print("請輸入要計算到第幾個費式數列:");
        java.util.Scanner sc=
            new java.util.Scanner(System.in);
        n=sc.nextInt();
        for(i=0;i<=n;i++) /* 計算前n個費氏數列 */
            System.out.print("fib("+i+")="+fib(i)+"\n");
    }
}