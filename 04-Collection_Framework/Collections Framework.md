## Collection Framework (Java)

### 1️⃣ What is this?

The **Collection Framework** in **Java** is a **set of classes and interfaces used to store and manipulate groups of objects dynamically**.

It provides **ready-made data structures** such as:

* Lists
* Sets
* Queues
* Maps

Instead of creating your own data structures, Java provides these **predefined utilities**.

Example:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println(list);
    }
}
```

Here **ArrayList** is part of the Collection Framework.

Output

```
[10, 20, 30]
```

---

# 2️⃣ Why is this used?

Collection Framework is used because:

1️⃣ **Dynamic size**
Arrays have fixed size, collections grow automatically.

2️⃣ **Ready-made data structures**
You don’t need to implement lists, sets, or queues manually.

3️⃣ **Easy data manipulation**
Operations like add, remove, search are simple.

4️⃣ **Better performance and reusable code**

---

# 3️⃣ Where is this used?

Collection Framework is used in:

* Data storage in programs
* Database applications
* Web applications
* Competitive programming
* Large software systems

Example:
If you want to store **thousands of student objects**, collections make it easy.

---

# Main Interfaces in Collection Framework

| Interface | Purpose                               |
| --------- | ------------------------------------- |
| **List**  | Ordered collection, allows duplicates |
| **Set**   | No duplicate elements                 |
| **Queue** | FIFO data structure                   |
| **Map**   | Stores key-value pairs                |

---

# Important Classes

| Class             | Feature               |
| ----------------- | --------------------- |
| **ArrayList**     | Dynamic array         |
| **LinkedList**    | Doubly linked list    |
| **HashSet**       | No duplicate elements |
| **HashMap**       | Key-value storage     |
| **PriorityQueue** | Priority-based queue  |

---

# Simple Collection Hierarchy

```
Iterable
   |
Collection
 ┌───────┬─────────┬─────────┐
List     Set      Queue
 |        |         |
ArrayList HashSet  PriorityQueue
LinkedList
```

`Map` is **separate from Collection interface**.

---
**##Collection API :**
1️⃣ What is this?

The Collection API in Java is a set of classes and interfaces that provide methods to store, retrieve, and manipulate groups of objects.

It is part of the Java Collection Framework and provides ready-made methods such as:

add()
remove()
size()
clear()
contains()

These methods help programmers work easily with collections of data.

Example:

import java.util.*;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("Apple");
        list.add("Banana");
        list.add("Mango");

        System.out.println(list.size());
    }
}

Here ArrayList uses the Collection API methods like add() and size().

Output:

3
2️⃣ Why is this used?

Collection API is used because it:

1️⃣ Provides ready-made methods for data manipulation

2️⃣ Reduces coding effort (no need to implement data structures manually)

3️⃣ Improves performance and efficiency

4️⃣ Allows dynamic data storage

**Comparator vs Comparable (Java)**
1️⃣ What is this?

Both Comparable and Comparator in Java are interfaces used to sort objects.

They define how objects should be compared for sorting.

Example:
Sorting students by marks, name, or age.

Comparable

Comparable is used when a class itself defines its natural sorting order.

It uses the method:

compareTo()

Example:

class Student implements Comparable<Student> {
    int age;

    public int compareTo(Student s) {
        return this.age - s.age;
    }
}

Here objects are sorted by age.

Comparator

Comparator is used when sorting logic is defined in a separate class.

It uses the method:

compare()

Example:

class AgeComparator implements Comparator<Student> {

    public int compare(Student s1, Student s2) {
        return s1.age - s2.age;
    }
}
2️⃣ Why is this used?

They are used to:

1️⃣ Sort objects in collections

Example with ArrayList

2️⃣ Define custom sorting logic

Example:

sort students by age
sort students by name
sort products by price

3️⃣ Control ordering of objectsting your own code for searching, sorting, adding, removing, the API already provides methods.

---


