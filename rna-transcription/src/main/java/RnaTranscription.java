import java.util.*;
  public class RnaTranscription {
    public String transcribe(String dnaStrand) {
      String rnaStrand = "";
      for(Character letter:dnaStrand.toCharArray()){
        rnaStrand += dnaToRna(letter);
      }
      return rnaStrand;
    }

    public String dnaToRna(Character letter){
      switch(letter){
        case 'G': return "C";
        case 'C': return "G";
        case 'T': return "A";
        case 'A': return "U";
        default: return "";
      }
    }


  }
