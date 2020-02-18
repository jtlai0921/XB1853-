public class CH03_07 {
    public static void main(String args[]) {
        int math, physical; /*宣告兩科目的分數*/
        char chr_pass;      /*宣告表示合格的字元變數*/
        math=65;
        physical=77;
        System.out.print("數學 = "+math+" 分與 物理 = "+physical+" \n");
        chr_pass = ( math >= 60 && physical >= 60 )?'Y':'N';
        /*印出chr_pass變數內容，顯示該考生是否合格*/
        System.out.print( "該名考生是否合格？ "+chr_pass+"\n"); 
    }
}