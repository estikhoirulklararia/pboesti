vc 
public class HelloWorld {
    public static void main(String[] args){
    int i = 0;
    
    String[] greetings={
        "Hello world",
        "No, I mean it!",
        "HELLO WORLD!!",
        "HELLO WORLD!!",
        "HELLO WORLD!!",
    };
        try {
            System.out.println(greetings[3]); 
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Program anda EROR");
        } finally {
            System.out.println("Program anda sudah berjalan");
        }
    }
}