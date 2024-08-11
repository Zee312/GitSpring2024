package codingbat.string1;

public class ExtraEnd {
    public String extraEnd(String str) {
        String str2 = str.substring (str.length()-2) +str.substring (str.length()-2)+str.substring (str.length()-2);
        return str2;
    }

}
