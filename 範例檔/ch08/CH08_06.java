//Birthday���O��@
class Birthday   // Birthday���O�ŧi
{  // �������
    public int day;
    public int month;
    public int year;
    // ������k: ��X������ƪ��X�ͦ~���
    public void printBirthday()
    {  
        System.out.println(year+"�~"+month+"��"+day+"��");
    }
}
// �D�{�����O
public class CH08_06
{   // �D�{��
    public static void main(String[] args)
    {   // �ŧiBirthday���O���A���ܼ�
        Birthday andy,michael;
        andy = new Birthday();  // �إߪ���
        michael = new Birthday();
        andy.year = 62; 
        andy.month =7;
        andy.day = 23;
        michael.year = 89; 
        michael.month =9;
        michael.day = 10;
        // �I�s���󪺹�Ҥ�k
        System.out.print("Andy���X�ͦ~���= ");
        andy.printBirthday();
        System.out.print("Michael���X�ͦ~���= ");
        michael.printBirthday();
    }
}