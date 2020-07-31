
package week10;

public class Student {
  
  private String fullName, matricNumber, email, city;
  private double height;
  private int age;

  public Student() {
      fullName = "";
      matricNumber="";
      email="";
      city="";
      height=0.0;
      age = 0;              
  }

    public Student(String fullName, String matricNumber, 
            String email, String city, double height, int age) {
        this.fullName = fullName;
        this.matricNumber = matricNumber;
        this.email = email;
        this.city = city;
        this.height = height;
        this.age = age;
    }

  
  
  public String getFullName() {
        return fullName;
    }

    public String getMatricNumber() {
        return matricNumber;
    }

    public String getEmail() {
        return email;
    }

    public String getCity() {
        return city;
    }

    public double getHeight() {
        return height;
    }

    public int getAge() {
        return age;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setMatricNumber(String matricNumber) {
        this.matricNumber = matricNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "Full Name : " +  fullName + "\n" + 
               "Matric Number : " + matricNumber + "\n" + 
               "Email : " + email + "\n" +
               "City : " + city + "\n" +
               "Height : " + height + "\n" +
               "Age : " + age; 
    }
  
  
}
