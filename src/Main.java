import java.util.*;
import java.io.*;
public class Main {

    public static boolean check(String a, String b) {
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == b.charAt(0)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) throws Exception {
        File file = new File("movieList.txt");
        Scanner sc = new Scanner(file);
        Scanner s = new Scanner(System.in);
        int i = 0;
        String[] movies = new String[25];
        while (sc.hasNextLine()) {
            movies[i] = sc.nextLine();
            i++;
        }
        int length = movies.length;
        int random = (int) (Math.random() * length);
        Game begin = new Game(movies[random]);
        boolean ending = false;
        String game = begin.convert();
        int j = 0;
        String line1 = "";
        String wrong = "";
        while (j < 5) {
            line1 = "You have guessed (" + j + ") wrong letters: " + wrong;
            System.out.println("You are guessing: " + game);
            System.out.println(line1);
            System.out.print("Guess a Letter: ");
            String c = s.nextLine();
            System.out.println();
            if (begin.check(c)) {
                game = begin.validate(game, c);
                if(game.equals(begin.movieName)){
                    ending = true;
                    break;
                }
            } else {
                boolean flag = check(wrong, c);
                if (flag) {
                    System.out.println("You already guessed that!");
                } else {
                    wrong = wrong + c + " ";
                    j++;
                }
            }

        }
        if(ending){
            System.out.println(game);
            System.out.println("YOU WON!");
        }else{
            System.out.println("YOU LOST!");
            System.out.println("GOODLUCK NEXT TIME");
        }

    }
}