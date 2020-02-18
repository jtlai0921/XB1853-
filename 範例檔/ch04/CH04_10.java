public class CH04_10{
    public static void main(String args[ ]){
        int n;
        System.out.print("請輸入任一整數:"); 
        java.util.Scanner input_obj=
             new java.util.Scanner(System.in);
        n=input_obj.nextInt();
        System.out.println("反向輸出的結果:"); 
        while (n!=0) /* while迴圈 */ {
            System.out.print(n%10);/* 求出餘數值 */ 
            n/=10;
        } 
        System.out.println();
    }	
}