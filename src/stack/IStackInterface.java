package stack;

public interface IStackInterface<T> {
  void push(T element) throws StackOverflowException;
  void pop() throws StackUnderflowException;
  T top() throws StackUnderflowException;
  boolean isFull();
  boolean isEmpty();
//  String select(String phrase, String nextAction);

//  int size();
//
//  boolean swapStart();
}
