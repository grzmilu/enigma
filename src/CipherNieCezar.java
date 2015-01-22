/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Student
 */
import java.util.*;
public class CipherNieCezar extends Cipher {

    public CipherNieCezar(Alphabet a) {
        super(a);
    }

    @Override
    public String encrypt(String s) {
        return doJob(s, new CharProc<String>(){

            @Override
            public char process(char c, String key, Alphabet alphabet) {
                int l = alphabet.indexOf(c);          
                
                return key.charAt(l);
            }
        });
    }
    @Override
    public String decrypt(String s) {
        return doJob(s, new CharProc<String>(){

            @Override
            public char process(char c, String key, Alphabet alphabet) {
                int l = key.indexOf(c);              
                
                return alphabet.charAt(l);
            }
        });
    }
    
    public Integer generateAndSetKey(){
     this.key=key;  
    int l=new Random().nextInt();
        return l;
    }


}
