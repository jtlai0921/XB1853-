/*�ɮ�:CH04_11.java
 *����:do while�ԭz������
 */
public class CH04_11{
    public static void main(String args[]){
        int n=40,m=180;
        int temp=0;//�@���洫n�Pm���\��
        System.out.println("n="+n+",m="+m); 
        //do while�j��}�l		
        do{
            temp=m%n;
            m=n;
            n=temp;
        }while(n!=0 );//�ˬd����B�⦡
        System.out.println("��ƪ��̤j���]��="+m);
    }	
}