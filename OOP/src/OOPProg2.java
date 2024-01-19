//02-02-2023 (Thursday)
public class OOPProg2 {
    static int j=0;
    public static void main(String[] args) {
        Movie m1=new Movie("Pathan","Abc Studio","R");
        Movie m2=new Movie("Race","Xyz","PG-13");
        Movie m3=new Movie("Radhe","Canio","PG-17");
        Movie m4=new Movie("RRR","Nela Tele Film");
        Movie m5=new Movie("Radhe","Stanus");

        Movie[] movies=new Movie[5];
        movies[0]=m1;
        movies[1]=m2;
        movies[2]=m3;
        movies[3]=m4;
        movies[4]=m5;
        Movie ans[]=getPG(movies);
        for(int i=0;i<j;i++){
            System.out.println(ans[i].getTitle() + "-->" + ans[i].getStudio()+ "-->" + ans[i].getRating());
        }
    }
    private static Movie[] getPG(Movie[] movies){
        Movie[] ans=new Movie[movies.length];
        for (int i=0;i< movies.length;i++){
            if(movies[i].getRating().equals("PG")){
                ans[j++]=movies[i];
            }
        }
        return ans;
    }
}
class Movie {
    private String title;
    private String studio;
    private String rating;

    public Movie(String title, String studio) {
        this.title = title;
        this.studio = studio;
        rating="PG";
    }

    public Movie(String title, String studio, String rating) {
        this.title = title;
        this.studio = studio;
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public String getStudio() {
        return studio;
    }

    public String getRating() {
        return rating;
    }
}

