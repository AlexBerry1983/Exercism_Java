public class Hamming {

    public Hamming(String leftStrand, String rightStrand) {
        // throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
      this.leftStrand = leftStrand;
      this.rightStrand = rightStrand;
    }

    int getHammingDistance() {
        // throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
      int hammingDistance = 0;
      if(this.leftStrand.length() && this.rightStrand.length() == ""){
        return hammingDistance;
      }
    }

}
