/*檔案:CH07_17
 *說明:利用字元陣列建立字串,並顯示字串長度和大小寫轉換
 */

public class CH07_17{
    public static void main(String[ ] args){
			
        //字元陣列建構法建立字串
        char a[ ]={'Y','M','C','A'};  //建立字元陣列
        String str1=new String(a);    
        // 顯示字串長度和大小寫轉換
        System.out.println("str1長度:"+str1.length());
        System.out.println("轉小寫:"+str1.toLowerCase());
    }
}
