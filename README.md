## Make Change Project

### Week 2 Homework for Skill Distillery

#### Overview

* This is a change machine simulation.

This program begins by prompting the user for a total amount (implied sale amount) and then prompts for an amount tendered by the cashier/machine. The program will then take the difference between the sale amount and the amount tendered and then calculate the correct currency combination of the change due.

#### Concepts

* do while Loops
* iterating for Loops
* arrays
* float point integer math

##### do-while Loops

The do-while loop is similar to the while loop, except the condition is placed after the loop body.

do {
  loop body
} while (condition);

The condition is checked at the end of each execution of the loop body; it determines if the loop body should execute again.
* This means that a do-while loop body will always execute at least once.

Notable do-while differences:
* do-while must have a semicolon at the end.
* do-while will execute at least once.

int num = 999;
do {
  System.out.println("num is " + num); //will execute even though num is not 0
} while (num == 0);



#### Technologies Used

* Java
* Spotify
* Eclipse IDE
* Atom
* Shell

#### Lessons Learned

Floating point integer math can result in small enough decimal errors that iterating using a floating point integer to check against can cause some errors. In this program, there was a problem in checking for the last penny due in the change after the final iteration because the calculation had left a change due of less than $0.01 somewhere in the 3rd decimal place and so it needed a final nested if statement to check for that "less than $0.01" last penny.
