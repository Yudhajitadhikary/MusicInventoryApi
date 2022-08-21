import service.MusicLibraryService;
import java.util.Scanner;
public class MusicLibraryApplication {
    public static void main(String[] args) {
        MusicLibraryService service= new MusicLibraryService();
        Scanner sc=new Scanner(System.in);

        int choice=0;
        while(choice !=-1){
            printTemplate();
            choice =sc.nextInt();
            switch(choice){
                case 1:
                    //Register a user
                    registerUser(sc,service);
                    break;
                case 2:
                    //Register an artist
                    registerArtist(sc,service);
                    break;
                case 3:
                    //Release
                    releaseSong(sc,service);
                    break;
                case 4:
                    //Listen
                    listenToSong(sc,service);
                    break;
                case -1:
                    System.out.println("Quitting the application");
                    break;
                default:
                    System.out.println("Please enter a valid choice");
                    break;
            }
        }
    }
    public static void printTemplate(){
        System.out.println("---------------");
        System.out.println("Enter a choice from the following");
        System.out.println("1. Register a user");
        System.out.println("2. Register an Artist");
        System.out.println("3. Release a Song");
        System.out.println("4. Listen to a Song");
        System.out.println("-1. Quit the Application");

    }
    public static void registerUser(Scanner sc, MusicLibraryService service){
        System.out.println("Enter the first Name:");
        String firstName=sc.next();
        System.out.println("Enter the last Name:");
        String lastName=sc.next();
        System.out.println("Enter the email Id:");
        String emailId=sc.next();
        System.out.println("Enter the Phone Number:");
        long phoneNumber =sc.nextLong();
        System.out.println("Enter the city:");
        String city=sc.next();
        System.out.println("Enter the locality:");
        String locality=sc.next();
        System.out.println("Enter the State:");
        String state=sc.next();
        System.out.println("Enter the Pin Code:");
        int pinCode= sc.nextInt();
        service.registerUser(firstName,lastName,emailId,phoneNumber,city,locality,state,pinCode);


    }
    public static void registerArtist(Scanner sc, MusicLibraryService service) {
        System.out.println("Enter the first Name:");
        String firstName = sc.next();
        System.out.println("Enter the last Name:");
        String lastName=sc.next();
        service.registerArtists(firstName,lastName);
    }
    public static void releaseSong(Scanner sc, MusicLibraryService service) {
        System.out.println("Enter the title:");
        String title = sc.next();
        System.out.println("Enter the genre:");
        String genre=sc.next();
        System.out.println("Enter the Release Year:");
        int releaseYear=sc.nextInt();
        System.out.print("Enter the language");
        String language= sc.next();
        System.out.println("Enter the Artist id");
        long artistId=sc.nextLong();
        service.releaseSong(title,genre,releaseYear,language,artistId);

    }
    public static void listenToSong(Scanner sc, MusicLibraryService service) {
        System.out.println("Enter the User id:");
        long userId = sc.nextLong();
        System.out.println("Enter the Song id:");
        long songId =sc.nextLong();
        service.listenToSong(userId,songId);

    }
}
