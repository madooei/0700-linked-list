# The Linked List

A list that stores its elements in linked nodes rather than a backing array.

## Prerequisites

- JDK 17+

## Repository layout

```plaintext
code/
  README.md
  .gitignore
  src/
    main/
      linkedlist/
        LinkedList.java   # the chapter's doubly linked list: head/tail/size, private Node
      demo/
        LinkedListDemo.java
  scripts/
    run.sh                # compile everything and run one demo
```

## How to compile and run

- `scripts/run.sh demo.LinkedListDemo` — compiles everything and runs that one demo. Every class you implement has its own demo, `<Class>Demo`.

There is no build tool and no test suite: testing is introduced later in the course. The script above is all you need.

## What's here

- `linkedlist.LinkedList<T>` — the chapter's doubly linked list. It keeps `head`, `tail`, and `size`, and a private static `Node<T>` with `value`, `next`, and `prev`. The public surface matches `DynamicArray` — `add`, `get`, `set`, `size`, `contains`, `indexOf`, and the two `remove` overloads — so code written against those operations could be handed either class. The private `node(index)` traversal starts from whichever end is nearer. `add` and `remove` branch on the ends of the list (the empty case, the head, the tail).
- `demo.LinkedListDemo` — the demo of `LinkedList`: build a list, read and update it by index, search it, remove by index and by value, and the `remove(int)` vs `remove(T)` overload trap.
