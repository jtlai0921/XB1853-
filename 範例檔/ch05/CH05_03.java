public class CH05_03 {
    static  float square(float x) /* 定義square()函數 */ 
    {
        return x*x; 
    }
    // 主程式
    public static void main(String[] args) {
        float x;
        System.out.print("請輸入x值:"); 
        java.util.Scanner input_obj=
            new java.util.Scanner(System.in);
        x=input_obj.nextInt();
        System.out.print(x+"^2="+square(x)+"\n");/* 呼叫square()函數 */ 
    }
}