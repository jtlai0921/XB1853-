/*�ɮ�:CH07_01.java
 *����:�U�ئr�����O���إߤ�k
 */ 
public class CH07_01{
    public static void main(String[] args){
        char ch1[] = {'h','e','l','l','o'};//�ŧi�r���}�C
        String s1="How are you";//�ŧi�򥻫��A�r��
        String s2 = new String("I am fine,thanks");	//�إߦr�����O����ê�l��
        String str1=new String(ch1);		
        String str2=new String(ch1,2,3);
        String str3=new String(s1);
        String str4=new String(s2);
        System.out.println("�H�r���}�C�@�Ѽƫإߦr�ꪺ���e:"+str1);
        System.out.println("�H�r���}�C�ë��w�r�ƫإߦr�ꪺ���e:"+str2);
        System.out.println("�H�r��@�Ѽƫإߦr�ꪺ���e:"+str3);
        System.out.println("�H�r�ꪫ��@�Ѽƫإߦr�ꪺ���e:"+str4);
    }	
}