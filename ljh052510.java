import java.util.*;
public class ljh052510{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        
        System.out.print("�⵵�� �Է��ϼ���: ");
        int year = input.nextInt();

        if(year % 400 == 0 || year % 4 == 0 && year % 100 !=0)
            System.out.println(year + "�� �����Դϴ�.");
        else
            System.out.println(year + "�� ����Դϴ�.");
    }
}