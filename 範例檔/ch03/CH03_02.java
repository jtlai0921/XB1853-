public class CH03_02 {
    public static void main(String args[]) {
        int num,hundred;/* �ŧi��Ӿ���ܼ� */ 
        System.out.print("�п�J���@�Ӿ��:");
        java.util.Scanner input_obj=new 
                  java.util.Scanner(System.in);
        num =input_obj.nextInt();/* ���N��J�@�Ӿ�� */
        hundred=(num/100)%10;/* �D�P10���l�ƭ� */ 
        System.out.print(num+"�ʦ�ƪ��Ʀr��"+hundred+"\n"); 
        /* ��X��Ӿ�ƻP�ʦ�ƼƦr */
    }
}