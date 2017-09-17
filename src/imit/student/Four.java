package imit.student;

/**
 * Created by Student on 04.09.2017.
 */
import java.util.Scanner;
public class Four {
    public static void main(String[] args) {
        double discriminant;
        int quan = 0;
        double[] answer = new double[2];
        Scanner in = new Scanner(System.in);
        System.out.println("Введите 3 индекса, первый при x^2, второй при x, третий свободный");
        double firstindex = in.nextDouble();
        double secondindex = in.nextDouble();
        double thirdindex = in.nextDouble();
        if (firstindex == 0 && secondindex != 0) {
            System.out.println("Число корней: 1");
            answer[0] = -(thirdindex / secondindex);
            if(answer[0]==0.0){
                answer[0]=-answer[0];
            }
            System.out.println("Корень: " + answer[0]);
        } else {
            discriminant = secondindex * secondindex - 4 * firstindex * thirdindex;
            if (firstindex == 0 && secondindex == 0 && thirdindex == 0) {
                System.out.println("Решений бесконечно много!");
            } else {
                if (firstindex == 0 && secondindex == 0) {
                    System.out.println("Решений не существует!");
                } else {
                    if (discriminant == 0) {
                        answer[0] = (0 - secondindex) / (2 * firstindex);
                        quan = 1;
                    }
                    if (discriminant < 0) {
                        quan = 0;
                    }
                    if (discriminant > 0) {
                        quan = 2;
                        answer[0] = (0 - secondindex + Math.sqrt(discriminant)) / (2 * firstindex);
                        answer[1] = (0 - secondindex - Math.sqrt(discriminant)) / (2 * firstindex);
                    }
                    System.out.print("Число корней: " + quan);
                    if(quan==1){
                        System.out.print(" кратности 2");
                    }
                    System.out.print("\nКорни: ");
                    for (int i = 0; i < quan; i++) {
                        System.out.print(answer[i]+" ");
                    }
                }
            }
        }
    }
}
