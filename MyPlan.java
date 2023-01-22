import java.util.Scanner;

public class MyPlan {
    MyPlan(){
        myPlan();
    }
    public void myPlan(){
        Scanner sc = new Scanner(System.in);
        System.out.println("1. 1.5GB");
        System.out.println("2. 2GB");
        System.out.println("3.Back");
        int choice = sc.nextInt();
        switch(choice) {
            case 1:
                System.out.println("1.5GB per day");
                new MyPlan();
                return;
            case 2:
                System.out.println("2GB per day");
                new MyPlan();
                return;
            case 3:
                new DriverClass();
                return;
        }
    }
}
