public class CH04_20 {
    public static void main(String args[]) {
        int a=1,n;
        System.out.print("�п�J�@�ӼƦr�G");
        java.util.Scanner input_obj=
            new java.util.Scanner(System.in);
        n=input_obj.nextInt(); /* ��J�@�Ӿ�� */ 
        System.out.print(n+"���Ҧ��]�Ƭ�:");
        while(a<=n)  /*�w�qwhile�j��,�B�]�w����a<=n*/
        {
            if(n%a==0)/*��n����Qa�㰣��~�ha�N�On���]��*/ 
            {         /*�h����if�����ԭz*/
                 System.out.print(a+" ");    
                 if(n!=a)
                     System.out.print(",");/* �H,���Ӷ��j */ 
            }
            a++;   /*a�Ȼ��W1*/
       }
       System.out.println();
    }
}