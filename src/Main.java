
public class Main {

    public static void main(String[] args) {

        
        Cipher a=new Cipher();
       
       System.out.println(a.encrypt2("ABCZ"));
       a.setOffset(-4);
       System.out.println(a.encrypt2("BCDA"));
    }
}
