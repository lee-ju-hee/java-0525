import java.util.*;
public class ljh052505{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        
        System.out.print("���ڸ� �Է��ϼ���: ");
        int num = input.nextInt();

        if(num % 5 == 0 && num != 0)
            System.out.println("5�� ����Դϴ�.");
        else
            System.out.println("5�� ����� �ƴմϴ�.");
    }
}