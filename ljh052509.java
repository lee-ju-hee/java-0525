import java.util.*;
public class ljh052509{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        
        System.out.print("������ �Է��ϼ���: ");
        int wan = input.nextInt();

        System.out.print("�ǸŰ��� �Է��ϼ���: ");
        int pan = input.nextInt();

        double tot = (double)(pan - wan) / wan;

        if(tot >= 0.3)
            System.out.println("�ֻ�����Դϴ�.");
        else
        {
            if(tot >= 0.2)
                System.out.println("���� �����Դϴ�.");
            else
            {
                if(tot >= 0.1)
                    System.out.println("��������Դϴ�.");
                else
                    System.out.println("������ �����ϴ�.");
            }
        }
    }
}