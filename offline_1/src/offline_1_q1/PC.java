package offline_1_q1;
import java.util.LinkedList;

public class PC{
    private LinkedList<String> parts;
    public PC(){ parts = new LinkedList<>(); }
    public void add(String part){ parts.addLast(part); }
    public void showDetails(){
        //show the complete specification of the pcs ordered
        //name of the base and added components
        //total price
        //individual component's price (both base and added)
        int tot_price = 0;

        //add base price, processor price, prices of CPU Cooler, Liquid Cooler and DVD Drive
        tot_price += (Integer.parseInt(parts.get(1)) + Integer.parseInt(parts.get(5)) + Integer.parseInt(parts.get(7))
                + Integer.parseInt(parts.get(9)) + Integer.parseInt(parts.get(11)));
        tot_price += (Integer.parseInt(parts.get(14)) * Integer.parseInt(parts.get(16)));   //ram-1-count * price
        tot_price += (Integer.parseInt(parts.get(15)) * Integer.parseInt(parts.get(17)));   //ram-2-count * price
        tot_price += (Integer.parseInt(parts.get(20)) * Integer.parseInt(parts.get(22)));   //gc-1-count * price
        tot_price += (Integer.parseInt(parts.get(21)) * Integer.parseInt(parts.get(23)));   //gc-2-count * price

        System.out.print("\n" + parts.get(0) + ": " + parts.get(1));
        for(int i = 2; i <= 5; i++) System.out.print("\n" + parts.get(i));
        for(int i = 6; i <= 10; i+=2) System.out.print("\n" + parts.get(i) + ": " + parts.get(i+1));
        System.out.print("\n" + parts.get(12) + ": " + parts.get(14) + ": " + parts.get(16));   //show details of ram1
        System.out.print("\n" + parts.get(13) + ": " + parts.get(15) + ": " + parts.get(17));   //show details of ram2
        System.out.print("\n" + parts.get(18) + ": " + parts.get(20) + ": " + parts.get(22));   //details of gc-1
        System.out.print("\n" + parts.get(19) + ": " + parts.get(21) + ": " + parts.get(23));   //details of gc-2

        System.out.print("\nTotal price = " + tot_price + "$");
    }
}
