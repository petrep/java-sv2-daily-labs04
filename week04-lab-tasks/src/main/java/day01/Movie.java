package day01;

import java.util.ArrayList;
import java.util.List;

public class Movie {
	private String movieTitle;
	private int movieReleaseYear;
	private List<Actor> actors = new ArrayList<>();

	public Movie(String movieTitle, int movieReleaseYear) {
		this.movieTitle = movieTitle;
		this.movieReleaseYear = movieReleaseYear;
	}

	public void addActor(Actor actor) {
		actors.add(actor);
	}

	public int actorsInTheirTwenties() {
		int youngActors = 0;

		for (Actor actualActor : actors) {
			int age = movieReleaseYear - actualActor.getActorBirthDate();
			if ((age >= 20) &&
				(age < 30)) youngActors++;
		}

//		for (int i = 0; i < actors.size(); i++) {
//			int age = 2021 - actors.get(i).getActorBirthDate();
//			if ((age >= 20 && age <= 30)) youngActors++;
//		}
		return youngActors;
	}
}
