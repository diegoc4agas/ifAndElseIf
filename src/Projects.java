import java.util.Scanner;
public class Projects {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Informe o número: ");
        int L = sc.nextInt();
        if (L < 10) {
            System.out.println("true10");
        } else if(L < 20){
            System.out.println("true20");
        } else if (L < 30){
            System.out.println("true30");
        } else if(L < 40){
            System.out.println("true40");
        } else{
            System.out.println("false");
        }
    }
}
