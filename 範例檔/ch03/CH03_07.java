public class CH03_07 {
    public static void main(String args[]) {
        int math, physical; /*�ŧi���ت�����*/
        char chr_pass;      /*�ŧi��ܦX�檺�r���ܼ�*/
        math=65;
        physical=77;
        System.out.print("�ƾ� = "+math+" ���P ���z = "+physical+" \n");
        chr_pass = ( math >= 60 && physical >= 60 )?'Y':'N';
        /*�L�Xchr_pass�ܼƤ��e�A��ܸӦҥͬO�_�X��*/
        System.out.print( "�ӦW�ҥͬO�_�X��H "+chr_pass+"\n"); 
    }
}