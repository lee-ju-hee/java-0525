import java.util.*;
public class ljh052503{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("�⺻����� �Է��ϼ���: ");
        double mon = input.nextDouble();

        System.out.print("kg�� ������� �Է��ϼ���: ");
        double usemon = input.nextDouble();

        System.out.print("�����뷮�� �Է��ϼ���: ");
        double useE = input.nextDouble();

        double totmon = mon + (useE * usemon);
        double totuseE = totmon + (totmon * 0.09);

        System.out.println("������������ " + totuseE);
    }
}