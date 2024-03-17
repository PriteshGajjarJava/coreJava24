

//### Example of User Defined Exception
class UserDefinedExceptionDemo {
   public static void main(String[] args) {
    int age = Integer.parseInt(args[0]);
    try {
     boolean isValid = Person.validateAge(age);
    }catch(AgeInvalidException e) {
      System.out.println("Age is Invalid. Please pass age between 1-100");
    }
   } 
}

class Person {
  static boolean validateAge(int age) throws AgeInvalidException {
    if (age < 0 || age > 100) {
      throw new AgeInvalidException();
    }
    System.out.println("Age " + age + " is valid");
    return true;
  }
}
// Checked Exception
class AgeInvalidException extends Exception {
} 