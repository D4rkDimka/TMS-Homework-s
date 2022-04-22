package com.company;

public class RAM {

    private String name;
    private double capacity;

    RAM()
    {
        this.capacity = 0;
        this.name ="NULL";
    }

    RAM(String name,double capacity)
    {
        this.name = name;
        this.capacity = capacity;
    }

    public void displayCharacteristics()
    {
        System.out.printf("Name: %s\n",name);
        System.out.printf("Capacity: %f GB\n",capacity);
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
}
