public class CH03_11 {
    public static void main(String args[]) {
        int num=2850,hundred,fifty,ten;
        hundred=num/100;
        fifty=(num-hundred*100)/50;
        ten=(num-hundred*100-fifty*50)/10;
        /*�Q��²�檺�|�h�B��*/ 
        System.out.print("�ʤ��ȶr��"+hundred+
            "�i ���Q���w����"+fifty+
            "�� �Q���r�w����"+ten+"��\n");
    }
}