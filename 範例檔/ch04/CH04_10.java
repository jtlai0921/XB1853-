public class CH04_10{
    public static void main(String args[ ]){
        int n;
        System.out.print("�п�J���@���:"); 
        java.util.Scanner input_obj=
             new java.util.Scanner(System.in);
        n=input_obj.nextInt();
        System.out.println("�ϦV��X�����G:"); 
        while (n!=0) /* while�j�� */ {
            System.out.print(n%10);/* �D�X�l�ƭ� */ 
            n/=10;
        } 
        System.out.println();
    }	
}