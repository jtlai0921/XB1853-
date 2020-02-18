/*檔案:CH07_13.java
 *說明:字串緩衝區--取得部份字串
 */ 

public class CH07_13{
    public static void main(String[] args){
        StringBuffer sb=new StringBuffer("Hello Java"); 
        char a[]=new char[12];
        sb.getChars(6,10,a,0);
        System.out.print("取得部份字串=");
        for(int i=0;i<4;i++)
            System.out.print(a[i]);
    }
}