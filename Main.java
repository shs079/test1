import java.util.ArrayList;
import java.util.Random;

class Main {
  public static void main(String[] args) {
    
    ArrayList<Double> myList = new ArrayList<>();

    for (int i = 0; i < 4; i++){
      myList.add(Math.random());
    }

    System.out.println(myList);
  }
public class RandomIntegerGenerator {
    public static int generateRandomInt(int min, int max) {
        Random rand = new Random();
        return rand.nextInt((max - min) + 1) + min;
    }
  }
}

  
