/*
 *說明:建立長度是8的一維陣列，並利用for迴圈讀取陣列值
 */
public class EX06_06{
    public static void main(String[ ] args){
  		
        //陣列宣告
        int[] age=new int[8];
        //給定陣列元素值
        age[0]=18;
        age[1]=25;
        age[2]=33;
        age[3]=48;
        age[4]=50;
        age[5]=77;
        age[6]=158;
        age[7]=78;
		
        for(int i=0;i<=7;i++){
            System.out.println("age["+i+"]="+age[i]);
        }
    }
}
