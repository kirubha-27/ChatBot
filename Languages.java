import java.util.Scanner;

public class Languages {
    Languages(){
        changeLanguage();

    }
    public void changeLanguage(){
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Tamil");
        System.out.println("2.English");
        System.out.println("3.Back");
        int choice = sc.nextInt();
        switch(choice){
            case 1:
                System.out.println("changed to Tamil language");
                new Languages();
                return;
            case 2:
                System.out.println("changed to English");
                new Languages();
                return;
            case 3:
                new DriverClass();
        }
    }
}
