 /*�ɮ�:CH04_15.java
 *����:return�ԭz������
 */
public class CH04_15{
    public static void main(String args[]){
        int ans;
        ans=sum(10);//�I�ssum��k
        System.out.println("1~10���[�`");
        System.out.println("ans="+ans);
    }
 	
    //sum��k
    static int sum(int n){
        int sum=0;
        for(int i=1; i<=n; i++){
            sum+=i;	
        }
        return sum; //�^��sum�ܼƭ�
    }	
}