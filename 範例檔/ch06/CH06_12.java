import java.io.*;
public class ch06_12
{
    public static void main(String args[]) throws IOException 
    {  
        int[][][] num=new int[][][]
                  {{{43,45,67},
                   {73,71,56},
                   {55,38,66}},
                  {{21,39,25 },
                   {38,89,18},
                   {90,101,89}}};/* �ŧi�T���}�C */
        System.out.print("�T���}�C���̤p��= "+min(num,2,3,3)+"\n"); 
    }	
    static int min(int[][][] arr,int a,int b,int c)/* �w�qmin()��ƥD�� */ 
    {
        int i,j,k,min_value;
        min_value=arr[0][0][0];/* �]�wmin_value���Ȭ��}�C���Ĥ@�Ӥ����� */ 
        for(i=0;i<a;i++)	     
            for(j=0;j<b;j++)    
                for(k=0;k<c;k++)           
                    if(min_value>=arr[i][j][k])
                        min_value=arr[i][j][k]; /* �Q�ΤT�h�j���X�̤p�� */
        return min_value; /* �Ǧ^��� min_value */ 
    }
}