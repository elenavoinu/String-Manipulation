public class IndexOfTheFirstOccurrence {
    public static void main(String[] args) {
        String input = "sadbutsad";
        String input2 = "sad";
        System.out.println(strStr("haystack", "needle"));
        System.out.println(strStr(input, input2));
    }
    private static int strStr(String haystack, String needle) {
        if (needle.isEmpty()) {
            return 0;
        }
        int haystackLen = haystack.length();
        int needleLen = needle.length();
        for (int i = 0; i <= haystackLen - needleLen; i++) {
            if (haystack.substring(i, i + needleLen).equals(needle)) {
                return i;
            }
        }
        return -1;

    }
}
