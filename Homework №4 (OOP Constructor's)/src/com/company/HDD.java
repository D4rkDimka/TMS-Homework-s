package com.company;

public class HDD {
    private String name;
    private double capacity;
    private String type;

    HDD()
    {
        this.capacity = 0;
        this.type = "NULL";
        this.name ="NULL";
    }

    HDD(String name,double capacity,String type)
    {
        this.capacity =capacity;
        this.type = type;
        this.name = name;
    }

    public void displayCharacteristics()
    {
        System.out.printf("Name: %s\n",name);
        System.out.printf("Capacity: %fGB\n",capacity);
        System.out.printf("Type: %s\n",type);
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public double getCapacity() {
        return capacity;
    }
    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
}
