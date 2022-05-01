package Figures;

public class Main {
    //Не знаю как сделать) Выдает ошибку со сканером, если вводить подряд объекты в массив.
    public static void main(String[] args) {

        Triangle[] figures = new Triangle[5];
        figures[0] = new Triangle();
        figures[0].setValues(3);

        figures[1] = new Rectangle();
        figures[1].setValues(2);

        figures[2] = new Circle();
        figures[2].setValues(4);

        figures[3] = new Triangle();
        figures[3].setValues(3);

        figures[4] = new Circle();
        figures[4].setValues(10);

    }
}
