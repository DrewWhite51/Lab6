/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Month;

/**
 *
 * @author Drew
 */


class Month {
    
    private int monthNumber;
    // default constructor
    public Month(){
        monthNumber = 1;
    }
    // overloaded constructor
    public Month(int month_num) {
        if(month_num < 1 || month_num > 12) monthNumber = 1;
        else monthNumber = month_num;
    }
    // overloaded constructor
    public Month(String month_name){
        if(month_name.equalsIgnoreCase("January")) monthNumber = 1;
        else if(month_name.equalsIgnoreCase("February")) monthNumber = 2;
        else if(month_name.equalsIgnoreCase("March")) monthNumber = 3;
        else if(month_name.equalsIgnoreCase("April")) monthNumber = 4;
        else if(month_name.equalsIgnoreCase("May")) monthNumber = 5;
        else if(month_name.equalsIgnoreCase("June")) monthNumber = 6;
        else if(month_name.equalsIgnoreCase("July")) monthNumber = 7;
        else if(month_name.equalsIgnoreCase("August")) monthNumber = 8;
        else if(month_name.equalsIgnoreCase("September")) monthNumber = 9;
        else if(month_name.equalsIgnoreCase("October")) monthNumber = 10;
        else if(month_name.equalsIgnoreCase("November")) monthNumber = 11;
        else if(month_name.equalsIgnoreCase("December")) monthNumber = 12;
    }
    
    public void setMonthNumber(int month_num){
        if(month_num < 1 || month_num > 12) monthNumber = 1;
        else monthNumber = month_num;
    }
    
    public int getmonthNumber(){
        return monthNumber;
    }
    
    
    public String getMonthName(){
        switch (monthNumber) {
            case 1:
                return "January";
            case 2:
                return "February";
            case 3:
                return "March";
            case 4:
                return "April";
            case 5:
                return "May";
            case 6:
                return "June";
            case 7:
                return "July";
            case 8:
                return "August";
            case 9:
                return "September";
            case 10:
                return "October";
            case 11:
                return "November";
            case 12:
                return "December";
            default:
                break;
        }
        return "January";
    }
    
    public String toString(){
        return getMonthName();
    }
    
    public boolean equals(Month M){
        return monthNumber==M.monthNumber;
    }
    
    public boolean greaterThan(Month M){
        return monthNumber>M.monthNumber;
    }
    
    public boolean lessThan(Month M){
        return monthNumber<M.monthNumber;
    }
    
    
    public static void main(String[] args){
        
        
        Month month1 = new Month(1);
        Month month2 = new Month(12);
        System.out.println("Month1 name is  " + month1);
        
        System.out.println("Month2 name is " + month2);
        
        System.out.println("Does the first month equal the second month? " + month1.equals(month2));
    }
    
    
}

