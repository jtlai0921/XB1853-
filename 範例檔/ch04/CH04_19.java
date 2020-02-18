public class CH04_19 {
    public static void main(String args[]) {
       /*利用password變數來儲存密碼以供驗證*/    
       int i=1, new_pw, password=3388;  
       while(i<=3)/*輸入次數以三次為限*/
       {			
            System.out.print("請輸入密碼:");  
            java.util.Scanner input_obj=
                new java.util.Scanner(System.in);
            new_pw=input_obj.nextInt(); /* 輸入整數密碼 */ 
            if (new_pw != password)/*如果輸入的密碼與password不同*/
            {
                System.out.print("密碼發生錯誤!!\n");    
                i++;                                     
                continue; /*跳回while開始處*/
            }
            System.out.print("密碼正確!!\n ");               /*密碼正確*/
            break;  		                       
	}  	
        if (i>3)
            System.out.print("密碼錯誤三次，取消登入!!\n"); /* 密碼錯誤處理 */ 
    }
}