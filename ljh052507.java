import java.util.*;
public class ljh052507{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        
        System.out.print("첫번째 정수를 입력하세요: ");
        int num1 = input.nextInt();

        System.out.print("두번째 정수를 입력하세요: ");
        int num2 = input.nextInt();

        int sum = num1 + num2;
        int sub = num1 - num2;

        if(sum >sub)
            System.out.println("합이 차보다 큽니다.");
        else if(sum < sub)
            System.out.println("차가 합보다 큽니다.");
        else if(sum == sub)
            System.out.println("합과 차가 같습니다.");
    }
}