package com.company;

public class Main {

    public static void main(String[] args) {
        task2();
    }

    static void task1()
    {
        CreditCard firstCard = new CreditCard("4421-3252-6842-1257",100);
        CreditCard secondCard = new CreditCard("4123-6562-1552-3657",100);
        CreditCard thirdCard = new CreditCard("3781-1152-2442-8257",100);

        System.out.println();

        firstCard.displayCardInfo();
        firstCard.raiseBill(200);
        firstCard.displayCardInfo();

        System.out.println();

        secondCard.displayCardInfo();
        secondCard.raiseBill(300);
        secondCard.displayCardInfo();

        System.out.println();

        thirdCard.displayCardInfo();
        thirdCard.withdrawSumFromBill(99);
        thirdCard.displayCardInfo();

        System.out.println();
        thirdCard.withdrawSumFromBill(100);
    }

    static void task2()
    {
        Computer firstComputer = new Computer();
        firstComputer.displayCharacteristics();

        HDD secondHdd = new HDD("Seagate Barracuda",2,"External");
        RAM secondRam = new RAM("Crucial Ballistix",16);
        Computer secondComputer = new Computer("Asus Vivo book", 1000,secondHdd,secondRam);

        secondComputer.displayCharacteristics();
    }
}


