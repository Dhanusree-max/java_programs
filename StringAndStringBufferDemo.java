class StringAndStringBufferDemo {
    public static void main(String[] args) {

        /* ===================== STRING METHODS ===================== */

        System.out.println("----- STRING METHODS -----");

        String s = "  Java Programming  ";

        // length()
        System.out.println("Length: " + s.length());

        // trim()
        String trimmed = s.trim();
        System.out.println("Trimmed: '" + trimmed + "'");

        // toUpperCase() & toLowerCase()
        System.out.println("Uppercase: " + trimmed.toUpperCase());
        System.out.println("Lowercase: " + trimmed.toLowerCase());

        // charAt()
        System.out.println("charAt(1): " + trimmed.charAt(1));

        // substring()
        System.out.println("Substring from index 5: " + trimmed.substring(5));
        System.out.println("Substring (5, 11): " + trimmed.substring(5, 11));

        // contains()
        System.out.println("Contains 'Java': " + trimmed.contains("Java"));

        // startsWith() & endsWith()
        System.out.println("Starts with 'Java': " + trimmed.startsWith("Java"));
        System.out.println("Ends with 'ing': " + trimmed.endsWith("ing"));

        // indexOf() & lastIndexOf()
        System.out.println("Index of 'a': " + trimmed.indexOf('a'));
        System.out.println("Last index of 'a': " + trimmed.lastIndexOf('a'));

        // replace()
        System.out.println("Replace a->o: " + trimmed.replace('a', 'o'));

        // equals() & equalsIgnoreCase()
        String s2 = "java programming";
        System.out.println("Equals: " + trimmed.equals(s2));
        System.out.println("Equals Ignore Case: " + trimmed.equalsIgnoreCase(s2));

        // split()
        String[] words = trimmed.split(" ");
        System.out.println("Split words:");
        for (String word : words) {
            System.out.println(word);
        }

        /* ===================== STRINGBUFFER METHODS ===================== */

        System.out.println("\n----- STRINGBUFFER METHODS -----");

        StringBuffer sb = new StringBuffer("Hello");

        // append()

        System.out.println("Append:     " + sb.append(" World"));

        // insert()
        sb.insert(5, ",");
        System.out.println("Insert: " + sb);

        // delete()
        sb.delete(5, 6);
        System.out.println("Delete: " + sb);

        // deleteCharAt()
        sb.deleteCharAt(0);
        System.out.println("DeleteCharAt: " + sb);

        // replace()
        sb.replace(0, 4, "Hi");
        System.out.println("Replace: " + sb);

        // reverse()
        sb.reverse();
        System.out.println("Reverse: " + sb);

        // length() & capacity()
        System.out.println("Length: " + sb.length());
        System.out.println("Capacity: " + sb.capacity());

        // charAt() & setCharAt()
        System.out.println("charAt(1): " + sb.charAt(1));
        sb.setCharAt(1, 'X');
        System.out.println("After setCharAt: " + sb);

        // toString()
        String finalString = sb.toString();
        System.out.println("Converted to String: " + finalString);
    }
}
