public class CH04_21 {
    public static void main(String args[]) {
        int Num1, Num2,TmpNum; //�ŧi3�Ӿ���ܼ�
        System.out.print("�D����Ӿ�ƪ��̤j���]��(g.c.d):\n");
        System.out.print("�п�J��Ӿ��:");
        java.util.Scanner input_obj=
            new java.util.Scanner(System.in);
        //��J��Ӿ��
        Num1=input_obj.nextInt();  
        Num2=input_obj.nextInt();   
        if (Num1 < Num2)                   
        {                                     
            TmpNum=Num1;                           
            Num1=Num2;
            Num2=TmpNum; //��X��Ƹ��j�� 
        }

        while (Num2 != 0)                
        {                                      
            TmpNum=Num1 % Num2;   //�D��ƪ��l�ƭ�       
            Num1=Num2;                              
            Num2=TmpNum; //����۰��k
        }	  
        System.out.print("�̤j���]��(g.c.d)="+Num1+"\n");
    }
}