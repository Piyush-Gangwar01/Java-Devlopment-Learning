## Stream API (Java) 

### 1️⃣ What is this?

The **Stream API** in **Java** is a feature that allows you to **process collections of data (like lists or sets) in a functional and efficient way**.

It helps perform operations like:

* filtering
* sorting
* mapping
* counting

on data stored in collections.

Streams **do not store data**; they only **process data from a source such as a collection**.

Example:

```java
import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(10,20,30,40);

        list.stream()
            .filter(x -> x > 20)
            .forEach(System.out::println);
    }
}
```

Output

```
30
40
```

Here **Stream** processes data from the **List**.

---

## 2️⃣ Why is this used?

Stream API is used because it:

1️⃣ **Simplifies data processing**

Instead of writing loops:

```java
for(int i : list){
    if(i > 20)
        System.out.println(i);
}
```

we can use streams in a single line.

2️⃣ **Supports functional programming**

Uses **lambda expressions** to process data.

3️⃣ **Improves readability and performance**

4️⃣ **Supports parallel processing**

Streams can run tasks on multiple CPU cores.

---

## 3️⃣ Where is this used?

Stream API is used in:

* Data filtering
* Data transformation
* Searching elements
* Sorting collections
* Large data processing

Example applications:

* Web applications
* Data analysis
* Backend services

---

# Common Stream Operations

### 1️⃣ filter()

Select elements based on condition.

```java
list.stream().filter(x -> x > 10);
```

---

### 2️⃣ map()

Transform elements.

```java
list.stream().map(x -> x * 2);
```

---

### 3️⃣ sorted()

Sort elements.

```java
list.stream().sorted();
```

---

### 4️⃣ forEach()

Process each element.

```java
list.stream().forEach(System.out::println);
```

---

# Types of Stream Operations

| Type                    | Description                   |
| ----------------------- | ----------------------------- |
| Intermediate Operations | filter(), map(), sorted()     |
| Terminal Operations     | forEach(), collect(), count() |

---

# Example (Full Program)

```java
import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Ram","Shyam","Piyush","Aman");

        names.stream()
             .filter(name -> name.startsWith("P"))
             .forEach(System.out::println);
    }
}
```

Output

```
Piyush
```

---

# Short Exam Definition

> Stream API in Java is used to process collections of data in a functional style using operations like filter, map, and forEach.

---

## Parallel Stream (Java) 

### 1️⃣ What is this?

A **Parallel Stream** in **Java** is a type of **stream that processes elements in parallel using multiple threads**.

Instead of processing data **one-by-one (sequentially)**, it splits the data into parts and processes them **simultaneously on different CPU cores**.

Parallel streams are part of the **Stream** in the Java **Stream API**.

Example:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8);

        list.parallelStream()
            .forEach(System.out::println);
    }
}
```

Here `parallelStream()` processes elements **using multiple threads**.

---

## 2️⃣ Why is this used?

Parallel streams are used to:

1️⃣ **Improve performance**
Large datasets can be processed faster.

2️⃣ **Utilize multi-core processors**

3️⃣ **Automatic multithreading**
Java automatically handles thread management.

Example:
Processing **millions of records** becomes faster using parallel streams.

---

## 3️⃣ Where is this used?

Parallel streams are used in:

* Large data processing
* Big data applications
* Data analytics
* Scientific computing
* Backend systems handling large datasets

For example, sorting or filtering large data collections stored in **List**.

---

# Sequential Stream vs Parallel Stream

| Feature   | Sequential Stream     | Parallel Stream       |
| --------- | --------------------- | --------------------- |
| Execution | One thread            | Multiple threads      |
| Speed     | Slower for large data | Faster for large data |
| Order     | Maintains order       | Order may change      |
| Method    | `stream()`            | `parallelStream()`    |

Example:

```java
list.stream()          // sequential
list.parallelStream()  // parallel
```

---

# Important Point

Parallel streams use the **Fork/Join framework** internally for parallel processing.

---

# Short Exam Definition

> A parallel stream in Java is a stream that processes elements concurrently using multiple threads to improve performance.

---




