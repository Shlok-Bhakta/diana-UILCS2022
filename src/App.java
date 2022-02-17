import java.util.Scanner;
import java.io.File;
import java.lang.Math;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(new File("dianaJUD.dat"));

        while(scanner.hasNextDouble()) {
            double x1 = scanner.nextDouble();
            double y1 = scanner.nextDouble();
            double z1 = scanner.nextDouble();
            double x2 = scanner.nextDouble();
            double y2 = scanner.nextDouble();
            double z2 = scanner.nextDouble();
            double PreRound = Math.sqrt(Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2) + Math.pow((z2-z1), 2));

            

            double temp = (PreRound*100);
            temp = Math.round(temp);
            double sol = temp/100; 
                System.out.printf("%.2f", sol);
                System.out.println();


        }
        
    }
}
