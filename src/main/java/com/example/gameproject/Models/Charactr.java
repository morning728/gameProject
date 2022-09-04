package com.example.gameproject.Models;

public class Charactr {
    private int age;
    private String name;
    private int cash;
    private int credit;
    private int moneyFlow;
    private String imagePath = "..\\..\\..\\..\\..\\root\\images\\characterPic1.png";


    public int getCash() {
        return cash;
    }
    public int getAge() {
        return age;
    }
    public int getCredit() {
        return credit;
    }
    public int getMoneyFlow() {
        return moneyFlow;
    }
    public String getName() {
        return name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setCash(int cash) {
        this.cash = cash;
    }
    public void setCredit(int credit){
        this.credit = credit;
    }
    public void setMoneyFlow(int moneyFlow) {
        this.moneyFlow = moneyFlow;
    }
    public Charactr(String name, int age, int cash, int credit, int moneyFlow){
        this.name = name;
        this.age = age;
        this.cash = cash;
        this.credit = credit;
        this.moneyFlow = moneyFlow;

    }
}
