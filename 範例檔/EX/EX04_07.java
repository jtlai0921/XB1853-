public class EX04_07 {
    public static void main(String[ ] args){
        java.util.Scanner input_obj=
            new java.util.Scanner(System.in);
        int min;
        System.out.print("請輸入第一個數字= ");
        int number1=input_obj.nextInt();
        System.out.print("請輸入第二個數字= ");
        int number2=input_obj.nextInt();
        min=(number1<number2)? number1:number2;
        System.out.println("二數中較小的數其立方值="+min*min*min);
    }
}
