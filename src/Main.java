
public class Main {

    public static void main(String[] args) {

        int y = 1;
        String s = "ABCXYZ";
        int m;
        StringBuilder ss = new StringBuilder();


        if (s.matches("^[A-Z]+$")) {
            for (int i = 0; i < s.length(); i++) {
                int ch = s.charAt(i);

                ch = ch + y - 65;
                ch = ch % 26;
                ch = ch + 65;

                ss.append((char) ch);
            }
        } else {
            throw new IllegalArgumentException("Źle");
        }

        System.out.println(ss);
    }
}
