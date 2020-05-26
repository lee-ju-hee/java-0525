import java.util.*;
public class ljh052509{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        
        System.out.print("원가를 입력하세요: ");
        int wan = input.nextInt();

        System.out.print("판매가를 입력하세요: ");
        int pan = input.nextInt();

        double tot = (double)(pan - wan) / wan;

        if(tot >= 0.3)
            System.out.println("최상수익입니다.");
        else
        {
            if(tot >= 0.2)
                System.out.println("좋은 수익입니다.");
            else
            {
                if(tot >= 0.1)
                    System.out.println("보통수익입니다.");
                else
                    System.out.println("수익이 없습니다.");
            }
        }
    }
}