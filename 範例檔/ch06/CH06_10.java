// �G���j�M�k

import java.io.*;
public    class ch06_10
{
public static void main(String args[]) throws IOException

   {  
	int i,j,val=1,num;
	int data[] =new int[50];
	String strM;
	BufferedReader keyin=new BufferedReader(new InputStreamReader(System.in));
	for (i=0;i<50;i++)
	{  
		data[i]=val;
		val+=((int)(Math.random()*100)%5+1);
	}
	while (true)
	{  
		num=0;
		System.out.print("�п�J�j�M���(1-150)�A��J-1�����G");
		strM=keyin.readLine();
		val=Integer.parseInt(strM);
		if(val==-1)
			break;
		num=bin_search(data,val);
		if(num==-1)
			System.out.print("##### �S�����["+val+"] #####\n");
		else
			System.out.print("�b�� "+(num+1)+"�Ӧ�m��� ["+data[num]+"]\n");
	}
	System.out.print("��Ƥ��e�G\n");
	for(i=0;i<5;i++)
	{ 
		for(j=0;j<10;j++)
			System.out.print((i*10+j+1)+"-"+data[i*10+j]+" ");
		System.out.print("\n");
	}
	System.out.print("\n");
}
public static int bin_search(int data[],int val)
{  
	int low,mid,high;
	low=0;
	high=49;
	System.out.print("�j�M�B�z��......\n");
	while(low <= high && val !=-1)
	{  
		mid=(low+high)/2;
		if(val<data[mid])
		{  
			System.out.print(val+" �����m "+(low+1)+"["+data[low]+"]�Τ����� "+(mid+1)+"["+data[mid]+"]�A�䥪�b��\n");
			high=mid-1;	
		}
		else if(val>data[mid])
		{  
			System.out.print(val+" ���󤤶��Ȧ�m "+(mid+1)+"["+data[mid]+"]�� "+(high+1)+"["+data[high]+"]�A��k�b��\n");
			low=mid+1;   	
		}
		else
			return mid;
	}
	return -1;
   }
}
