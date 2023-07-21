package is_magic;
import java.util.Scanner;

public class ismagicpro {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        
        int number=scanner.nextInt();

        int isMagic=findIsMagic(number);
        System.out.println(isMagic);
    }

    private static int findIsMagic(int number) {
        if(number==1){
            return 1;
        }
        else if(number>1 && number<10) {
            return 0;
        }
        else{
            return(findIsMagic(digitSum(number)));
        }
    }

    private static int digitSum(int number){
        if(number==0){
            return 0;
        }
        return number%10 + digitSum(number/10);
    }
}