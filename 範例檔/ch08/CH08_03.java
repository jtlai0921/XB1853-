/*�ɮ�:CH08_03.java
 *����:���󪺫إߤ�k
 */ 

//�ۦ�w�q���O:student���O
class Student{
    //�غc�l
    public Student(){ 
        name="�ѥ]�W�H";
        score='A';	
    }
	
    public String name;
    public char score;

    public void show(){
        System.out.println("�m�W="+name);
        System.out.print("���Z=");
        System.out.println("["+score+"] "+'\n');
    }
    public void setdata(String name1, char score1){
        name=name1;
        score=score1;
    }
}
//�D�{��
public class CH08_03{
    public static void main(String[] args){
        Student s1=new Student();   //�إߪ���s1
        Student s2=new Student();
        Student s3;              //�ŧi����s3
        s3=new Student();   //�إߪ���s3
        s1.show();
        s2.setdata("�ӵߤH",'B');
        s2.show();
        s3.name="�p�f�r";
        s3.score='C';
        s3.show();
    }	
}
