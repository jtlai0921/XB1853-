/*�ɮ�:CH04_03.java
 *����:if-else-if���󱱨�(1)
 */

public class CH04_03 {
    public static void main(String[] ages) {
		
        //if-else-if���ҧP�_��
        int Tim=27,Tracy=23;
        System.out.println("Tim�~��="+Tim+",Tracy�~��="+Tracy);
		
        if (Tim<Tracy){
            System.out.println("Tim�~�֤�Tracy�p"+'\n');
        }else if (Tim>Tracy){
            System.out.println("Tim�~�֤�Tracy�j"+'\n');
        }else{
            System.out.println("Tim�MTracy�~�֬ۦP");
        }
		
        Tim=23;
        System.out.println("Tim�~��="+Tim+",Tracy�~��="+Tracy);
        if (Tim<Tracy){
            System.out.println("Tim�~�֤�Tracy�p"+'\n');
        }else if (Tim>Tracy){
            System.out.println("Tim�~�֤�Tracy�j"+'\n');
        }else{
            System.out.println("Tim�MTracy�~�֬ۦP");
        }
    }
}