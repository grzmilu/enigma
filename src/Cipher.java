
public abstract class Cipher {

    protected int key = 1;
    protected Alphabet alphabet;

    public Cipher(Alphabet a) {
        alphabet = a;
    }
    //String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    /*
     * String encrypt(String s) { StringBuilder ss = new StringBuilder(); if
     * (s.matches("^[A-Z]+$")) { for (int i = 0; i < s.length(); i++) { int ch =
     * s.charAt(i);
     *
     * ch = ch + key - 65; ch = ch % 26; ch = ch + 65;
     *
     * ss.append((char) ch); } s = ss.toString(); } else { throw new
     * IllegalArgumentException("Źle"); } return s; }
     */
    public abstract String encrypt(String s);

    public abstract String decrypt(String s);

    String doJob(String s, CharProc cp) {
        StringBuilder ss = new StringBuilder();
        char c;
        int l;
        for (int i = 0; i < s.length(); i++) {
            c = s.charAt(i);
            c = cp.process(c, key, alphabet);

            //     l = alphabet.indexOf(c);
            //      l = (l + key) % alphabet.length();
            //    c = alphabet.charAt(l);
            ss.append(c);
        }
        s = ss.toString();

        return s;
    }

    public void setOffset(int y) {
        key = y;
    }

    public int getOffset() {
        return key;
    }
}