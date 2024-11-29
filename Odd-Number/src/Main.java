import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int nbr, total = 0;

        boolean isEvenNbr = true;

        while (isEvenNbr){

            System.out.print("Sayı giriniz => ");
            nbr = scan.nextInt();

            if (nbr % 2 == 0){
                for (int i = 1; i <= nbr; i++){
                    if (i % 4 == 0){

                        total += i;
                    }
                }
            }else {
                isEvenNbr = false;
            }

            System.out.println(total);
            total = 0;

        }

    }
}
