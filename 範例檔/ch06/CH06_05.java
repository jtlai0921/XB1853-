/*�ɮ�:CH06_05.java
 *����:���s�t�m�}�C
 */ 

public class CH06_05{
    public static void main(String[] args){
        int[] A={2,4,6,8,10,12};
        System.out.println("��ܬ����ܫe�}�C���������e");
        for (int i=0;i<A.length;i++) {
            System.out.print(A[i]+" ");
        }
        System.out.println();
		
        A=new int[A.length+1]; 
        System.out.println("��ܬ����ܫ�}�C���������e");
        for (int i=0;i<A.length;i++) {
            System.out.print(A[i]+" ");
        }
        System.out.println();
    }
}