public class CH04_02 {
    public static void main(String[] ages) {
        int num=0;  /*�ŧi�r���ܼ�*/
        System.out.print("�п�J�@�ӥ���Ʀr:");
        java.util.Scanner input_obj=new 
            java.util.Scanner(System.in);
        num =input_obj.nextInt();/*��J�ƭ�*/ 
        if(num%2!=0) /*�p�G��ư��H2���l�Ƥ�����0*/
            System.out.print("��J���Ƭ��_�ơC\n");/*�h��ܩ_��"*/
        else                 /*�_�h*/
            System.out.print("��J���Ƭ����ơC\n");/*�h��X����"*/ 
    }
}