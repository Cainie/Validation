
public class Pesel_Validation {


    public boolean peselValidation(String pesel)
    {
        String[]length=pesel.split("");
        if(length.length==11)
            return true;
        else return false;
    }
}
