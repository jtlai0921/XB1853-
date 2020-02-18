import java.io.*;
public class CH05_11 {
    public static void main(String args[]) throws IOException {  
        int i,j,w;
        int year, month;
        int[] days= {31,28,31,30,31,30,31,31,30,31,30,31};
 
        System.out.print("�п�J�褸�~��:");
        java.util.Scanner input_obj=
            new java.util.Scanner(System.in);
        year=input_obj.nextInt();/* ��J�~�� */ 
    
        if  (year >= 1900)   
        {
            System.out.print("�п�J��~���:");
            month=input_obj.nextInt();/*��J���*/ 
            w=0;
  
            for(i=0;i<(year-1900);i++)
            {
                if (leap_year(i+1900)==1)
                    w=(w+366)%7;	       
                else
                    w=(w+365)%7;
            } /*  �[�W�C�~���Ѽ� */ 
  
            if (leap_year(year)==1)
                days[1]=29;	       
            else
                days[1]=28;/* �|�~�P�_�覡 */
	    
            for(i=0;i< month-1;i++)
                w=w+days[i]; /* ��~����p�� */ 
            w=w%7;

            System.out.printf("\n\n ");
            System.out.print("\t"+year+"�~"+month+"��\n\n");
            System.out.print("  �@  �G  �T  �|  ��  ��  ��\n");
       
            for(j=1;j<=w;j++)
                System.out.print("    "); /* �w�d�Ů� */ 
         
            for(i=1;i<=days[month-1];i++)
            {    
                System.out.printf(" %3d",i);  
                if(i%7==(7-w)%7)
                    System.out.print("\n"); /* ��F�g��N���� */ 
            } 
      
            System.out.print("\n");
        }
        else
            System.out.print("�п�J1900�~�H�᪺�~��\n");
    }
    public static int leap_year(int x) /* �|�~�P�_��� */ 
    {
        if(x % 4 !=0)	 
            return 0;	 
        else if(x % 100 ==0 && x % 400!=0 )  
            return 0;  
        else      
            return 1;
    }
}