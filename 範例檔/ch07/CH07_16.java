//�ϥ�endsWith()��k�ӹL�o�ɮצW��
public class CH07_16 {  
    public static void main(String[] args) {  
        String[] extension = {"���.doc", "�s�i�H.pdf", 
               "�s�D�Z.doc", "�t��.ppt", "�ܽШ�.doc"};
        System.out.println("�ϥ�endsWith()��k�ӹL�o�ݩ�Word����ɮ�"); 
        for(int i = 0; i < extension.length; i++) 
            if(extension[i].endsWith("doc")) 
                System.out.println(extension[i]);  
   }
}