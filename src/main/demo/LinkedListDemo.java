package demo;

import linkedlist.LinkedList;

/** A demo of the chapter's doubly linked LinkedList. */
public final class LinkedListDemo {

  private LinkedListDemo() {
    // This class should not be instantiated!
  }

  public static void main(String[] args) {
    LinkedList<String> names = new LinkedList<>();
    names.add("Ada");
    names.add("Linus");
    names.add("Grace");
    // Expect [Ada, Linus, Grace], size 3, and Linus at index 1.
    System.out.println("names: " + toString(names));
    System.out.println("size = " + names.size());
    System.out.println("get(1) = " + names.get(1));

    // Expect [Ada, Alan, Grace].
    names.set(1, "Alan");
    System.out.println("after set(1, \"Alan\"): " + toString(names));

    // Expect true and 2.
    System.out.println("contains(\"Grace\")? " + names.contains("Grace"));
    System.out.println("indexOf(\"Grace\") = " + names.indexOf("Grace"));

    // remove(0) returns Ada. Expect [Alan, Grace].
    String removed = names.remove(0);
    System.out.println("remove(0) returned " + removed + " -> " + toString(names));

    // Expect [Alan].
    names.remove("Grace");
    System.out.println("after remove(\"Grace\"): " + toString(names));

    // The remove overload trap: remove(int) is by index, remove(T) is by value.
    LinkedList<Integer> scores = new LinkedList<>();
    scores.add(50);
    scores.add(60);
    scores.add(70);
    System.out.println();
    System.out.println("scores: " + toString(scores));

    // remove(int) removes index 2, the 70. Expect [50, 60].
    scores.remove(2);
    System.out.println("after remove(2) by index: " + toString(scores));

    // remove(T) removes the value 50. Expect [60].
    scores.remove(Integer.valueOf(50));
    System.out.println("after remove(Integer.valueOf(50)) by value: " + toString(scores));
  }

  // Builds "[a, b, c]" by reading the list through its public get and size.
  private static <T> String toString(LinkedList<T> list) {
    StringBuilder str = new StringBuilder();
    str.append("[");
    for (int i = 0; i < list.size(); i++) {
      str.append(list.get(i));
      if (i < list.size() - 1) {
        str.append(", ");
      }
    }
    str.append("]");
    return str.toString();
  }
}
