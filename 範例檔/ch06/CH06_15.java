//��l�ư}�C�έp��ǥͦ��Z���G��
public class CH06_15{
    public static void main(String[] args){
        //��ƫŧi
        int score[]={99,98,91,88,65,69,97,57,77,63};//�ŧi�ê�l�ư}�C
        int degree[]=new int[10]; //�ŧi�ê�l�ư}�C
        int i,j,sum=0;
        double avg=0.0;

        //�Q�ΰj��p���`���A�û��W���������ƯŶZ�H��
        for (i=0; i<10; i++)
        {
            sum += score[i]; //�p���`��
            if (score[i]/10 == 10)
                degree[9]++; //���Z��100�A�h�N���ޭ�9�������[1
            else
                degree[score[i]/10]++;  //���W���������ƯŶZ�H�� 
        }
        avg = (double)sum /(double)10; //�p�⥭��

        System.out.println("�`��="+sum+" ,����="+avg);
        System.out.println("�H�Ƥ��G�Ϧp�U�G");
        System.out.print("���ƯŶZ\t�H��\n");
        for (i=0; i<10; i++)
        {
            System.out.print(i*10+" ~ "+(i*10+9)+" \t"); //�]�w���ƯŶZ����X��r
            for (j=0;j<degree[i];j++)
                System.out.print("*"); //�H�P���N��ӯŶZ���H��
            System.out.print("\n");
        }
    }
}