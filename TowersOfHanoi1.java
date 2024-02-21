import java.util.Deque;
import java.util.LinkedList;

public class TowersOfHanoi1 {
  public static void main(String[] args){
    Deque<Integer> start = new LinkedList<Integer>();
    Deque<Integer> end = new LinkedList<Integer>();
    Deque<Integer> middle = new LinkedList<Integer>();
    start.push(5);
    start.push(4);
    start.push(3);
    start.push(2);
    start.push(1);
    System.out.println("start:"+start);
    move(start, end, middle, start.size());
    System.out.println("end:"+end);
  }

  public static void move(Deque<Integer> start, Deque<Integer> end, 
    Deque<Integer> middle, int n){
    if(n==1){
      end.push(start.pop());
    }else{
      move(start, middle, end, n-1);
      end.push(start.pop());
      move(middle, end, start, n-1);
    }
  }
}
