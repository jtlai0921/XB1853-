/*�ɮ�:CH07_10.java
 *����:�r��w�İϪ������Τ�k
 */ 
public class CH07_10{
    public static void main(String[ ] args){
        StringBuffer sb2=new StringBuffer(30);//�إߤ@�Ӯe�q��30���r��w�İϪ���
        String str=new String("Java Coffer");
        StringBuffer sb3=new StringBuffer(str);//�Q�Φr�ꪫ��إߦr��w�İϪ���
        //���o���׻P�e�q���
        System.out.println("sb2������:"+sb2.length());
        System.out.println("sb2���e�q"+sb2.capacity());
        System.out.println("sb3�r��w�İϪ����e:"+sb3);
        System.out.println("sb3������:"+sb3.length());
        System.out.println("sb3���e�q"+sb3.capacity());
 		
        sb3.setCharAt(4,'-');//�]�w�S�w�r��
        System.out.println("\n���s�]�w�r��w�İϤ���4�Ӧr��:"+sb3);
    }	
}