public class CH04_12{
    public static void main(String args[]){
        int h=30,day=0;	
        do  /*do-while�j��}�l*/
        {                                 
            day++; /*�Ѽ�*/
            h-=3;
            if(h>0) /*�C����@���j�鰪�״��3����(h=h-3)*/
                h++;  /*�[�^1����(h=h+1)*/
        } while(h>0); /*�j�馨�ߪ����󬰰��פj��0*/
        System.out.print("�����ݭn "+day+" ��\n"); /*�L�X�Ѽ�*/
    }	
}