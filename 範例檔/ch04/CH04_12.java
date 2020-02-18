public class CH04_12{
    public static void main(String args[]){
        int h=30,day=0;	
        do  /*do-while迴圈開始*/
        {                                 
            day++; /*天數*/
            h-=3;
            if(h>0) /*每執行一次迴圈高度減少3公尺(h=h-3)*/
                h++;  /*加回1公尺(h=h+1)*/
        } while(h>0); /*迴圈成立的條件為高度大於0*/
        System.out.print("蝸牛需要 "+day+" 天\n"); /*印出天數*/
    }	
}