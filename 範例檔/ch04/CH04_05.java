/*�ɮ�:CH04_05.java
 *����:switch����ԭz
 */

public class CH04_05{
    public static void main(String[] ages){
		
        //�ܼƫŧi
        char math_score='A';
        System.out.println("Michael�ƾǦ��Z�G"+math_score);
        switch(math_score){
            case'A':
                System.out.println("�v�����y�G�D�`�n�I�u�O�u�q"+'\n');
                break;  // break���ηN�O���Xswitch����P�_��
            case'B':
                System.out.println("�v�����y�G�v�����y�G�]�����A���٥i�H��n"+'\n');
                break;  // break���ηN�O���Xswitch����P�_��
            case'C':
                System.out.println("�v�����y�G�u���n�h�Υ\"+'\n');
                break;  // break���ηN�O���Xswitch����P�_��
            default:
                System.out.println("�v�����y�G���n�g���A���ۤv�hŪ�� "+'\n');
        }
		
        math_score='C';
        System.out.println("Jane�ƾǦ��Z�G"+math_score);
        switch(math_score){
            case'A':
                System.out.println("�v�����y�G�D�`�n�I�u�O�u�q"+'\n');
                break;  // break���ηN�O���Xswitch����P�_��
            case'B':
                System.out.println("�v�����y�G�v�����y�G�]�����A���٥i�H��n"+'\n');
                break;  // break���ηN�O���Xswitch����P�_��
            case'C':
                System.out.println("�v�����y�G�u���n�h�Υ\"+'\n');
                break;  // break���ηN�O���Xswitch����P�_��
            default:
                System.out.println("�v�����y�G���n�g���A���ۤv�hŪ�� "+'\n');
        }
    }
}