public class CH05_03 {
    static  float square(float x) /* �w�qsquare()��� */ 
    {
        return x*x; 
    }
    // �D�{��
    public static void main(String[] args) {
        float x;
        System.out.print("�п�Jx��:"); 
        java.util.Scanner input_obj=
            new java.util.Scanner(System.in);
        x=input_obj.nextInt();
        System.out.print(x+"^2="+square(x)+"\n");/* �I�ssquare()��� */ 
    }
}