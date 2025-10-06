import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

// Another version using "staks" of numbers to represent the towers
public class TowersOfHanoi1 {
  static Deque<Integer> start = new LinkedList<Integer>();
  static Deque<Integer> end = new LinkedList<Integer>();
  static Deque<Integer> middle = new LinkedList<Integer>();
  static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args){
    start.push(5);
    start.push(4);
    start.push(3);
    start.push(2);
    start.push(1);
    display();
    move(start, end, middle, start.size());
    display();
    scanner.close();
  }

  public static void move(Deque<Integer> s, Deque<Integer> e,
    Deque<Integer> m, int n){
    if(n==1){
      e.push(s.pop());
      display();
    }else{
      move(s, m, e, n-1);
      e.push(s.pop());
      display();
      move(m, e, s, n-1);
    }
  }

  public static void display(){
    System.out.print("\033\143"); //clear console
    System.out.println("start :"+toString(start));
    System.out.println("middle:"+toString(middle));
    System.out.println("end   :"+toString(end));
    System.out.println("Press Enter to continue");
    scanner.nextLine();
  }

  private static String toString(Deque<Integer> stack) {
    String result = "";
    for (Integer i : stack) {
      result = i+" "+result;
    }
    return result;
  }
}
