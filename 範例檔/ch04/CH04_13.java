/*�ɮ�:CH04_13.java
 *����:break���_�ԭz������
 */
public class CH04_13{
    public static void main(String args[]){
        int i ,j;
        System.out.println("���X��h�j��");
        for(i=1; i<10; i++){
            for(j=1; j<=i; j++){
                if(j==5) break ;//���X��h�j��
                System.out.print(j);
            }
            System.out.println();
        }System.out.println();

        System.out.println("���X���h�j��");
        out1://�]�w����
        for(i=1; i<10; i++){
            for(j=1; j<=i; j++){
                if(j==5) break out1;//���X����
                System.out.print(j);
            }
            System.out.println();
        }System.out.println();
    }	
}