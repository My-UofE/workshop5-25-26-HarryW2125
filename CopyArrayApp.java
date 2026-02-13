import java.util.Arrays;
import java.util.ArrayList;

public class CopyArrayApp{
  public static void main(String[] args) {
    int nVals = args.length;
    int[] myVals = new int[nVals];
    ArrayList<Integer> uniqueVals = new ArrayList<>();
    for (int i = 0; i < nVals; i++) {
      if (uniqueVals.contains(Integer.parseInt(args[i])) == false){
        uniqueVals.add(Integer.parseInt(args[i]));
      }
      myVals[i] = Integer.parseInt(args[i]);
    }
    System.out.println("original values: " + Arrays.toString(myVals));
    System.out.println("unique values: " + uniqueVals);

  }
}