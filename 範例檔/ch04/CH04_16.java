 /*�ɮ�:CH04_16.java
 *����:��@ for-each
 */

public class CH04_16{
    public static void main(String[] ages){
        int A[]={1,2,3,4,5,6,7,8,9};
        char B[]={'H','a','p','p','y'};
        System.out.println("�Ʀr�}�C"); // �ǲ�for�j��Ū���}�C���
        for (int i=0;i<A.length;i++){
            System.out.print(A[i]+" ");
        }
        System.out.println('\n');
        System.out.println("�r���}�C");
        for (int i=0;i<B.length;i++) {
            System.out.print(B[i]+" ");
        }
        System.out.println('\n');
        System.out.println("�Ʀr�}�C"); // �s�Wfor-each�j��Ū���}�C���
        for (int i:A){
            System.out.print(i+" ");  //����Ū���}�C����������
        }
        System.out.println('\n');
        System.out.println("�r���}�C");
        for (char i:B){
            System.out.print(i+" ");// �]���}�CB�������O�r���A�ҥHi�����ŧi��char
        }
        System.out.println('\n');
    }
}