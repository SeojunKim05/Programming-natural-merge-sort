# Natural Merge Sort in Java

This project demonstrates an implementation of the **Natural Merge Sort** algorithm in Java. It also includes a robust testing suite for verifying the behavior of `getSortedRunLength`, a helper method critical to identifying naturally sorted runs in an array.

---

## 📁 Project Structure

The repository contains three main Java files in the `csc143` package:

### 1. `NaturalMerge.java`
- Contains the `main()` method.
- Sets up test arrays and test cases.
- Runs both:
  - Unit tests for `getSortedRunLength()`
  - A full natural merge sort using `naturalMergeSort()`.

### 2. `NaturalMergeSorter.java`
- Implements the core functionality of the **Natural Merge Sort** algorithm.
- Key methods:
  - `getSortedRunLength(int[] array, int arrayLength, int startIndex)`: Detects the length of a naturally sorted ascending run starting at a given index.
  - `naturalMergeSort(int[] array, int arrayLength)`: Repeatedly merges adjacent sorted runs until the entire array is sorted.
  - `merge(...)`: Merges two adjacent sorted subarrays.

### 3. `RunLengthTestCase.java`
- A utility class for setting up and executing test cases for `getSortedRunLength()`.
- Outputs detailed test result information, including array contents, expected vs. actual return values, and PASS/FAIL status.

---

## ✅ Features

- Detects naturally sorted runs within arrays.
- Sorts arrays using **natural merge sort**, which takes advantage of existing order.
- Automatically verifies correctness through a series of unit tests.

---

## 🧪 Example Output

Sample result from running the project:

PASS: getSortedRunLength()
Array: [15, 23, 23, 23, 31, 64, 77, 87, 88, 91]
Start index: 0
Expected return value: 10
Actual return value: 10
...

PASS: naturalMergeSort()
Array before calling naturalMergeSort(): [92, 71, 18, 26, 54, 73, 89, 10, 39, 99, 64, 22]
Array after calling naturalMergeSort(): [10, 18, 22, 26, 39, 54, 64, 71, 73, 89, 92, 99]

yaml
Copy
Edit

---

## 🧠 Educational Value

This project is ideal for:
- Understanding how **natural merge sort** differs from classical merge sort.
- Practicing test-driven development in Java.
- Learning how to detect sorted subsequences programmatically.

---

## 🚀 How to Run

1. Clone this repository.
2. Compile all files:
   ```bash
   javac csc143/*.java
Run the main class:

bash
Copy
Edit
java csc143.NaturalMerge
