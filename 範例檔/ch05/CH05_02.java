/* �ܽd�ǤJ���P���r���P�ƭȡA�|�����P����X�~�[ */
public class CH05_02 {
    // ���O��k: �]�t2�ӰѼ�,�i�H���w�n��X���r���Ÿ��έӼ�
    static void myprint(char ch, int num) {
        int i;
        for (i=1; i<=num; i++) {
            System.out.print(ch);
        }
        System.out.println();
    }
    // �D�{��
    public static void main(String[] args) {
        myprint('*',10);
        myprint('$',20);
        myprint('%',30);
    }
}