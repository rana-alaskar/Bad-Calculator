
# Bad Calculator – Software Quality Assurance Project

A Java calculator project originally built with intentional bugs and code smells, then refactored and tested as part of an SW340 Software Quality Assurance exercise. The project demonstrates a practical workflow for improving code quality: identifying defects, refactoring, writing automated tests, measuring coverage, and running static analysis.

## Overview

The starting codebase contained deliberately introduced bugs and poor coding practices. The goal was to apply standard software quality assurance techniques to detect and fix these issues, then verify the improvements using automated testing, code coverage reporting, and static code analysis.

## Objectives / What Was Improved

- Identified bugs and code smells in the original implementation
- Refactored `Calculator.java` for correctness, readability, and maintainability
- Added JUnit test cases covering the calculator's core operations
- Measured test coverage using JaCoCo
- Ran static code quality analysis using SonarCloud

## Tech Stack

- **Language:** Java 17+
- **Build tool:** Apache Maven
- **Testing:** JUnit
- **Coverage:** JaCoCo
- **Static analysis:** SonarCloud
- **IDE:** IntelliJ IDEA (recommended)

## Project Structure

```
src/
  main/
    java/
      edu/pnu/badcalc/
        App.java            # Main console application
        Calculator.java     # Calculator logic (refactored)

  test/
    java/
      edu/pnu/badcalc/
        AppTest.java          # Application test
        CalculatorTest.java   # Unit tests for calculator operations

pom.xml
```

## Testing

JUnit tests were written to cover the calculator's core functionality:

- `add()`
- `subtract()`
- `multiply()`
- `divide()`, including the division-by-zero exception case
- `factorial()`
- `parseAndCompute("a op b")` — evaluates simple expressions such as `"3 + 2"`

## Code Coverage & Quality Analysis

- **JaCoCo:** `Calculator.java` reached approximately 100% method coverage after the added test cases, with a significant increase in overall project coverage.
- **SonarCloud:** The refactored code (New Code) passed the Quality Gate with no reported bugs or vulnerabilities. The original, unrefactored portions of the codebase intentionally retain quality issues, as they were preserved to illustrate the contrast between the "before" and "after" states of the assignment.

## How to Run

**Run all tests (JUnit):**
```
mvn test
```

**Generate a JaCoCo coverage report:**
```
mvn verify
```
The report is generated at `target/site/jacoco/index.html`.

**Run the application (IntelliJ):**
Right-click `App.java` and select **Run**.

## Academic Project Note

This project was developed for the SW340 Software Quality Assurance course. It uses an intentionally flawed codebase as a starting point to practice bug detection, refactoring, automated testing, coverage analysis, and static code quality review.
