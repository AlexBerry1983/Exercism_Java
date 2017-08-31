public class PangramChecker {

    public boolean isPangram(String input) {
      String stringToCheck = input.toLowerCase();
      if(stringToCheck == ""){
        return false;
      }
      for (char i='a'; i<='z'; i++){
        if((stringToCheck.indexOf(i)<0) && (stringToCheck.indexOf((char)(i + 32))< 0))
          return false;
      }
      return true;
    }

}
