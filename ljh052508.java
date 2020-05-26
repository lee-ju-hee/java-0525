import java.util.*;
public class ljh052508{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        
        System.out.print("수량을 입력하세요: ");
        int num = input.nextInt();

        System.out.print("단가를 입력하세요: ");
        int mon = input.nextInt();

        int tot = num * mon;

        if(num >= 20)
            System.out.println("값은 " + (tot * 0.8) + "입니다.");
        else
        {
            if(num >= 10)
                System.out.println("값은 " + (tot * 0.9) + "입니다.");
            else
                System.out.println("값은 " + tot + "입니다.");
        }
        
    }
}