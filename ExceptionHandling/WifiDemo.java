class WifiDemo {
  public static void main(String[] args) {
    try {
     WiFi.validateWiFiPassword(args[0]);
    }catch(InvalidWiFiPasswordException e) {  
      System.out.println("Password is incorrect");
    } 
  }   
}

//#InvalidWifiPasswordException

class WiFi {
  static boolean validateWiFiPassword(String pwd) throws InvalidWiFiPasswordException {
    if (pwd.length() != 8) {
      throw new InvalidWiFiPasswordException();
    }
    return true;
  }
}
class InvalidWiFiPasswordException extends Exception {}