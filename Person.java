public class Person {

  private String firstName;
  private String lastName;
  private String middleName;

  public Person(String firstName, String middleName, String lastName) {
    this.firstName = firstName;
    this.middleName = middleName;
    this.lastName = lastName;
  }

  public Person() {}

  public Person(String firstName, String lastName) {
    this(firstName, null, lastName);
  }

  public Person(String fullName) {
    setFullName(fullName);
  }

  public void makeHarry() {
    firstName = "Harry";
    lastName = "Potter";
  }

  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public String getMiddleName() {
    return middleName;
  }

  public String getFullName() {
    if (middleName != null) {
      return firstName + " " + middleName + " " + lastName;
    } else {
      return firstName + " " + lastName;
    }
  }

  public void setFullName(String fullName) {
    String[] names = fullName.split(" ");

    this.firstName = names[0];
    this.lastName = names[names.length - 1];

    if (names.length > 2) {
      middleName = names[1];
    } else {
      middleName = null;
    }
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public void setMiddleName(String middleName) {
    this.middleName = middleName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String toString() {
    return (
      "{\nfirstName: " +
      firstName +
      ",\n middleName: " +
      middleName +
      ",\n lastName: " +
      lastName +
      "\n}"
    );
  }

  public static void main(String[] args) {}
}
