import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
        System.out.println("Я считаю зарплату по ведомости, введи кол-во работников");
        int sumZarplat = 0;
        int cointWork = 1;
        int zarPlat;
        int amountWork;
        amountWork = scanner.nextInt();
        System.out.println("Ты ввёл " + amountWork + " работников,теперь введи зарплату для каждого,и я скажу общую сумму денег,которую ты должен заплатить работникам");
        while (cointWork <= amountWork) {
            zarPlat = scanner.nextInt();
            sumZarplat += zarPlat;
            cointWork++;
        }
        System.out.println("В сумме ты должен заплатить работникам: " + sumZarplat);
        }catch (Expection ex) {
          System.out.println("Ты ввёл что-то не так");
        }
    }
}
