package com.company;

public class CreditCard {
    private String accountNumber;
    private double currentSum;

    CreditCard(){}

    CreditCard(String accountNumber, double currentSum)
    {
        this.currentSum = currentSum;
        this.accountNumber = accountNumber;
    }

    private boolean isEnoughMoneyToWithdraw(double amountOfMoney)
    {
        if(amountOfMoney > currentSum)
        {
            System.out.println("\nNot enough money on the bill to withdraw!\n");
            return false;
        }
        else return true;
    }

    public void displayCardInfo()
    {
        System.out.printf("Account number: %s\n",accountNumber);
        System.out.printf("Current sum: %f\n",currentSum);
    }

    public void raiseBill(double amount)
    {
        this.currentSum+=amount;
        System.out.printf("Refill (+%f)\n",amount);
    }

    public boolean isEmpty()
    {
        if(currentSum == 0) return true;
        else return false;
    }

    public void withdrawSumFromBill(double amount )
    {
        if(isEnoughMoneyToWithdraw(amount) == true) this.currentSum-=amount;
    }

    public double getCurrentSum() {
        return currentSum;
    }
    public void setCurrentSum(int currentSum) {
        this.currentSum = currentSum;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
}
