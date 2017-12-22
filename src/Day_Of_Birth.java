public class Day_Of_Birth {
    public long Date (String pesel){
        return Long.parseLong(pesel);
    }
    public int Year(long date){
        String yearString=Long.toString(date);
        char[] yearChar=yearString.toCharArray();
        int[]yearInt=new int[yearChar.length];
        for(int i=0;i<yearInt.length-1;i++)
            yearInt[i]=(int)(yearChar[i]-'0');
        return (yearInt[0]*10)+yearInt[1];
    }
    public int Month(long date){
        String monthString=Long.toString(date);
        char[] monthChar=monthString.toCharArray();
        int[]monthInt=new int[monthChar.length];
        for(int i=0;i<monthInt.length-1;i++)
            monthInt[i]=(int)(monthChar[i]-'0');
        int month=0;
        if(monthInt[0]==9){
            return month=(monthInt[2]*10+monthInt[3]);
        }
        else return month=monthInt[2]*10+monthInt[3]+20;
    }
    public int Day (long date){
        String dayString=Long.toString(date);
        char[] dayChar=dayString.toCharArray();
        int[]dayInt=new int[dayChar.length];
        for(int i=0;i<dayInt.length-1;i++)
            dayInt[i]=(int)(dayChar[i]-'0');
        return dayInt[4]*10+dayInt[5];
    }

}
