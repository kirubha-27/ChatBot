import java.util.Scanner;

public class DriverClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("-----------Welcome to Chat Bot App-----------");
            System.out.println("1.Change languages");
            System.out.println("2.Balance");
            System.out.println("3.New Offers");
            System.out.println("4.My Plan");
            System.out.println("5.Exit");
            int choice = sc.nextInt();
            switch(choice){
                case 1:
                    Languages languages =  new Languages();
                    break;
                case 2:
                    Balance balance = new Balance();
                    break;
                case 3:
                    NewOffer newOffer = new NewOffer();
                case 4:
                    MyPlan myPlan = new MyPlan();
                case 5:
                    System.exit(0);

            }
        }

    }
}
