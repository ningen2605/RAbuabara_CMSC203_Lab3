import java.util.*;
public class MovieDriver {

    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        Movie movie = new Movie();
        String choice;
        do {
            System.out.println("Enter the title of a movie: ");
            String title = in.nextLine();
            movie.setTitle(title);

            System.out.println("Enter the rating of the movie: ");
            String rating = in.nextLine();
            movie.setRating(rating);

            System.out.println("Enter the number of sold tickets: ");
            int tickets = in.nextInt();
            movie.setSoldTickets(tickets);

            System.out.println(movie.toString() + "\n");
            String keyboard = in.nextLine();
            System.out.println("Do you want to enter another? (y or n)");
            choice = in.nextLine();
        } while(choice.equals("y"));
        System.out.println("Goodbye\n Programmer: Ricardo Abuabara");
    }
}
