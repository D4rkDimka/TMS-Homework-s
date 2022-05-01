package com.company;

public class Main {

    public static void main(String[] args) {
	Phone firstPhone = new Phone(6532378,"Iphone",100.0);
    Phone secondPhone = new Phone(1255857,"Samsung",350.7);
    Phone thirdPhone = new Phone(8532568,"Huawei",150.2);
    Integer [] phoneNumbers = {1235257, 9874567, 8785567, 21543567, 5752567, 8785567, 1265437, 1232562};

    firstPhone.receiveCall("George");
    secondPhone.receiveCall("Adam",5212689);
    thirdPhone.receiveCall("John",1257434);

    firstPhone.sendMessage(phoneNumbers);
    }
}
