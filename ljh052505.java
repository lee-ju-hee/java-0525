import java.util.*;
public class ljh052505{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        
        System.out.print("숫자를 입력하세요: ");
        int num = input.nextInt();

        if(num % 5 == 0 && num != 0)
            System.out.println("5의 배수입니다.");
        else
            System.out.println("5의 배수가 아닙니다.");
    }
}