/* ���O�ܼƪ��ŧi���  */
public class CH05_05 {
    // �ŧi���O�ܼ�
    static int value=0;
    // �ŧi���O��k
    static void add100() { value=value+100; }
    // �D�{��
    public static void main(String[] args) {
        System.out.println("�ثe����= "+ value);
        add100();
        System.out.println("�ثe����= "+ value);
        add100();
        System.out.println("�ثe����= "+ value);
    }
}