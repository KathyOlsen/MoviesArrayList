import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        ArrayList<String> movies = new ArrayList<>();

        Scanner key = new Scanner(System.in);
        String another = "";
        while(!another.equalsIgnoreCase("q")){
            System.out.println("Please enter the title of one of your favorite movies: ");
            String newMovie = key.nextLine();
            movies.add(newMovie);
            System.out.println("Do you want enter another color or quit? (a/q)" );
            another = key.nextLine();
        }

        System.out.println("The movies you entered are: " + movies + "\n");

        Collections.sort(movies);
        System.out.println("Here is your list of movies sorted alphabetically:" + movies + "\n");

        Collections.shuffle(movies);
        System.out.println("Tonight would be a great time to watch " + movies.get(0) + "!");
    }
}
