// ��ӯx�}�ۥ[���B��
import java.io.*;
public    class CH06_13 {
    public static void MatrixAdd(int arrA[][],int arrB[][],int arrC[][],int dimX,int dimY){
        int row,col;
        if(dimX<=0||dimY<=0) {
            System.out.println("�x�}���ƥ����j��0");
            return;
        }
        for(row=1;row<=dimX;row++)
            for(col=1;col<=dimY;col++)
                arrC[(row-1)][(col-1)]=arrA[(row-1)][(col-1)]+arrB[(row-1)][(col-1)];
    }
    public static void main(String args[]) throws IOException {
        int i;
        int j;
        int [][] A= {{1,3,5},
                     {7,9,11},
                     {13,15,17}};
        int [][] B= {{9,8,7},
                     {6,5,4},
		     {3,2,1}};
        int [][] C= new int[3][3];
        System.out.println("[�x�}A���U�Ӥ���]"); //�L�X�x�}A�����e
        for(i=0;i<3;i++){
            for(j=0;j<3;j++)
                System.out.print(A[i][j]+" \t");
            System.out.println();
        }
        System.out.println("[�x�}B���U�Ӥ���]");//�L�X�x�}B�����e
        for(i=0;i<3;i++) {
            for(j=0;j<3;j++)
                System.out.print(B[i][j]+" \t");
            System.out.println();
        }
        MatrixAdd(A,B,C,3,3);
        System.out.println("[��ܯx�}A�M�x�}B�ۥ[�����G]");	//�L�XA+B�����e
        for(i=0;i<3;i++) {
            for(j=0;j<3;j++)
                System.out.print(C[i][j]+" \t");
            System.out.println();
        }
    }
}