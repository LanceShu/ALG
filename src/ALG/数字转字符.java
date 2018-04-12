package ALG;

import java.util.HashSet;
import java.util.Set;

public class 数字转字符 {
    public static int getNumValidMappings(String input) {
        try {
            Integer.parseInt(input);
        } catch (NumberFormatException e) {
            return 0;
        }
        Set<String> validMappings = new HashSet<String>();
        getAllValidMappings(validMappings, "", input);
        return validMappings.size();

    }

    private static String convert(String input)  {
        char c;
        try {
            c = (char) (64 + Integer.parseInt(input));
            if (c > 'Z') {
                return null;
            }
        } catch (Exception e) {
            return null;
        }
        return new String(new char[] {c});
    }

    public static void getAllValidMappings(Set<String> validMappings, String currentMapping, String remaining) {
        if (remaining.length() == 0) {
            validMappings.add(currentMapping);
        } else if (remaining.length() == 1) {
            String charMap = convert(remaining);
            if (charMap != null) {
                validMappings.add(currentMapping + charMap);
            }
        } else {
            String singleCharMap = convert(remaining.substring(0, 1));
            String doubleCharMap = convert(remaining.substring(0, 2));
            if (singleCharMap != null) {
                getAllValidMappings(validMappings, currentMapping + singleCharMap, remaining.substring(1));
            }
            if (doubleCharMap != null) {
                getAllValidMappings(validMappings, currentMapping + doubleCharMap, remaining.substring(2));
            }
        }
    }

    public static void main(String[] args) {
        String input = "123";
        System.out.println(getNumValidMappings(input));
    }
}
