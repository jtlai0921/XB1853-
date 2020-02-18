/*檔案:CH04_07.java
 *說明:計算10! 的值
 */
public class CH04_07{
    public static void main(String args[]){
        int i,sum=1;
        for (i=1;i<=10;sum*=i,i++); /*定義for迴圈*/
            System.out.print("sum="+sum+'\n');/*印出i和sum的值*/
    }	
}