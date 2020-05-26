import java.util.*;
public class ljh052503{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("기본요금을 입력하세요: ");
        double mon = input.nextDouble();

        System.out.print("kg당 사용요금을 입력하세요: ");
        double usemon = input.nextDouble();

        System.out.print("전기사용량을 입력하세요: ");
        double useE = input.nextDouble();

        double totmon = mon + (useE * usemon);
        double totuseE = totmon + (totmon * 0.09);

        System.out.println("최종전기요금은 " + totuseE);
    }
}