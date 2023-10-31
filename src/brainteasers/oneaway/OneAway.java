/**
 * From Cracking the Coding Interview, Exercise 1.5
 * 
 * There are three types of edits that can be performed on strings: insert a
 * character,
 * remove a character, or replace a character. Given two strings, write a
 * function to check if they are
 * one edit (or zero edits) away.
 */
class OneAway {

    boolean run(String str1, String str2) {
        String type = determineType(str1, str2);
        switch (type) {
            case "remove":
                return checkRemove(str1, str2);
            case "insert":
                return checkInsert(str1, str2);
            case "replace":
                return checkReplace(str1, str2);
        }
        return false;
    }

    String determineType(String str1, String str2) {
        if (str1.length() > str2.length()) {
            return "remove";
        }
        if (str1.length() < str2.length()) {
            return "insert";
        }
        return "replace";
    }

    boolean checkInsert(String str1, String str2) {
        int edits = 0;
        for (int i = 0; i < str1.length(); i++) {
            if (compareStringsAtIndex(str1, str2, i)) {
                edits++;
                if (tooMuchEdits(edits)) {
                    return false;
                }
                str1 = addChar(str1, ' ', i);
            }
        }
        return true;
    }

    boolean checkRemove(String str1, String str2) {
        int edits = 0;
        for (int i = 0; i < str2.length(); i++) {
            if (compareStringsAtIndex(str1, str2, i)) {
                edits++;
                if (tooMuchEdits(edits)) {
                    return false;
                }
                str2 = addChar(str2, ' ', i);
            }
        }
        return true;
    }

    boolean checkReplace(String str1, String str2) {
        int edits = 0;
        for (int i = 0; i < str1.length(); i++) {
            if (compareStringsAtIndex(str1, str2, i)) {
                edits++;
                if (tooMuchEdits(edits)) {
                    return false;
                }
            }
        }
        return true;
    }

    boolean compareStringsAtIndex(String str1, String str2, int i) {
        return str1.charAt(i) != str2.charAt(i);
    }

    boolean tooMuchEdits(int edits) {
        return edits > 1;
    }

    /**
     * From https://www.baeldung.com/
     */
    String addChar(String str, char ch, int position) {
        StringBuilder sb = new StringBuilder(str);
        sb.insert(position, ch);
        return sb.toString();
    }

    public static void main(String[] args) {
        OneAway oneAway = new OneAway();
        System.out.println(oneAway.run("helo", "hello")); // true
        System.out.println(oneAway.run("pale", "ple")); // true
        System.out.println(oneAway.run("ae", "aa")); // true
        System.out.println(oneAway.run("aa", "ae")); // true
        System.out.println(oneAway.run("pales", "pale")); // true
        System.out.println(oneAway.run("pale", "bale")); // true

        System.out.println(oneAway.run("pale", "bae")); // false
        System.out.println(oneAway.run("helo", "helllo")); // false
        System.out.println(oneAway.run("paale", "ple")); // false
        System.out.println(oneAway.run("aaa", "aew")); // false
    }
}
