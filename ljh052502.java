import java.util.*;
public class ljh052502{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
      
        System.out.print("������ �Է��ϼ���: ");
        int mon = input.nextInt();
        
        System.out.print("�Ǹž��� �Է��ϼ���: ");
        int pan = input.nextInt();
        
        System.out.print("������ �Է��ϼ���: ");
        int num = input.nextInt();
        
        int totpan = pan * num;
        int totget = (pan - mon) * num;
        
        System.out.println("�� �Ǹž�: " + totpan);
        System.out.println("�Ǹ�����: " + totget);
        }
}