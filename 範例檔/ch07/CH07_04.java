/*�ɮ�:CH07_04.java
 *����:�r�����O���j�M��k
 */
import java.io.*; 
public class CH07_04{	 	
    public static void main(String[] args)throws Exception{
        String str1="Time and Tide wait for no man.";
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));//�w�q�q��L��J��J
        System.out.println("str1:"+str1);
        String s1;
        System.out.print("�п�J�n�j�M���r��:");
        s1=br.readLine();//�q��L�ƤJ�r��
        int index=0;	 		
        int len=str1.length();
        for(int i=1; i<len;i++){
            index =str1.indexOf(s1,index);
        }
        System.out.println("�b"+index+"��m���j�M���r��");			
    } 
}