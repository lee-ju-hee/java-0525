import java.util.*;
public class ljh052504{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        
        System.out.print("���ڸ� �Է��ϼ���: ");
        int num = input.nextInt();

        if(num % 2 ==0)
            System.out.println("¦���Դϴ�.");
        else
            System.out.println("Ȧ���Դϴ�.");
    }
}