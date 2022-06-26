package streams;

public class Main {
    public static void main(String[] args) {
        /*ServiceStream serviceStream = new ServiceStream();
        serviceStream.createListOfNumbers();
        serviceStream.displayStream();
        serviceStream.countElements();
        serviceStream.multiplyElements();
        serviceStream.displayEvenElements();
        serviceStream.sort();
        serviceStream.avgElements();*/

        ServiceFamily serviceFamily = new ServiceFamily();
        serviceFamily.getMap();
        serviceFamily.getMen();
        serviceFamily.getWoman();
        serviceFamily.hasChild("firstChild1");
        serviceFamily.getAmountOfChildren();
    }
}
