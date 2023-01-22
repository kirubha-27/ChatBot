import java.util.Scanner;

public class Balance {
    Balance(){
        checkBalance();
    }
    public void checkBalance(){
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Internet");
        System.out.println("2.Talk time");
        System.out.println("3.Back");
        int choice = sc.nextInt();
        switch(choice){
            case 1:
                System.out.println("1GB left");
                new Balance();
                return;
            case 2:
                System.out.println("20 minutes left");
                new Balance();
                return;
            case 3:
                new DriverClass();
        }
    }
}
