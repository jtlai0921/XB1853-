//�|�~���P�_�P����
public class CH04_18 {
    public static void main(String args[]) {
        int year=2008;//�褸�~
        //�ŧi����ܼ�
	if(year % 4 !=0) /*�p�Gyear���O4������*/
	    System.out.println(year+" �~���O��~�C"); /*�h���year���O��~*/
	else if(year % 100 ==0)  /*�p�Gyear�O100������*/
        {
            if(year % 400 ==0)   /*�Byear�O400������*/
	        System.out.println(year+" �~�O��~�C"); 
                /*���year�O��~*/
            else      /*�_�h*/
                System.out.println(year+" �~���O��~�C"); 
                /*�h���year���O��~*/
        }	
        else  /*�_�h*/
            System.out.println(year+" �~�O��~�C"); /*�h���year�O��~*/
   }
}