/*�ɮ�:CH07_09.java
 *����:�^���r��r��
 */

public class CH07_09{
    public static void main(String[] args){
        // �ŧi�r�ꪫ��
        String str1="Java Script";
        System.out.println(str1+'\n');  //'\n'�O����
		
        //�^�����w��m���r��
        char a1=str1.charAt(5);
        char a2=str1.charAt(4);
        System.out.println("���w��m[5]�A�è��o��r���O�G"+a1);
        System.out.println("���w��m[4]�A�è��o��r���O�G"+a2+'\n');
		
        //���o�l�r��
        String str2=str1.substring(5,11);
        System.out.println("���w���o�r�ꪺ�d��A(5,11)��l�r��O�G"+str2+'\n');
		
        //�����r��æs�J���w�}�C��
        String str3="Java2";
        char b[]=str3.toCharArray();
        System.out.println("��s�J���}�C���e�G");
        System.out.println(b[0]+"�B"+b[1]+"�B"+b[2]+"�B"+b[3]+'\n');
		
        //�̯��ޭ���J
        char c[]=new char[6];   //���ŧi�r���}�C
        str3.getChars(0,4,c,2);
        System.out.println("�}�C���e�G");
        System.out.println(c[0]+"�B"+c[1]+"�B"+c[2]+"�B"+c[3]+"�B"+c[4]+ "�B"+c[5]+'\n');
    }
}