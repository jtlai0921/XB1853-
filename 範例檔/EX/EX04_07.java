public class EX04_07 {
    public static void main(String[ ] args){
        java.util.Scanner input_obj=
            new java.util.Scanner(System.in);
        int min;
        System.out.print("�п�J�Ĥ@�ӼƦr= ");
        int number1=input_obj.nextInt();
        System.out.print("�п�J�ĤG�ӼƦr= ");
        int number2=input_obj.nextInt();
        min=(number1<number2)? number1:number2;
        System.out.println("�G�Ƥ����p���ƨ�ߤ��="+min*min*min);
    }
}
