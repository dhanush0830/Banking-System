# Banking System Application

A simple Java Banking System project using JDBC and SQLite database.

This project performs basic banking operations such as:

- Create Account
- Deposit Money
- Withdraw Money
- Check Balance
- View All Accounts

---

# Technologies Used

- Java
- JDBC
- SQLite
- Eclipse IDE

---

# Features

## 1. Add Account

Creates a new bank account.

Example:

```text
AccNo   : 101
Name    : Dhanush
Balance : 5000
```

---

## 2. Deposit Money

Adds money to existing account balance.

---

## 3. Withdraw Money

Withdraws money from account balance.

---

## 4. Check Balance

Displays account balance using account number.

---

## 5. View All Accounts

Displays all customer account details stored in database.

---

# Project Structure

```text
BankingSystem.app
│
├── Main.java
├── Banking.java
└── Bankingconnection.java
```

---

# Database Used

SQLite Database

Database file:

```text
bank.db
```

Database connection:

```java
jdbc:sqlite:C:/Users/Dinesh/bank.db
```

---

# Table Structure

```sql
CREATE TABLE bank(
    accno INTEGER PRIMARY KEY,
    name TEXT,
    balance INTEGER
);
```

---

# JDBC Concepts Used

- DriverManager
- Connection
- Statement
- PreparedStatement
- ResultSet

---

# PreparedStatement Example

```java
String query = "UPDATE bank SET balance = balance + ? WHERE accno = ?";
PreparedStatement ps = conn.prepareStatement(query);
```

PreparedStatement is used to:
- improve security
- avoid SQL Injection
- handle dynamic values

---

# How to Run

## Step 1

Clone repository

```bash
git clone https://github.com/your-username/banking-system.git
```

---

## Step 2

Open project in Eclipse IDE.

---

## Step 3

Add SQLite JDBC Driver.

Download:
https://github.com/xerial/sqlite-jdbc

---

## Step 4

Configure database path inside:

```java
Bankingconnection.java
```

---

## Step 5

Run:

```text
Main.java
```

---

# Menu

```text
1.Add Account
2.Deposit
3.Withdraw
4.Check Balance
5.View All Accounts
6.Exit
```

---

# Sample Output

```text
1.Add Account
2.Deposit
3.Withdraw
4.Check Balance
5.View All Accounts
6.Exit

Enter Accno:
101

Enter Name:
Dhanush

Enter Balance:
5000

Account Created Successfully...
```

---

# Example Account View

```text
AccNo: 101, Name: Dhanush, Balance: 5000
AccNo: 102, Name: Kiran, Balance: 7000
```

---

# Concepts Covered

- Core Java
- OOP
- JDBC
- SQLite Database
- CRUD Operations
- Menu Driven Programs
- Exception Handling

---

# Author

Dhanush R
