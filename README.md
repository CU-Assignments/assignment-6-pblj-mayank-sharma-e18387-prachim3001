[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/0E9Btkep)
# PBLJ-Assignment-6

# Assignment 6: Lambda Expressions and Stream Operations in Java

## 🔹 Topics Covered:
- Lambda Syntax
- Functional Interfaces
- Method References
- Stream Operations
  - Sorting
  - Filtering
  - Mapping
  - Reducing

## 📝 Problem Statements

### ✅ Problem 1: Sorting Employees (Easy Level)
**Description:**
Write a Java program to sort a list of Employee objects using lambda expressions. Each Employee object should have the following attributes:
- `name` (String)
- `age` (int)
- `salary` (double)

**Example Input:**
```java
List<Employee> employees = Arrays.asList(
    new Employee("John", 30, 50000),
    new Employee("Alice", 25, 60000),
    new Employee("Bob", 35, 45000)
);
```

**Example Output (Sorted by Salary Ascending):**
```text
Employee{name='Bob', age=35, salary=45000.0}
Employee{name='John', age=30, salary=50000.0}
Employee{name='Alice', age=25, salary=60000.0}
```

---

### ✅ Problem 2: Filtering and Sorting Students (Medium Level)
**Description:**
Create a Java program that uses lambda expressions and stream operations to:
1. Filter students who scored above 75%
2. Sort them by marks in descending order
3. Display their names

**Example Input:**
```java
List<Student> students = Arrays.asList(
    new Student("Emma", 85),
    new Student("Liam", 72),
    new Student("Olivia", 90),
    new Student("Noah", 78)
);
```

**Example Output:**
```text
Olivia
Emma
Noah
```

---

### ✅ Problem 3: Processing a Large Dataset of Products (Hard Level)
**Description:**
Write a Java program to process a dataset of products using streams. Perform the following operations:
1. Group products by category
2. Find the most expensive product in each category
3. Calculate the average price of all products

**Example Input:**
```java
List<Product> products = Arrays.asList(
    new Product("Laptop", "Electronics", 75000),
    new Product("Smartphone", "Electronics", 50000),
    new Product("Table", "Furniture", 10000),
    new Product("Chair", "Furniture", 5000)
);
```

**Example Output:**
```text
Most Expensive Product per Category:
Electronics: Laptop (75000.0)
Furniture: Table (10000.0)

Average Price of All Products: 35000.0
```

---

## 🛠 Requirements:
- Java 8 or above
- IDE (Eclipse/IntelliJ/VS Code)

## 📂 Folder Structure:
```
Assignment-3/
│── src/
│   ├── EmployeeSorter.java
│   ├── StudentFilter.java
│   ├── ProductProcessor.java
│── README.md
│── input_output_examples.txt
```

## 🚀 How to Run the Code:
1. Clone this repository or download the source files.
2. Open the project in your preferred IDE.
3. Compile and run the respective Java files under `src/`.
4. Observe the output as per the given examples.

Happy Coding! 🎯

