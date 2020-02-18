public class CH05_04 {
    static void CallByAddress(int[] x)
    {
        x[0] = 30;
        x[1] = 10;
    }

    // 主程式
    public static void main(String[] args) {
        int i;     
        int[] x ={ 10,30};
        for(i=0;i<2;i++)
            System.out.print( "傳址呼叫前：x["+i+"]="+x[i]+"\n");
        CallByAddress(x);
        for(i=0;i<2;i++)
            System.out.print( "傳址呼叫後：x["+i+"]="+x[i]+"\n");
    }
}