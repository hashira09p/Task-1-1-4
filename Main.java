/**
 * Main
 */
public class Main {
    public static void main(String[] args) {
        int check_number = 10;
        String message;

        for(int i = 0; i<=check_number; i++){
            if(i%2==0){
                message = i + " " + "is Even Number";
                System.out.println(message);
            }
            else{
                message = i + " " + "is Odd Number";
                System.out.println(message);
            }
        }
    }
    
}
