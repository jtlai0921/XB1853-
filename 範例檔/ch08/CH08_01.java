/*�ɮ�:CH08_01.java
 *����:�ѼƻP�޼ƪ��ϥ�
 */ 
 
class Triangle{
    int base;
    int height;
    double ans;
	
    void Area(){
        ans=(base*height)/2;
        System.out.println("��="+base+",��="+height+"�G�T���έ��n="+ans+'\n');
    }
    double Area_2(int i){
        return ans=(i*height)/2;
    }
    double Area_3(int i,int j){
        return ans=(i*j)/2;
    }
}

class CH08_01{
    public static void main(String[] args){
        // ��@���O����
        Triangle triangle=new Triangle();
		
        triangle.base=2;
        triangle.height=8;
		
        System.out.println("����^�ǭȪ���k�A�S���޼ơG");
        triangle.Area();
        System.out.println("�㦳�^�ǭȡA��@�޼ơG");
        System.out.println("�T���έ��n="+triangle.Area_2(4)+'\n');
        System.out.println("�㦳�^�ǭȡA2�Ӥ޼ơG");
        System.out.println("�T���έ��n="+triangle.Area_3(4,10));	
    }
}