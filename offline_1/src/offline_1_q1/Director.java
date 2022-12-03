package offline_1_q1;

public class Director{
    PCBuilder myBuilder;

    public void build(PCBuilder builder){
        myBuilder = builder;
        myBuilder.addProcessor();
        myBuilder.setProcessorPrice();
        myBuilder.addCPU();
        myBuilder.addMB();
        myBuilder.addHDD();
        myBuilder.setBasePrince();
        myBuilder.addCPUCooler();
        myBuilder.setCPUCoolerPrice();
        myBuilder.liquidCooler();
        myBuilder.LiquidCoolerPrice();
        myBuilder.addDrive();
        myBuilder.setDrivePrice();
        myBuilder.addRAM();
        myBuilder.addGraphicsCard();
    }
}

