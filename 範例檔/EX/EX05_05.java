/*檔案:EX05_05
 *說明:將公司員工的相關資料以二維陣列建立
 */
public class EX05_05{
    public static void main(String[ ] args){
  		
        String[ ] employee=new String[]{"編號","年齡","年資"};
        //宣告建立與設初始值二維陣列
        int[ ][ ] arr2=new int[ ][ ]{{1,25,3},{2,35,8},{3,30,2}};
        for(int r=0; r<employee.length;r++)
            System.out.print(employee[r]+"\t");
        System.out.println();
        for(int i=0; i<arr2.length;i++){
            for(int j=0; j<arr2[i].length;j++){
                System.out.print(arr2[i][j]+"\t");
            }
            System.out.println( );	
        }  			
    }
}