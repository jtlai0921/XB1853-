/*�ɮ�:CH07_14.java
 *����:�r��w�İ�--�R���r��Φr��
 */ 

public class CH07_14{
    public static void main(String[ ] args){
        StringBuffer  sb=new StringBuffer("Hello Java"); 
        System.out.println("�ܽd�r��G"+sb);
        System.out.println("�R���e��[0~5]�������r��="+sb.delete(0,5)+'\n');	
		
        StringBuffer  sb2=new StringBuffer("Hello Javaa");
        System.out.println("�ܽd�r��G"+sb2);
		
        System.out.println("�R�����w�r��="+sb2.deleteCharAt(10)+'\n');	
    }
}