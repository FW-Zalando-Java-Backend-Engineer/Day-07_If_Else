# **📘 Day-07: Java Conditional Structures – If, Else, Ternary, and Switch**  
Welcome to **Day-07** of our Java learning journey! Today, we’re diving deep into **decision-making structures** in Java. You’ll learn how to write programs that behave differently based on conditions – using `if`, `else`, `nested if`, the **ternary operator**, **logical operators**, and the powerful **switch-case** structure.

---

## **📌 Lesson Structure**

### **1️⃣ Introduction to Conditional Logic in Java**
- What is a **decision-making structure**?
- When and why we use **`if`, `else`, `switch`** statements

### **2️⃣ The `if` Statement**
- Executes a block only if a condition is true.
```java
if (score >= 60) {
    System.out.println("Passed");
}
```

### **3️⃣ The `if-else` Statement**
- Executes one block **if condition is true**, another if **false**.
```java
if (score >= 60) {
    System.out.println("Passed");
} else {
    System.out.println("Failed");
}
```

### **4️⃣ Nested `if-else` Structure**
- Allows **multi-level decision making**
```java
if (score >= 90) {
    System.out.println("A");
} else if (score >= 80) {
    System.out.println("B");
} else {
    System.out.println("Below B");
}
```

### **5️⃣ Logical Operators**
- Combine multiple conditions using:
  - **AND (`&&`)**
  - **OR (`||`)**
  - **NOT (`!`)**

### **6️⃣ Ternary Operator**
- A compact form of `if-else`
```java
String result = (score >= 60) ? "Passed" : "Failed";
```

### **7️⃣ Switch-Case Statement**
- A cleaner alternative to multiple `if-else` checks.
```java
switch (grade) {
    case 'A': System.out.println("Excellent!"); break;
    case 'B': System.out.println("Well Done"); break;
    default: System.out.println("Invalid Grade");
}
```

---

## **📜 Live Coding Examples**

### **🖥️ Basic If-Else**
```java
int grade = 65;
if (grade >= 60) {
    System.out.println("Passed");
} else {
    System.out.println("Failed");
}
```

---

### **🖥️ Nested If-Else (Grade Evaluator)**
```java
int grade = 85;

if (grade >= 90) {
    System.out.println("A");
} else if (grade >= 80) {
    System.out.println("B");
} else if (grade >= 70) {
    System.out.println("C");
} else if (grade >= 60) {
    System.out.println("D");
} else {
    System.out.println("F");
}
```

---

### **🖥️ Logical Operators Example**
```java
int age = 25;
boolean hasID = true;

if (age >= 18 && hasID) {
    System.out.println("Eligible to vote");
}
```

---

### **🖥️ Ternary Operator Example**
```java
int score = 45;
String result = (score >= 50) ? "Passed" : "Failed";
System.out.println(result);
```

---

### **🖥️ Switch Case Example**
```java
char grade = 'B';

switch (grade) {
    case 'A': System.out.println("Excellent!"); break;
    case 'B': System.out.println("Well Done"); break;
    case 'C': System.out.println("Good Job"); break;
    default:  System.out.println("Invalid Grade");
}
```

---

## **🎯 Hands-on Exercises**

✅ **Write a program** that checks if a user can vote (age >= 18 && hasID == true).  
✅ **Convert an if-else** grade checker into a switch-case version.  
✅ **Create a program** that classifies a number as **positive**, **negative**, or **zero** using nested `if-else`.  
✅ **Use a ternary operator** to return "Even" or "Odd" for a given number.  
✅ **Add logic** to detect "High score" only if score > 80 **and** student has bonus points.

---

## **📚 Additional Resources**
- [Java If-Else Statements (Oracle)](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/if.html)
- [Java Switch Case (Oracle)](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/switch.html)
- [Logical Operators in Java (GeeksForGeeks)](https://www.geeksforgeeks.org/java-logical-operators-with-examples/)
- [Ternary Operator in Java (W3Schools)](https://www.w3schools.com/java/java_conditions_shorthand.asp)
- [Video Lesson Recording](_will be added later_)
- [Live Code Exercises](https://github.com/FW-Zalando-Java-Backend-Engineer/Day-07_If_Else/tree/main/Day_7)
- [Lesson Slides: If-Else & Switch Structures](https://github.com/FW-Zalando-Java-Backend-Engineer/Day-07_If_Else/blob/main/Control%20Flow%20Structure-If-else%20and%20switch%20Statement.pdf)

---

🚀 **Great work! You're now thinking like a programmer. Onward to loops and repetition next!** 🔄🎉
