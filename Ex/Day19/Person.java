/**
*  Example Person class
* @author Bita Akram
* @version 1.0
*/

public class Person {
    /**
    *  instance variable which holds first name of the person
    */
    private String firstName;
    /**
    *  instance variable which holds last name of the person
    */
    private String lastName;

    /**
    *  instance variable which holds age of the person
    */
    private int age;

    /**
   * The complete Constructor.  This initializes each instance 
   * variable to a value provided by the user of the constructor.
   * @param initName the initial value to use for first name
   * @param initLastName the initial value to use for last name
   * @param initAge the initial value to use for age
   */ 
    public Person(String initName, String initLastName, int initAge) {
        firstName = initName;
        lastName = initLastName;
        age = initAge;
    }
    
   /**
   * Retrieves the value of the firstName variable and returns it
   * to the caller of the method as a String.
   * @return the value of firstName as a String
   */
    public String getFirstName() {
        return firstName;
    }

   /**
   * Retrieves the value of the lastName variable and returns it
   * to the caller of the method as a String.
   * @return the value of lastName as a String
   */
    public String getLastName() {
        return lastName;
    }

   /**
   * Retrieves the value of firstName and lastName variables
   * and returns the concatenated String to the caller of the 
   * method as a String.
   * @return the value of first + last name as a String
   */
    public String getFullName() {
        return (firstName + " " + lastName);
    }

   /**
   * Retrieves the value of the age variable and returns it
   * to the caller of the method as a age.
   * @return the value of age as a age
   */
    
    public int getAge() {
        return age;
    }

    /**
   * Sets the firstName instance variable to the given String
   * value.  
   * @param inputFirstName the new value to use for firstName
   */ 
    public void setFirstName(String inputFirstName) {
        firstName = inputFirstName;
    }

   /**
   * Sets the lastName instance variable to the given String
   * value.  
   * @param inputLastName the new value to use for lastName
   */ 
    public void setLastName(String inputLastName) {
        lastName = inputLastName;
    }

   /**
   * Sets the age instance variable to the given int value.  
   * @param inputAge the new value to use for age
   */
    
    public void setLastName(int inputAge) {
        age = inputAge;
    }

}
