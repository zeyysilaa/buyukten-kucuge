import java.util.Scanner;
public class Sayi {
    public static void main(String[] args) {
        int a, b, c;
        Scanner girdi = new Scanner(System.in);

        System.out.println("1. sayı :");
        a = girdi.nextInt();

        System.out.println("2. sayı :");
        b = girdi.nextInt();

        System.out.println("3. sayı : ");
        c = girdi.nextInt();

        if (a > b && a > c){
            if (b > c){
                System.out.println(a+ ">" +b+ ">" +c);
            } else {
                System.out.println(a+ ">" +c+ ">" +b);
            }
        }else if (b > a && b > c){
            if (a > c){
                System.out.println(b+ ">" +a+ ">" +c);
            }else{
                System.out.println(b+ ">" +c+ ">" +a);
            }
        } else if (c > a && c > b){
            if (a > b){
                System.out.println(c+ ">" +a+ ">" +b);
            }else{
                System.out.println(c+ ">" +b+ ">" +a);
            }


        }


    }
}
