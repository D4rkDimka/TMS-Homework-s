package com.company;

public class Computer {
    private String model;
    private double cost;
    private HDD hdd;
    private RAM ram;

    Computer()
    {
        this.model = "NULL";
        this.cost = 0;
        this.hdd = null;
        this.ram = null;
    }

    Computer(String model, double cost, HDD hdd, RAM ram)
    {
        this.model = model;
        this.cost = cost;
        this.ram = ram;
        this.hdd = hdd;
    }

    public void displayCharacteristics()
    {
        try
        {
            if(hdd == null && ram == null)
            {
                throw new RuntimeException("Object's HDD and RAM are null");
            }
        }catch (RuntimeException exception)
        {
            hdd = new HDD();
            ram = new RAM();
        }

        System.out.printf("Model: %s\n",model);
        System.out.printf("Cost: %f\n", cost);
        System.out.println("HDD:");
        hdd.displayCharacteristics();
        System.out.println("RAM: ");
        ram.displayCharacteristics();
    }

    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }

    public double getCost() {
        return cost;
    }
    public void setCost(double cost) {
        this.cost = cost;
    }

    public HDD getHdd() {
        return hdd;
    }
    public void setHdd(HDD hdd) {
        this.hdd = hdd;
    }

    public RAM getRam() {
        return ram;
    }
    public void setRam(RAM ram) {
        this.ram = ram;
    }
}
