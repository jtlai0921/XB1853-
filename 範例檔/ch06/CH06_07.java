/*�ɮ�:CH06_07.java
 *����:Arrays.fill��k���
 */

import java.util.Arrays;
public class CH06_07{
    public static void main(String[] args){
        int A[]=new int[5];
        System.out.println("�w�w��l��");
		
        for (int i=0;i<A.length;i++){
            System.out.print(A[i]+" ");
        }
        System.out.println();
        Arrays.fill(A, 5); 
        System.out.println("�ץ����l��");
		
        for (int i=0;i<A.length;i++){
            System.out.print(A[i]+" ");
        }
        System.out.println();
    }
}