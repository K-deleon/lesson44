package com.company;

public class BankAccount implements Comparable
{
    public BankAccount(String nm, double bal) //Constructor
    {
        name = nm;
        balance = bal;
    }

    public int compareTo(Object otherObject)
    {
        BankAccount otherAccount = (BankAccount) otherObject;
        int retValue;
        if (balance < otherAccount.balance)
        {
            retValue = -1;
        }
        else
        {
            if (balance > otherAccount.balance)
            {
                retValue = 1;
            }
            else
            {
                retValue = 0;
            }
        }
        return retValue;

    }

    /* SORT ALPHABETICALLY

    public int compareTo(Object otherObject)
    {
        BankAccount otherAccount = (BankAccount) otherObject;
        int retValue;
        if (name < otherAccount.name)
        {
            retValue = -1;
        }
        else
        {
            if (name > otherAccount.name)
            {
                retValue = 1;
            }
            else
            {
                retValue = 0;
            }
        }
        return retValue;

    }
    * */

    public void deposit(double dp)
    {
        balance = balance + dp;
    }

    public void withdraw(double wd)
    {
        balance = balance - wd;
    }
    public String name;
    public double balance;
}
