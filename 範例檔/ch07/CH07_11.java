/*�ɮ�:CH07_11.java
 *����:�r��w�İϪ��U�إ\���k
 */ 
public class CH07_11{
    public static void main(String[ ] args){
        StringBuffer sb1=new StringBuffer("Java");//�إߤ@�Ӧr��w�İϪ���
        System.out.println("��l�r��="+sb1);
        char ch[]={'�r','��','�w','��','��'};//�إߤ@�r���}�C
        //�s�W
        sb1.append(ch,2,3);
        System.out.println("�s�W�r��}�C: "+sb1);
        //�R��
        sb1.delete(4,7);
        System.out.println("�R���r��: "+sb1); 
        //�s�W
        sb1.append("�оǹ��");
        System.out.println("�s�W�r��: "+sb1);
        //���J
        sb1.insert(6,"�P");
        System.out.println("���J�r��: "+sb1); 
        int num=9;
        //���J		
        sb1.insert(4,num);
        System.out.println("���J�Ʀr: "+sb1);
        //���N
        sb1.replace(4,8,"���N�r��");
        System.out.println("�r����N: "+sb1);
        //����
        sb1.reverse();
        System.out.println("�r�����: "+sb1);				
    }	
}
