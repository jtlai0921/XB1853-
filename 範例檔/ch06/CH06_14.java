//�}�C������-�ֳz�m�����;�
public class CH06_14{
    public static void main(String[] args){
        //��ƫŧi
        int[] intArray=new int[6];//�s�񲣥ͪ��üƸ��X
        int intRandCount=0;       //���Ͷüƭp�ƾ�
        int intBackCount=0;       //���ͶüƮɪ�^�ˬd�έp�ƾ�
        boolean boolRepeat=false; //��^�ˬd�ɧP�_�O�_����
		
        //�Q�ΰj�鲣��6�Ӹ��X
        for(int i=0;i<6;i++){
            intRandCount++;
            intArray[i]=(int)(Math.random()*42+1);
            intBackCount=i-1;
            boolRepeat=false;
            while(i>0 && intBackCount>=0){
                if(intArray[i]==intArray[intBackCount]){
                    i--;
                    boolRepeat=true;
                    break;
                }	
                intBackCount--;	
            }
            //���ˬd�L���ƮɡA�L�X�ӼƦr
            if(!boolRepeat)
                System.out.println("�� "+(i+1)+" �ӼƦr���G"+intArray[i]);
        }
        System.out.println("�ü��`�@���ͤF "+intRandCount+" ��");
    }
}