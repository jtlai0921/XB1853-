/*�ɮ�:CH04_06.java
 *����:for�j������
 */
public class CH04_06{
    public static void main(String args[]){
        System.out.println("1~10���_�ƪ��M");
        int sum=0;//�]�w�`�M���_�l�Ȭ�0
        System.out.println("�Ҧ����_��:");
        for(int i=1; i<=10;i++){
            if(i%2!=0){//�Q��if�ԭz�T�wi���_��
                sum+=i;
                System.out.print(i+" ");
            }
        }
        System.out.println();
        System.out.println("����="+sum);//��X����	
    }	
}