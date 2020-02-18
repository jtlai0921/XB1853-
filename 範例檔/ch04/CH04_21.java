public class CH04_21 {
    public static void main(String args[]) {
        int Num1, Num2,TmpNum; //3俱计跑计
        System.out.print("―ㄢ俱计程そ计(g.c.d):\n");
        System.out.print("叫块ㄢ俱计:");
        java.util.Scanner input_obj=
            new java.util.Scanner(System.in);
        //块ㄢ俱计
        Num1=input_obj.nextInt();  
        Num2=input_obj.nextInt();   
        if (Num1 < Num2)                   
        {                                     
            TmpNum=Num1;                           
            Num1=Num2;
            Num2=TmpNum; //тㄢ计耕 
        }

        while (Num2 != 0)                
        {                                      
            TmpNum=Num1 % Num2;   //―ㄢ计緇计       
            Num1=Num2;                              
            Num2=TmpNum; //劣锣埃猭
        }	  
        System.out.print("程そ计(g.c.d)="+Num1+"\n");
    }
}