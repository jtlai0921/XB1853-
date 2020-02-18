import java.io.*;
public class CH05_11 {
    public static void main(String args[]) throws IOException {  
        int i,j,w;
        int year, month;
        int[] days= {31,28,31,30,31,30,31,31,30,31,30,31};
 
        System.out.print("請輸入西元年分:");
        java.util.Scanner input_obj=
            new java.util.Scanner(System.in);
        year=input_obj.nextInt();/* 輸入年份 */ 
    
        if  (year >= 1900)   
        {
            System.out.print("請輸入當年月份:");
            month=input_obj.nextInt();/*輸入月份*/ 
            w=0;
  
            for(i=0;i<(year-1900);i++)
            {
                if (leap_year(i+1900)==1)
                    w=(w+366)%7;	       
                else
                    w=(w+365)%7;
            } /*  加上每年的天數 */ 
  
            if (leap_year(year)==1)
                days[1]=29;	       
            else
                days[1]=28;/* 閏年判斷方式 */
	    
            for(i=0;i< month-1;i++)
                w=w+days[i]; /* 當年日期計算 */ 
            w=w%7;

            System.out.printf("\n\n ");
            System.out.print("\t"+year+"年"+month+"月\n\n");
            System.out.print("  一  二  三  四  五  六  日\n");
       
            for(j=1;j<=w;j++)
                System.out.print("    "); /* 預留空格 */ 
         
            for(i=1;i<=days[month-1];i++)
            {    
                System.out.printf(" %3d",i);  
                if(i%7==(7-w)%7)
                    System.out.print("\n"); /* 到了週日就跳行 */ 
            } 
      
            System.out.print("\n");
        }
        else
            System.out.print("請輸入1900年以後的年份\n");
    }
    public static int leap_year(int x) /* 閏年判斷函數 */ 
    {
        if(x % 4 !=0)	 
            return 0;	 
        else if(x % 100 ==0 && x % 400!=0 )  
            return 0;  
        else      
            return 1;
    }
}