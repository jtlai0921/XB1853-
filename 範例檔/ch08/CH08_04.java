/*�ɮ�:CH08_04.java
 *����:���󪺫إߤ�k(�T)
 */ 

//�ۦ�w�q���O:student���O
class Student{
    //�غc�l
    public Student(){ 
        name="�ѥ]�W�H";
        score='A';	
    }
	
    public static String name;
    public static char score;

    public static void show(){
        System.out.println("�m�W="+name);
        System.out.print("���Z=");
        System.out.println("["+score+"] "+'\n');
    }
    public static void setdata(String name1, char score1){
        name=name1;
        score=score1;
    }
}
//�D�{��
public class CH08_04{
    public static void main(String[] args){
        new Student();    
        Student.name="�ӵߤH";
        Student.score='B';
        Student.show();
        Student.setdata("�p�f�r",'C');
        Student.show();
    }	
}