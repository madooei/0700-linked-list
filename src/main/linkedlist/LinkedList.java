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
    head = null;
    tail = null;
    size = 0;
  }

  public void add(T value) {
    Node<T> newNode = new Node<>(value);
    if (head == null) {
      head = newNode;
      tail = newNode;
    } else {
      newNode.prev = tail;
      tail.next = newNode;
      tail = newNode;
    }
    size++;
  }

  public T get(int index) {
    validateIndex(index);
    return node(index).value;
  }

  public void set(int index, T value) {
    validateIndex(index);
    node(index).value = value;
  }

  public int size() {
    return size;
  }

  public boolean contains(T value) {
    return indexOf(value) != -1;
  }

  // Returns -1 if value is not found.
  public int indexOf(T value) {
    Node<T> current = head;
    int index = 0;
    while (current != null) {
      if (Objects.equals(current.value, value)) {
        return index;
      }
      current = current.next;
      index++;
    }
    return -1;
  }

  // Removes the element at a given index and returns what was removed.
  public T remove(int index) {
    validateIndex(index);
    Node<T> target = node(index);
    T removed = target.value;
    unlink(target);
    return removed;
  }

  // Removes the first element equal to value and returns whether anything was removed.
  public boolean remove(T value) {
    Node<T> target = node(value);
    if (target == null) {
      return false;
    }
    unlink(target);
    return true;
  }

  // Assumes index is in bounds.
  private void validateIndex(int index) {
    if (index < 0 || index >= size) {
      throw new IndexOutOfBoundsException();
    }
  }

  // Assumes target is in the list.
  private void unlink(Node<T> target) {
    if (target.prev == null) {
      head = target.next;
    } else {
      target.prev.next = target.next;
    }

    if (target.next == null) {
      tail = target.prev;
    } else {
      target.next.prev = target.prev;
    }

    size--;
  }

  // Traverse to the node at a given index. Private — nodes never leave the class.
  private Node<T> node(int index) {
    if (index < size / 2) {
      Node<T> current = head;
      for (int i = 0; i < index; i++) {
        current = current.next;
      }
      return current;
    } else {
      Node<T> current = tail;
      for (int i = size - 1; i > index; i--) {
        current = current.prev;
      }
      return current;
    }
  }

  // Returns the first node with the given value, or null if not found.
  private Node<T> node(T value) {
    Node<T> current = head;
    while (current != null) {
      if (Objects.equals(current.value, value)) {
        return current;
      }
      current = current.next;
    }
    return null;
  }
}
