public class CH04_19 {
    public static void main(String args[]) {
       /*�Q��password�ܼƨ��x�s�K�X�H������*/    
       int i=1, new_pw, password=3388;  
       while(i<=3)/*��J���ƥH�T������*/
       {			
            System.out.print("�п�J�K�X:");  
            java.util.Scanner input_obj=
                new java.util.Scanner(System.in);
            new_pw=input_obj.nextInt(); /* ��J��ƱK�X */ 
            if (new_pw != password)/*�p�G��J���K�X�Ppassword���P*/
            {
                System.out.print("�K�X�o�Ϳ��~!!\n");    
                i++;                                     
                continue; /*���^while�}�l�B*/
            }
            System.out.print("�K�X���T!!\n ");               /*�K�X���T*/
            break;  		                       
	}  	
        if (i>3)
            System.out.print("�K�X���~�T���A�����n�J!!\n"); /* �K�X���~�B�z */ 
    }
}