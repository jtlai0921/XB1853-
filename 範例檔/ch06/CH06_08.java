/*�ɮ�:CH06_08.java
 *����:Arrays.equals��k���
 */

import java.util.Arrays;

public class CH06_08{
    public static void main(String[] args){
        int A[]={55,24,31,98};
        int B[]={55,24,31,98};
        int C[]={45,2,3,88,77};
		
        System.out.println(" A[]�MB[]�O�_�ۦP�G"+Arrays.equals(A,B));
        System.out.println(" A[]�MC[]�O�_�ۦP�G"+Arrays.equals(A,C));
        System.out.println(" C[]�MB[]�O�_�ۦP�G"+Arrays.equals(C,B));
		
    }
}