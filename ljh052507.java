import java.util.*;
public class ljh052507{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        
        System.out.print("ù��° ������ �Է��ϼ���: ");
        int num1 = input.nextInt();

        System.out.print("�ι�° ������ �Է��ϼ���: ");
        int num2 = input.nextInt();

        int sum = num1 + num2;
        int sub = num1 - num2;

        if(sum >sub)
            System.out.println("���� ������ Ů�ϴ�.");
        else if(sum < sub)
            System.out.println("���� �պ��� Ů�ϴ�.");
        else if(sum == sub)
            System.out.println("�հ� ���� �����ϴ�.");
    }
}