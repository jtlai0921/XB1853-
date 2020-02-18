public class CH04_20 {
    public static void main(String args[]) {
        int a=1,n;
        System.out.print("請輸入一個數字：");
        java.util.Scanner input_obj=
            new java.util.Scanner(System.in);
        n=input_obj.nextInt(); /* 輸入一個整數 */ 
        System.out.print(n+"的所有因數為:");
        while(a<=n)  /*定義while迴圈,且設定條件為a<=n*/
        {
            if(n%a==0)/*當n能夠被a整除時~則a就是n的因數*/ 
            {         /*則執行if內的敘述*/
                 System.out.print(a+" ");    
                 if(n!=a)
                     System.out.print(",");/* 以,號來間隔 */ 
            }
            a++;   /*a值遞增1*/
       }
       System.out.println();
    }
}