/*�ɮ�:CH06_02.java
 *����:�}�C���򥻨ϥΤ�k
 */ 

public class CH06_02{
    public static void main(String[] ages){
		
        //�}�C�ŧi
        int age[] =new int[5];
        //���w�}�C������
        age[0]=18;
        age[1]=25;
        age[2]=33;
        age[3]=48;
        age[4]=50;
		
        for(int i=0;i<=5;i++){
            if(i<age.length){
                System.out.println("��"+(i+1)+"����u���~��="+age[i]+"���C"+'\n');
            }else{
                System.out.println("��p�I�䤣���"+(i+1)+"����u�~�֪����");
            }
        }
    }
}