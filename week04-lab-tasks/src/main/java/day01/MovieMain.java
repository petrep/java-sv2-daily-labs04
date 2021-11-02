package day01;

public class MovieMain {
	public static void main(String[] args) {
		Movie movie = new Movie("It", 1984);
		Actor actor1 = new Actor("Bill Burr", 1960);
		Actor actor2 = new Actor("John Burr", 1995);
		Actor actor3 = new Actor("Jack Burr", 2004);
		movie.addActor(actor1);
		movie.addActor(actor2);
		movie.addActor(actor3);
		System.out.println("How many actors were in their 20s and 30s in the movie?");
		System.out.println(movie.actorsInTheirTwenties());
	}
}
