 /*�ɮ�:CH04_17.java
 *����:��@ for-each-- �h���}�C
 */

public class CH04_17{
    public static void main(String[] ages){
        int A[][]=new int[2][3];   //�ŧi�h���}�C
        for (int i=0;i<2;i++){    //�]�w�}�C�����ȡA�åBŪ���}�C��
            for (int j=0;j<3;j++){
                A[i][j]=i+j;
                System.out.print(A[i][j]+" ");
            }
        }
        System.out.println('\n');
        for (int i[]:A){     // ���for-each�j��Ū���}�C���
            for (int j:i){
                System.out.print(j+" ");
            }
        }
        System.out.println('\n');
    }
}