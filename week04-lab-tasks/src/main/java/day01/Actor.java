package day01;

public class Actor {
	private String actorName;
	private int actorBirthDate;

	public Actor(String actorName, int actorBirthDate) {
		this.actorName = actorName;
		this.actorBirthDate = actorBirthDate;
	}

	public String getActorName() {
		return actorName;
	}

	public int getActorBirthDate() {
		return actorBirthDate;
	}
}
