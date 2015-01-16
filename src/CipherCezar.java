/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Student
 */
public class CipherCezar extends Cipher {

    public CipherCezar(Alphabet a) {
        super(a);
    }

    @Override
    public String encrypt(String s) {
        return doJob(s, new CharProc() {

            @Override
            public char process(char c, int key, Alphabet alphabet) {

                int l = alphabet.indexOf(c);
                l = (l + key) % alphabet.length();
                if (l < 0) {
                    l = l + alphabet.length();
                }
                return alphabet.charAt(l);
            }
        });
    }

    @Override
    public String decrypt(String s) {
        return doJob(s, new CharProc() {

            @Override
            public char process(char c, int key, Alphabet alphabet) {

                int l = alphabet.indexOf(c);
                l = (l - key) % alphabet.length();
                if (l < 0) {
                    l = l + alphabet.length();
                }
                return alphabet.charAt(l);
            }
        });
    }
}
