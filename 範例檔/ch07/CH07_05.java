/*�ɮ�:CH07_05.java
 *����:�U�ئr�����O���򥻨ϥΤ�k
 */ 
 
public class CH07_05{
    public static void main(String[] args){
 		
        String str="Happy Birthday to you";
 		
        //���N�r��
        String str_new=str.replace("you","Joe");
        System.out.println("���N�e�G"+str);
        System.out.println("���N��G"+str_new+'\n');
 		
        //�h���ťճ���
        String str2="   Happy Birthday to you  ";
        System.out.println("�h���ťիe�A�r����סG"+str2.length());
        String str2_new=str.trim();
        System.out.println("�h���e�G"+str2);
        System.out.println("�h����G"+str2_new);
        System.out.println("�h���ťի�A�r����סG"+str2_new.length());
    }	
}