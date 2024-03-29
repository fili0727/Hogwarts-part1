import java.time.*;

public class HogwartsTeacher extends Teacher implements HogwartsPerson {

  private House house;
  private boolean headOfHouse;

  public HogwartsTeacher(
    House house,
    boolean headOfHouse,
    EmpType employment,
    LocalDate employmentStart,
    LocalDate employmentEnd,
    String firstName,
    String middleName,
    String lastName
  ) {
    super(
      firstName,
      middleName,
      lastName,
      employment,
      employmentStart,
      employmentEnd
    );
    this.house = house;
    this.headOfHouse = headOfHouse;
  }

  public HogwartsTeacher(
    House house,
    boolean headOfHouse,
    String fullName,
    EmpType employment,
    LocalDate employmentStart,
    LocalDate employmentEnd
  ) {
    super(fullName, employment, employmentStart, employmentEnd);
    this.house = house;
    this.headOfHouse = headOfHouse;
  }

  public HogwartsTeacher() {}

  public House getHouse() {
    return house;
  }

  public boolean isHeadOfHouse() {
    return headOfHouse;
  }

  public void setHouse(House house) {
    this.house = house;
  }

  public void setHeadOfHouse(boolean headOfHouse) {
    this.headOfHouse = headOfHouse;
  }

  public String toString() {
    return (
      "Hogwarts teacher name: " +
      getFullName() +
      "\n" +
      "House: " +
      house +
      "\n" +
      "Head of House: " +
      headOfHouse +
      "\n" +
      " employment: " +
      getEmployment() +
      "\n" +
      " employmentStart: " +
      getEmploymentStart() +
      "\n" +
      " employmentEnd: " +
      getEmploymentEnd()
    );
  }
}
