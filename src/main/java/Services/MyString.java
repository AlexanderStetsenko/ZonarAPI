package Services;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Александр on 27.06.2017.
 */
public class MyString
{
    private static String[] divide(String s, char byChar) {
        ArrayList<String> tmp = new ArrayList<String>();
        int i = 0;
        boolean f = false;
        for (int j = 0; j < s.length(); j++) {
            if (s.charAt(j) == byChar) {
                if (j > i) {
                    tmp.add(s.substring(i, j));
                }
                i = j + 1;
            }
        }
        if (i < s.length()) {
            tmp.add(s.substring(i));
        }
        return tmp.toArray(new String[tmp.size()]);
    }

    public static void divideByChar(String str, char byChar){
        String[] r = divide(str, byChar);
        for (int i = 0; i < r.length; i++)
            System.out.println('"' + r[i] + '"');
    }

    public static List<String> divideStringToArrayByChar(String str, char ch){
        List<String> itemList = new ArrayList<String>();
        int i = 0;
        boolean f = false;
        for (int j = 0; j < str.length(); j++) {
            if (str.charAt(j) == ch) {
                if (j > i) {
                    itemList.add(str.substring(i, j));
                }
                i = j + 1;
            }
        }
        return itemList;
    }

}
