//�H���j�ӭp���0!~n!����ƭ�
public class CH05_07 {
    static int factorial(int n){  
        if(n== 1 || n==0) //���j�פ����
            return 1;
        else
            return n* factorial(n-1);
    }
    public static void main(String args[]){
    // �إ�Scanner����
    java.util.Scanner sc=
        new java.util.Scanner(System.in);
    System.out.print("�п�J������= ");
    int n=sc.nextInt();
    for (int i=0;i<=n;i++)
        System.out.println(i+"!= "+factorial(i));
    }
}