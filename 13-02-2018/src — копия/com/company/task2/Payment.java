package com.company.task2;

/**
 * Created by Student on 18.12.2017.
 */
public class Payment {
    /**
     * name - Фамилия Имя Отчество;
     * day, month, year - день, месяц, год;
     * amount - сумма в копейках
     */
    private String name;
    private int day, month, year;
    private int amount;
    private final static int[] monthFull={1, 3, 5, 7, 8, 10, 12};

    private boolean checkData(int day, int month, int year, int amount){
        boolean fullMonth=false;
        if(day<=0 || month<=0 || year<=0 || month>12 || amount<=0){
            return false;
        }
        if(month==2 && ((day>28 && year%4!=0) || (day>29 && year%4==0))){
            return false;
        }
        for(int i:monthFull){
            if(i==month){
                fullMonth=true;
            }
        }
        if(fullMonth && day>31){
            return false;
        }
        if(!fullMonth && day>30){
            return false;
        }
        return true;
    }

    public Payment(String fullNameOfUser, int day, int month, int year, int amount) throws BadDateException {
        if(!checkData(day, month, year, amount)){
            throw new BadDateException();
        }
        this.name=fullNameOfUser;
        this.day=day;
        this.month=month;
        this.year=year;
        this.amount=amount;
    }

    public Payment (Payment copyPayment){
        this.name=copyPayment.name;
        this.day=copyPayment.day;
        this.month=copyPayment.month;
        this.year=copyPayment.year;
        this.amount=copyPayment.amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String familyNameFirstNameSecondName) {
        this.name = familyNameFirstNameSecondName;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) throws BadDateException {
        if(!checkData(day, this.month, this.year, this.amount)){
            throw new BadDateException();
        }
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) throws BadDateException {
        if(!checkData(this.day, month, this.year, this.amount)){
            throw new BadDateException();
        }
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) throws BadDateException {
        if(!checkData(this.day, this.month, year, this.amount)){
            throw new BadDateException();
        }
        this.year = year;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) throws BadDateException {
        if(!checkData(this.day, this.month, this.year, amount)){
            throw new BadDateException();
        }
        this.amount = amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Payment)) return false;

        Payment payment = (Payment) o;

        if (getDay() != payment.getDay()) return false;
        if (getMonth() != payment.getMonth()) return false;
        if (getYear() != payment.getYear()) return false;
        if (getAmount() != payment.getAmount()) return false;
        return getName().equals(payment.getName());
    }

    @Override
    public int hashCode() {
        int result = getName().hashCode();
        result = 31 * result + getDay();
        result = 31 * result + getMonth();
        result = 31 * result + getYear();
        result = 31 * result + getAmount();
        return result;
    }

    @Override
    public String toString() {
        int rub=amount/100, cent=amount-(rub*100);
        return "Плательщик: \"" + name + "\"" +
                " дата: " + day + "." + month + "." + year +
                " сумма: " + rub +" руб. " + cent + " коп.";
    }
}
