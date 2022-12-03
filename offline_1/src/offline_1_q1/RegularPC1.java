package offline_1_q1;
import java.util.Scanner;

public class RegularPC1 implements PCBuilder{
    PC pc = new PC();

    @Override
    public void addProcessor() {
        pc.add("11th Gen Intel Core i5");
    }

    @Override
    public void setProcessorPrice() {
        pc.add("20000");
    }

    @Override
    public void addCPU() {
        pc.add("CPU-type1");
    }

    @Override
    public void addMB() {
        pc.add("CPU-type2");
    }

    @Override
    public void addHDD() {
        pc.add("1TB");
    }

    @Override
    public void setBasePrince() {
        pc.add("70000");
    }

    @Override
    public void addCPUCooler() {
        pc.add("CPU cooler");
    }

    @Override
    public void setCPUCoolerPrice() {
        pc.add("36000");
    }

    @Override
    public void liquidCooler() {
        pc.add("Liquid cooler");
    }

    @Override
    public void LiquidCoolerPrice() {
        pc.add("0");
    }

    @Override
    public void addDrive() {
        pc.add("DVD Drive");
    }

    @Override
    public void setDrivePrice() {
        pc.add("0");
    }

    @Override
    public void addRAM() {
        int count1 = 0, count2 = 0;
        pc.add("2666 MHz");
        pc.add("3200 MHz");

        while(true){
            System.out.print("RAM: ");
            Scanner scanner = new Scanner(System.in);
            String RAMType = scanner.nextLine();
            if(RAMType.equalsIgnoreCase("skip"))    break;
            else if (RAMType.equalsIgnoreCase("2666 MHz")) {
                count1++;
            } else if (RAMType.equalsIgnoreCase("3200 MHz")) {
                count2++;
            }
        }

        pc.add(String.valueOf(count1));
        pc.add(String.valueOf(count2));
        pc.add("2620");
        pc.add("2950");
    }

    @Override
    public void addGraphicsCard() {
        int count1 = 0, count2 = 0;
        pc.add("2GB");
        pc.add("4GB");

        while(true){
            System.out.print("Graphics Card: ");
            Scanner scanner = new Scanner(System.in);
            String RAMType = scanner.nextLine();
            if(RAMType.equalsIgnoreCase("skip"))    break;
            else if (RAMType.equalsIgnoreCase("2GB")) {
                count1++;
            } else if (RAMType.equalsIgnoreCase("4GB")) {
                count2++;
            }
        }

        pc.add(String.valueOf(count1));
        pc.add(String.valueOf(count2));
        pc.add("6500");
        pc.add("7600");
    }

    @Override
    public PC getPC() {
        return pc;
    }
}
