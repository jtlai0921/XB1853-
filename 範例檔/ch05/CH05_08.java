// �p���n���O�B���ǦC�����j�{��
public class CH05_08 {
    static int fib(int n){
        if(n==0) 
            return 0;
        if(n==1)
            return 1;
        else
            return fib(n-1)+fib(n-2); //���j�ޥΥ���2��
    }
    public static void main(String args[]){
    // �إ�Scanner����
    java.util.Scanner sc=
        new java.util.Scanner(System.in);
    System.out.print("�п�J�O�B����= ");
    int n=sc.nextInt();
    for (int i=0;i<=n;i++)
        System.out.println("fib("+i+")= "+fib(i));
    }
}