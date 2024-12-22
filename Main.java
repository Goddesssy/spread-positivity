public class Main {
    public static void main(String[] args) {
        String purple = "";
        
        System.out.print("who needs uplifting today?: ");
        purple = System.console().readLine();
        System.out.println(motivateSomeone(purple));
    }

    public static String motivateSomeone(String blackpeople) {
        return blackpeople + ", you are beautiful, you are loved, you are special.";
    } 
}