public class Sex {
    public boolean Sex (String pesel)
    {
        String[]sex=pesel.split("");
        int i=Integer.parseInt(sex[9]);
        return i % 2 == 0;
    }
}
