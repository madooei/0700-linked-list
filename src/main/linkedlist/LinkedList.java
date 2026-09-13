package linkedlist;

import java.util.Objects;

/**
 * A doubly linked list.
 *
 * @param <T> Element type.
 */
public class LinkedList<T> {

  private Node<T> head;   // the first node, or null when empty
  private Node<T> tail;   // the last node, or null when empty
  private int size;       // how many nodes are in the list

  private static class Node<T> {
    T value;
    Node<T> next;
    Node<T> prev;

    Node(T value) {
      this.value = value;
    }
  }

  public LinkedList() {
    // TODO: Implement me
    throw new UnsupportedOperationException("TODO: Implement me");
  }

  public void add(T value) {
    // TODO: Implement me
    throw new UnsupportedOperationException("TODO: Implement me");
  }

  public T get(int index) {
    // TODO: Implement me
    throw new UnsupportedOperationException("TODO: Implement me");
  }

  public void set(int index, T value) {
    // TODO: Implement me
    throw new UnsupportedOperationException("TODO: Implement me");
  }

  public int size() {
    // TODO: Implement me
    throw new UnsupportedOperationException("TODO: Implement me");
  }

  public boolean contains(T value) {
    // TODO: Implement me
    throw new UnsupportedOperationException("TODO: Implement me");
  }

  // Returns -1 if value is not found.
  public int indexOf(T value) {
    // TODO: Implement me
    throw new UnsupportedOperationException("TODO: Implement me");
  }

  // Removes the element at a given index and returns what was removed.
  public T remove(int index) {
    // TODO: Implement me
    throw new UnsupportedOperationException("TODO: Implement me");
  }

  // Removes the first element equal to value and returns whether anything was removed.
  public boolean remove(T value) {
    // TODO: Implement me
    throw new UnsupportedOperationException("TODO: Implement me");
  }

  // Traverse to the node at a given index. Private — nodes never leave the class.
  private Node<T> node(int index) {
    // TODO: Implement me
    throw new UnsupportedOperationException("TODO: Implement me");
  }
}
