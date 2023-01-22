import java.util.Scanner;

public class NewOffer {
    NewOffer(){
        newOffers();
    }
    public void newOffers(){
        Scanner sc = new Scanner(System.in);
        System.out.println("1. 4G");
        System.out.println("2. 5G");
        System.out.println("3.Back");
        int choice = sc.nextInt();
        switch(choice) {
            case 1:
                System.out.println("4G network connected");
                new NewOffer();
                return;
            case 2:
                System.out.println("5G network connected");
                new NewOffer();
                return;
            case 3:
                new DriverClass();
                return;
        }
    }
}
