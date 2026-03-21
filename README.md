# Barbershop Thread Simulation

A Java multithreading simulation of the classic Sleeping Barber problem using threads, semaphores, and synchronized resources.

## Overview
Simulates a barbershop with a barber and multiple customer threads. Demonstrates concurrency patterns for managing shared waiting room capacity and thread coordination.

## Features
- Barber thread sleeping when no customers
- Customer threads arriving at random intervals
- Waiting room with fixed capacity (semaphore-controlled)
- Customers leave if waiting room is full
- Console output tracing thread interactions

## Technologies Used
- **Language:** Java (JDK 8+)
- **Concepts:** Threads, Semaphores, synchronized blocks

## Project Structure
```
src/
+-- BarbershopTest.java    # Barber, Customer, and WaitingRoom simulation
```

## Usage
```bash
javac src/*.java -d out/
java -cp out/ BarbershopTest
```

## Author
Kandy Kochar
