public class Main {

    
    public static void main(String[] args) {
     Alphabet a=new Alphabet(Alphabet.CharSet.DIGITS);
     Cipher b=new CipherCezar(a);
     System.out.println(b.encrypt("01239"));
     System.out.println(b.decrypt("01239"));
    }
}