/*�ɮ�:CH08_02.java
 *����:���󪺫إߤ�k
 */ 

//�ۦ�w�q���O:student���O
class student{
    //�غc�l
    public student(){ 
        name="�ѥ]�W�H";
        score='A';	
    }
	
    public String name;
    public char score;

    public void show(){
        System.out.println("�m�W="+name);
        System.out.print("���Z=");
        System.out.println("["+score+"] ");
    }
    public void setdata(String name1, char score1){
        name=name1;
        score=score1;
    }
}
//�D�{��
public class CH08_02{
    public static void main(String[] args){
        System.out.println("�S���ϥΨ�student���O�������ܼƩΤ�k");
    }	
}