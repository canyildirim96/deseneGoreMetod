import java.util.Scanner;
public class Practice2 {
    static int desen(int number, int temp, boolean stopSwitch) {
        System.out.print(number + " ");

        if (number <= 0) {
            return desen(number+5, temp, true);
        }
        if (!stopSwitch) {
            if (number > 0) return desen(number - 5, temp,false);
        }
        if (stopSwitch) {
            if (number < temp) return desen(number+5, temp, true);
        }
        return number;
    }
    public static void main(String[] args){
        int number;
        Scanner inp = new Scanner(System.in);
        do {
            System.out.print("Değer: ");
            number = inp.nextInt();
            desen(number,number,false);
            System.out.println();
        }while (number>0);

    }


}
