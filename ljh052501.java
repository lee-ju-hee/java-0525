import java.util.*;

public class ljh052501{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        
        System.out.print("ù��° ���ڸ� �Է��ϼ���: ");
        int num1 = input.nextInt();

        System.out.print("�ι�° ���ڸ� �Է��ϼ���: ");
        int num2 = input.nextInt();

        int hap = num1 + num2;
        int ca = num1 - num2;

        System.out.println("�� ���� ����: " + hap);
        System.out.println("�� ���� ����: " + ca);
        
    }
}
