
public class Cipher {

    int offset = 1;
    String alfabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    String encrypt(String s) {


        StringBuilder ss = new StringBuilder();
        if (s.matches("^[A-Z]+$")) {
            for (int i = 0; i < s.length(); i++) {
                int ch = s.charAt(i);

                ch = ch + offset - 65;
                ch = ch % 26;
                ch = ch + 65;

                ss.append((char) ch);

            }
            s = ss.toString();
        } else {
            throw new IllegalArgumentException("Źle");
        }
        return s;
    }

    String encrypt2(String s) {
        StringBuilder ss = new StringBuilder();
        char c;
        int l;
        for (int i = 0; i < s.length(); i++) {
            c = s.charAt(i);
            l = alfabet.indexOf(c);                      
            l = (l + offset) % alfabet.length();
            c = alfabet.charAt(l);
            ss.append(c);


        }
        s = ss.toString();

        return s;
    }

    public void setOffset(int y) {
        offset = y;
    }

    public int getOffset() {
        return offset;
    }
}
