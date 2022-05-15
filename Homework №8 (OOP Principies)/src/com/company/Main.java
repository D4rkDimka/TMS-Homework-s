package com.company;

public class Main {

    public static void main(String[] args) {
        Worker firstWorker = new Worker("Ivan","Truhin",POSITION.WORKER,3.5);
        Worker secondWorker = new Worker("Sergey","Jukin",POSITION.WORKER,1.5);
        Worker thirdWorker = new Worker("Vladimir","Zontov",POSITION.WORKER,5.1);
        Service search = new Service();
        Director firstDirector = new Director("Dmitriy","Kapitonov",POSITION.DIRECTOR,12.3);

        firstWorker.displayPersonalInfo();
        System.out.println("\n");
        secondWorker.displayPersonalInfo();
        System.out.println("\n");
        thirdWorker.displayPersonalInfo();
        System.out.println("\n");
        firstDirector.displayPersonalInfo();
        System.out.println("\n");
        firstDirector.putUnderControl(firstWorker);
        firstDirector.putUnderControl(secondWorker);
        firstDirector.displayPersonalInfo();

        Director secondDirector = new Director("Nazar","Kamerilov",POSITION.DIRECTOR,5.2);
        secondDirector.putUnderControl(new Worker("Daniil","Kuchma",POSITION.WORKER,2.5));

        firstDirector.putUnderControl(secondDirector);

        firstDirector.displayPersonalInfo();

        if(search.findCertainEmployee(firstDirector) == true) System.out.println("Exist and under control");
        else System.out.println("Doesn't exist or not under control");

    }
}