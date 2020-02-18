public class CH03_11 {
    public static void main(String args[]) {
        int num=2850,hundred,fifty,ten;
        hundred=num/100;
        fifty=(num-hundred*100)/50;
        ten=(num-hundred*100-fifty*50)/10;
        /*利用簡單的四則運算*/ 
        System.out.print("百元紙鈔有"+hundred+
            "張 五十元硬幣有"+fifty+
            "個 十元鈔硬幣有"+ten+"個\n");
    }
}