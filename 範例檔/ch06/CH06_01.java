/*�ɮ�:CH06_01.java
 *����:�}�C���򥻨ϥΤ�k
 */ 
public class CH06_01{
    public static void main(String[] args){
        String[] course=new String[5];//�ŧi�ëإߤ@�Ӧr�ꪫ��}�C
        //�]�w��l��
        course[0]="�m�W";
        course[1]="���";
        course[2]="�ƾ�";
        course[3]="���|";
        course[4]="�۵M";
        //��X�U���ئW��
        for(int i=0; i<course.length;i++){
            System.out.print(course[i]+"\t");
        }
        System.out.println();
        System.out.print("�d�l��\t");
        int[] score=new int[]{100,96,97,86};//�ŧi�إߩM�]�w��l�Ⱦ�ư}�C
        int sum=0;
        for(int i=0; i<score.length;i++){
            System.out.print(score[i]+"\t");
            sum+=score[i];
        }
        System.out.println();
        System.out.println("�`��="+sum);
        System.out.println("����="+(float)sum/score.length);
    }	
}