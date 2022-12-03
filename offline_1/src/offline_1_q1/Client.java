package offline_1_q1;
import java.util.Scanner;

public class Client
{
    public static void main(String[] args) {
        Director dir = new Director();
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("\nEnter the type of pc: ");
            String pcType = scanner.nextLine();
            if (pcType.equalsIgnoreCase("Gaming")) {
                PCBuilder builder = new GamingPC();
                dir.build(builder);
                PC p1 = builder.getPC();
                p1.showDetails();
            }
            else if(pcType.equalsIgnoreCase("Regular-1")){
                PCBuilder builder = new RegularPC1();
                dir.build(builder);
                PC p1 = builder.getPC();
                p1.showDetails();
            }
            else if(pcType.equalsIgnoreCase("Regular-2")){
                PCBuilder builder = new RegularPC2();
                dir.build(builder);
                PC p1 = builder.getPC();
                p1.showDetails();
            }
            else if(pcType.equalsIgnoreCase("Regular-3")){
                PCBuilder builder = new RegularPC3();
                dir.build(builder);
                PC p1 = builder.getPC();
                p1.showDetails();
            }

            System.out.print("\nContinue?(Y/N): ");
        } while (!scanner.nextLine().equalsIgnoreCase("N"));
    }
}
