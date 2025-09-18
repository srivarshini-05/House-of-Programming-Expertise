import java.util.*;

public class removechar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1 = sc.next();  // tiger
        String s2 = sc.next();  // ti
        String s02=s2.toLowerCase();

        List<Character> result = new ArrayList<>();

        // Add only characters not in s2
        for (char c1 : s1.toCharArray()) {
            char c01=Character.toLowerCase(c1);
            if (s02.indexOf(c01) == -1) {  // if not found in s2
                result.add(c1);
            }
        }

        // Convert list back to string
        StringBuilder sb = new StringBuilder();
        for (char c : result) {
            sb.append(c);
        }

        System.out.println(new String(sb));  // ger
    }
}
