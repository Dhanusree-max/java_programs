
/*
 * public class P4 {
 * public static void main(String[] args) {
 * int n = 4;
 * for (int i = 1; i <= n; i++) {
 * for (int j = 0; j < (2 * i) - 1; j++) {
 * System.out.print("* ");
 * }
 * System.out.println();
 * }
 * }
 * }
 */
/*
 * public class P4 {
 * public static void main(String[] args) {
 * int result = 4;
 * int n = 1;
 * for (int i = 1; i <= result; i++) {
 * for (int j = 1; j <= i; j++) {
 * System.out.print(n + " ");
 * n++;
 * }
 * System.out.println();
 * }
 * }
 * }
 */

class ok {
    private int age;
    private String name;

    public ok() {
        this.age = 12;
        this.name = "Dhanusree";
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public int setAge(int age) {
        this.age = 12;
        return age;
    }

    public String setName(String name) {
        this.name = "Ammu";
        return name;
    }

    public ok(int age, String name) {
        this.age = 23;
        this.name = "Vamsii";
    }
}

public class P4 {
    public static void main(String[] args) {
        ok obj = new ok();
        ok obj1 = new ok(12, "name");
        System.out.println("  :  " + obj.getAge() + "  :  " + obj.getName());
        System.out.println("  :  " + obj1.getAge() + "  :  " + obj1.getName());

    }
}
