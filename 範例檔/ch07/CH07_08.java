/*�ɮ�:CH07_08.java
 *����:�r��걵
 */

public class CH07_08{
    public static void main(String[] args) {
        // �ŧi�r�ꪫ��
        String str1="Power";
        String str2="Point";
		
        // �걵�r��覡�@
        String str3=str1+str2;
        String str4="Power"+"Point";
		
        // �걵�r��覡�G
        String str5=str1.concat(str2);
        String str6=str1.concat("Point");
		
        System.out.println("�걵�r��覡�@�G");
        System.out.println(str3);
        System.out.println(str4);
        System.out.println();
		
        System.out.println("�걵�r��覡�G�G");
        System.out.println(str5);
        System.out.println(str6);

    }
}