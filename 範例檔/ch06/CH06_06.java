/*�ɮ�:CH06_06.java
 *����:����}�C
 */

public class CH06_06{
    public static void main(String[] args){
        String A[]={"����","���R","�H�q","�M��"};
        for (int i=0;i<A.length;i++){
            System.out.print(A[i]+" ");
        }
        System.out.println();
        System.out.println(" A[0]="+A[0]);
        System.out.println(" A[1]="+A[1]);
        System.out.println();
		
        A[1]=A[2];
        for (int i=0;i<A.length;i++){
            System.out.print(A[i]+" ");
        }
        System.out.println();
        System.out.println(" A[1]="+A[1]);
        System.out.println();
    }
}