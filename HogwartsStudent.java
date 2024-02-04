import java.util.ArrayList;

public class HogwartsStudent extends Student implements HogwartsPerson {

  private House house;
  private boolean prefect;
  private ArrayList<String> teams;

  public HogwartsStudent(
    House house,
    boolean prefect,
    ArrayList<String> teams,
    String firstName,
    String middleName,
    String lastName,
    int enrollmentYear,
    int graduationYear,
    boolean graduated
  ) {
    super(
      firstName,
      middleName,
      lastName,
      enrollmentYear,
      graduationYear,
      graduated
    );
    this.house = house;
    this.prefect = prefect;
    this.teams = teams;
  }

  public HogwartsStudent(
    House house,
    boolean prefect,
    String[] teams,
    String fullName,
    int enrollmentYear,
    int graduationYear,
    boolean graduated
  ) {
    super(fullName, enrollmentYear, graduationYear, graduated);
    this.house = house;
    this.prefect = prefect;
    this.teams = new ArrayList<String>();
  }

  public HogwartsStudent() {}

  public House getHouse() {
    return house;
  }

  public boolean isPrefect() {
    return prefect;
  }

  public ArrayList<String> getTeams() {
    return teams;
  }

  public void setHouse(House house) {
    this.house = house;
  }

  public void setPrefect(boolean prefect) {
    this.prefect = prefect;
  }

  public void setTeams(ArrayList<String> teams) {
    this.teams = teams;
  }

  public String toString() {
    return (
      "Hogwarts Student: " +
      getFullName() +
      " House: " +
      house +
      " Prefect: " +
      prefect +
      " Teams: " +
      teams
    );
  }
}
