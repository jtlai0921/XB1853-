/*�ɮ�:CH07_07.java
 *����:�r�����O���ഫ��k
 */ 
 
public class CH07_07{
    public static void main(String[] args){
  		
        String str=new String("Time creates Hero");//�ŧi�r��
        System.out.println("��Ӫ��r��:"+str);	
        System.out.println("�ഫ�᪺�r��: "+str.toUpperCase());
        char[] ch={'S','t','r','i','n','g',' ','a','r','r','a','y'};//�ŧi�r���}�C
        System.out.println("�N�r���}�C�ഫ���r��:"+String.copyValueOf(ch, 7, 5));
        double a=78.54;//�ŧidouble�Ʀr
        System.out.println("�N�Ʀr�ഫ���r��:"+String.valueOf(a)); 
    }	
}