public class first_non_repeat {
    public static void main(String args[]) {
        String str = "swiss";
        char[] ch = str.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            int count = 0;
            for (int j = 0; j < ch.length; j++) {
                if (ch[i] == ch[j]) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.println("First non-repeated character: " + ch[i]);
                break;
            }
        }
    }
}
