    /*
    * To change this template, choose Tools | Templates
    * and open the template in the editor.
    */

    /**
    *
    * @author Student
    */
 import java.util.*;
    public class CipherCezar extends Cipher {

    public CipherCezar(Alphabet a) {
        super(a);
    }

    @Override
    public String encrypt(String s) {
        return doJob(s, new CharProc<Integer>(){

            @Override
            public char process(char c, Integer key, Alphabet alphabet) {

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
        return doJob(s, new CharProc<Integer>() {

            @Override
            public char process(char c, Integer key, Alphabet alphabet) {

                int l = alphabet.indexOf(c);
                l = (l - key) % alphabet.length();
                if (l < 0) {
                    l = l + alphabet.length();
                }
                return alphabet.charAt(l);
            }
        });
    }
    public Integer generateAndSetKey(){
       
    int l=new Random().nextInt();
        return l;
    }
    }
