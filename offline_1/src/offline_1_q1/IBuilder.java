package offline_1_q1;

interface PCBuilder{
    void addProcessor();
    void setProcessorPrice();
    void addCPU();
    void addMB();
    void addHDD();
    void setBasePrince();
    void addCPUCooler();
    void setCPUCoolerPrice();
    void liquidCooler();
    void LiquidCoolerPrice();
    void addDrive();
    void setDrivePrice();
    void addRAM();
    void addGraphicsCard();
    PC getPC();
}