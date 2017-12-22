

import java.util.Scanner;

public class Validation {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        Pesel pesel = new Pesel();
        Pesel_Validation valid = new Pesel_Validation();
        Day_Of_Birth date= new Day_Of_Birth();
        Sex sex = new Sex();
        pesel.setPesel("15111446578");
        if (valid.peselValidation(pesel.getPesel())){
            pesel.setYear(date.Year(date.Date(pesel.getPesel())));
            pesel.setMonth(date.Month(date.Date(pesel.getPesel())));
            pesel.setDay(date.Day(date.Date(pesel.getPesel())));
            if(sex.Sex(pesel.getPesel()))
                pesel.setSex("Female");
            else pesel.setSex("Male");
            System.out.println("The Pesel is valid\nThe date of birth is: "+pesel.getYear()+"/"+pesel.getMonth()+"/"+pesel.getDay());
            System.out.println("The gender is: "+pesel.getSex());
        }
        else System.out.println("Inproper Pesel");
    }
}
