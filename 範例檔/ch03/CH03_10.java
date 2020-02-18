public class CH03_10 {
    public static void main(String args[]) {
        /*宣告變數*/
        float c, f;
        System.out.print("請輸入攝氏溫度：");
        java.util.Scanner input_obj=new 
                  java.util.Scanner(System.in);
        c =input_obj.nextInt();
        f=(9*c)/5+32;	/* 華氏與攝氏溫度轉換公式 */ 
        System.out.print("攝氏"+c+"度 = 華氏"+f+"度\n");
    }
}