public class Game {
    String movieName;

    public Game(String movieName) {
        this.movieName = movieName;
    }

    public String convert() {
        String name = "";
        for (int i = 0; i < this.movieName.length(); i++)
            if (this.movieName.charAt(i) == ' ') {
                name += " ";
            } else {
                name += '_' + "";
            }
        return name;
    }

    public String toString() {
        return movieName;
    }

    public boolean check(String c) {
        for (int i = 0; i < this.movieName.length(); i++) {
            if (this.movieName.charAt(i) == c.charAt(0)) {
                return true;
            }
        }
        return false;
    }

    public String validate(String n, String c) {
        String n1 = n;
        boolean flag = this.check(c);
        if (flag) {
            for (int i = 0; i < this.movieName.length(); i++) {
                if (this.movieName.charAt(i) == c.charAt(0)) {
                    n1= n1.substring(0, i) + c + n1.substring(i+1, this.movieName.length());
                }

            }
            return n1;
        }
        return n1;
    }
    public boolean check(String a , String b){
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == b.charAt(0)) {
                return true;
            }
        }
        return false;
    }

}



