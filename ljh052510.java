import java.util.*;
public class ljh052510{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        
        System.out.print("년도를 입력하세요: ");
        int year = input.nextInt();

        if(year % 400 == 0 || year % 4 == 0 && year % 100 !=0)
            System.out.println(year + "은 윤년입니다.");
        else
            System.out.println(year + "은 평년입니다.");
    }
}