import java.util.*;
public class ljh052502{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
      
        System.out.print("원가를 입력하세요: ");
        int mon = input.nextInt();
        
        System.out.print("판매액을 입력하세요: ");
        int pan = input.nextInt();
        
        System.out.print("수량을 입력하세요: ");
        int num = input.nextInt();
        
        int totpan = pan * num;
        int totget = (pan - mon) * num;
        
        System.out.println("총 판매액: " + totpan);
        System.out.println("판매이익: " + totget);
        }
}