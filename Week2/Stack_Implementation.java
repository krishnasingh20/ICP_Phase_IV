import java.util.*;
public class Stack {
  private int[] arr;
  private int size = 0;
  public Stack() {//default consructor
    arr = new int[10];//by default stack size is 10
  }
  public Stack(int n) {
    arr = new int[n];
  }
  public void push(int val) throws Exception{
    if(size == arr.length) {
      throw new Exception("Stack is Overflow");
    }
    arr[size] = val;
    size++;
  }
  
  public int pop() throws Exception{
    if(size == 0) {
      throw new Exception("Stack is underflow");
    }
    size--;
    return arr[size];
  }
  public int peek() throws Exception{
    if(size == 0) {
      throw new Exception("Stack is underflow");
    }
    return arr[size-1];
  }
  public boolean isEmpty() {
    return size == 0;
  }
  public int size() {
    return size;
  }
  public static void main(String[] args) throws Exception{
    Scanner sc = new Scanner(System.in);
    Stack st = new Stack(20);
    st.push(10);
    st.push(20);
    st.push(30);
    st.push(40);
    st.push(50);
    System.out.println(st.pop());
    System.out.println(st.size());
    System.out.println(st.isEmpty());
    System.out.println(st.pop());
    System.out.println(st.pop());
    System.out.println(st.pop());
    System.out.println(st.pop());
    System.out.println(st.pop());
  }
}
