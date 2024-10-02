import java.util.Arrays;

public class App {
  
  public static void main(String[] args) {
    int [] arr = new int[]{45, 92, 38, 33, 21};
    for(int i=0; i<arr.length; i++){
      System.out.println(arr[i]);
    }
    System.out.println();

    for(int i=arr.length-1; i>0; i--){
      System.out.println(arr[i]);
    }
    System.out.println();
    // Java Stream: c'est une maniere plus simple de parcourir un tableau.
    // ca permet de faire aussi des calculs comme la somme, la moyenne etc
    Arrays.stream(arr).forEach(System.out::println);
    //Arrays.stream(arr).filter(null);
    //Arrays.stream(arr).average();
    //Arrays.stream(arr).sum();
  }
}