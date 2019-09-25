package stack;

public interface IStackInterface<T> {
  void push(T element) throws StackOverflowException;
  void pop() throws StackUnderflowException;
  T top() throws StackUnderflowException;
  boolean isFull();
  boolean isEmpty();

  int size();

  boolean swapStart();
}
