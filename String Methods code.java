public class StringMethods {
    public static void main(String[] args) {
        String name = "Pirih";
        System.out.println(name);
        // Method 1 : length()
        int value = name.length();
        System.out.println(value);
        // Method 2 : toLowerCase()
        String lower = name.toLowerCase();
        System.out.println(lower);
        // Method 3 : toUpperCase()
        String upper = name.toUpperCase();
        System.out.println(upper);
        String nonTrimmedString = "   Pirih   ";
        System.out.println(nonTrimmedString);
        // Method 4 : trim()
        String trimmedString = nonTrimmedString.trim();
        System.out.println(trimmedString);
        // Method 5 : substring()
        System.out.println(name.substring(1));
        System.out.println(name.substring(1,4));
        System.out.println(name.substring(1,5));
        // Method 6 : replace()
        String replace = name.replace('r','y');
        System.out.println(replace);
        String replace1 = name.replace("Pirih", "Piya");
        System.out.println(replace1);
        // Method 7 : startsWith()
        boolean startsWith = name.startsWith("Pi");
        System.out.println(startsWith);
        boolean startsWith1 = name.startsWith("Hi");
        System.out.println(startsWith1);
        // Method 8 : endsWith()
        boolean endsWith = name.endsWith("ih");
        System.out.println(endsWith);
        boolean endsWith1 = name.endsWith("hi");
        System.out.println(endsWith1);
        // Method 9 : charAt()
        char charAt = name.charAt(2);
        System.out.println(charAt);
        // Method 10 : indexOf()
        int index = name.indexOf("ih"); // This will return index value of 1st character of given string...
        System.out.println(index);
        int index1 = name.indexOf("i");
        System.out.println(index1);
        String name2 = "PirhihSahito";
        int index3 = name2.indexOf("hi",4);
        System.out.println(index3);
        int index4 = name2.indexOf("her",4);
        System.out.println(index4); // If given string/char is not available, it will return -1
        // Method 11 : lastIndexOf()
        int index5 = name2.lastIndexOf("hi");
        System.out.println(index5);
        int index6 = name2.lastIndexOf("hi", 4);
        System.out.println(index6);
        // Method 12 : equals()
        boolean name3 = name.equals("Pirih");
        System.out.println(name3);
        boolean name4 = name.equals("pirih");
        System.out.println(name4); // Java is case-sensitive...
        // Method 13 : equalsIgnoreCase()
        boolean name5 = name.equalsIgnoreCase("piRih"); // this method ignores cases(upper and lower)
        System.out.println(name5);

        // Example 1
        String name6 = "Pirih Sahito";
        name6 = name6.toLowerCase();
        System.out.println(name6);

        // Example 2
        name6 = name6.replace(" ", "_");
        System.out.println(name6);

        //  Example 3
        String letter = "Dear <|name|>, Thanks a lot";
        letter = letter.replace("<|name|>", "Piya");
        System.out.println(letter);

        // Example 4 - Detect spaces
        String newString = "This string contains double  and triple   spaces";
        System.out.println(newString.indexOf("  "));
        System.out.println(newString.indexOf("   "));
        String myString = "This string contains double  and triple spaces";
        System.out.println(myString.indexOf("  "));
        System.out.println(myString.indexOf("   ")); //  This will return -1. because it contains no triples space.

        // Example 5 - Use of escape sequence characters...
        String letter2 = "Dear Piya, This Java Course is Nice. Thanks...!";
        System.out.println(letter2);
        String letter3 = "Dear Piya,\n\tThis Java Course is Nice.\nThanks...!";
        System.out.println(letter3);
    }
}
