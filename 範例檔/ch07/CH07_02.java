/*�ɮ�:CH07_02.java
 *����:�r���}�C�غc�k
 */ 

public class CH07_02{
    public static void main(String[] args){
			
        //�r���}�C�غc�k�إߦr��
        char a[]={'I','L','o','v','e','j','a','v','a'};  //�إߦr���}�C
        String str1=new String(a);    
        String str2=new String(a,5,4);     
        System.out.println("������ܦr���}�Ca�G"+str1);
        System.out.println("�u���a[5]���᪺4�Ӧr���G"+str2+'\n');
		
        char b[]={'I',' ','L','o','v','e',' ','J','a','v','a'};  //�إߦr���}�C
        String str3=new String(b);    
        String str4=new String(b,6,5);     
        System.out.println("������ܦr���}�Cb�G"+str3);
        System.out.println("�u���a[6]���᪺4�Ӧr���G"+str4);

    }
}