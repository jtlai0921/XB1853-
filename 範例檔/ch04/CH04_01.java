/*�ɮ�:CH04_01.java
 *����:if���󱱨�
 */

public class CH04_01 {
    public static void main(String[] ages) {
		
        //if���ҧP�_��
        int Tim=20,Tracy=23;
        System.out.println("Tim�~��="+Tim+",Tracy�~��="+Tracy);
		
        if (Tim<Tracy){
            System.out.println("Tim�~�֤�Tracy�p"+'\n');
        }
		
        Tim=25;
        System.out.println("Tim�~��="+Tim+",Tracy�~��="+Tracy);
        if (Tim>Tracy){
            System.out.println("Tim�~�֤�Tracy�j"+'\n');
        }
		
        Tim=23;
        System.out.println("Tim�~��="+Tim+",Tracy�~��="+Tracy);
        if (Tim==Tracy){
            System.out.println("Tim�~�֩MTracy�@��");
        }	 
    }
}