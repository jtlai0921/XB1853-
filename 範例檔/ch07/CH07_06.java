/*�ɮ�:CH07_06.java
 *����:�r�����O�������k
 */  
 
public class CH07_06{
    public static void main(String[] args){
		
        String str1="Java2";
        String str2="Java2";
        String str3="JAVA2";
		
        //����r��O�_�ۦP
        boolean a1=str1.equals(str2);
        boolean a2=str2.equals(str3);
        boolean a3=str3.equals(str1);
		
        //����r��O�_�ۦP�A�������j�p�g
        boolean b1=str1.equalsIgnoreCase(str2);
        boolean b2=str2.equalsIgnoreCase(str3);
        boolean b3=str3.equalsIgnoreCase(str1);
		
        //������
        int c1=str1.compareTo(str2);
        int c2=str2.compareTo(str3);
        int c3=str3.compareTo(str1);
		
        //����r��}�Y
        boolean d1=str1.startsWith("Ja");
        boolean d2=str2.startsWith("Ja");
        boolean d3=str3.startsWith("Ja");
		
        //����r�굲��
        boolean e1=str1.endsWith("a2");
        boolean e2=str2.endsWith("a2");
        boolean e3=str3.endsWith("A2");

        System.out.println("����r��O�_�ۦP�G"+a1+" "+a2+" "+a3+'\n');
        System.out.println("����r��O�_�ۦP�A�������j�p�g�G"+b1+" "+b2+" "+b3+'\n');
        System.out.println("�������G"+c1+" "+c2+" "+c3+'\n');
        System.out.println("����r��}�Y�G"+d1+" "+d2+" "+d3+'\n');
        System.out.println("����r�굲���G"+e1+" "+e2+" "+e3+'\n');
    }
}