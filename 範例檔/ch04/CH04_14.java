/*�ɮ�:CH04_14.java
 *����:continue���_�ԭz������
 */
public class CH04_14{
    public static void main(String args[]){
        int i ,j;
        for(i=1; i<10; i++){
            for(j=1; j<=i; j++){
                if(j==5) continue ;//���L�U���ԭz�~�����j��
                System.out.print(j);
            }
            System.out.println();
        }System.out.println();
        out1:
        //�]�w����
           for(i=1; i<10; i++){
               for(j=1; j<=i; j++){
                   if(j==5) continue out1;//�^����ҳB�~��
                   System.out.print(j);
               }System.out.println();
           }System.out.println();	
    }	
}