// �Q�ΰʺA�W�e�k�ӭp��O�B���ǦC����
public class CH05_09 {
    static int[] output=new int[1000];//fibonacci���Ȧs��
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
        System.out.print("�п�J�n�p���ĴX�ӶO���ƦC:");
        java.util.Scanner sc=
            new java.util.Scanner(System.in);
        n=sc.nextInt();
        for(i=0;i<=n;i++) /* �p��en�ӶO��ƦC */
            System.out.print("fib("+i+")="+fib(i)+"\n");
    }
}