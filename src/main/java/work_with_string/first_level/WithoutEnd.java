package work_with_string.first_level;

public class WithoutEnd {
    static String withoutEnd(String str) {
        String newStr = str.substring(1, str.length() - 1);
        return newStr;
    }
}
