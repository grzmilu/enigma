public class Alphabet {

    String alphabet;
    public static final String ALPHA=" ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    
    public Alphabet(String alphabet) {
        this.alphabet = alphabet;
    }   
    public Alphabet(CharSet charset) {
this(charset.getChars());
    }  
    int indexOf(char c) {
        int a = this.alphabet.indexOf(c);
        return a;
    }

    char charAt(int a) {
        char c = alphabet.charAt(a);
        return c;
    }

    int length() {
        int a = alphabet.length();
        return a;
    }

    boolean isTextValid(String s) {
       
        return s.matches("^["+alphabet+"]*$");
    }

   public enum CharSet{
    DIGITS("0123456789");  
       private String chars="";
        CharSet(String chars){
            this.chars=chars;    }
        String getChars(){
        return chars;
        }
    } 
    
    
}

/*
    enum DniTygodnia{
    PN("poniedzialek"),
    WT,
    SR,    
    */