import java.util.*;

public class ljh052501{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        
        System.out.print("첫번째 숫자를 입력하세요: ");
        int num1 = input.nextInt();

        System.out.print("두번째 숫자를 입력하세요: ");
        int num2 = input.nextInt();

        int hap = num1 + num2;
        int ca = num1 - num2;

        System.out.println("두 수의 합은: " + hap);
        System.out.println("두 수의 차는: " + ca);
        
    }
}
