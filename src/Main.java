public class Main {

    
    public static void main(String[] args) {
     Alphabet a=new Alphabet(Alphabet.CharSet.DIGITS);
     Cipher b=new CipherNieCezar(a);
     b.setOffset("5903142867");
     System.out.println(b.encrypt("123"));
     System.out.println(b.decrypt("903"));
    }
}