# Java Multiplication Quiz

A console-based multiplication practice program. The repository contains several iterations of the quiz, showing how the program develops from a basic question-and-answer loop into versions with varied feedback and score tracking.

## Project structure

```text
multiplication-quiz-java/
├── src/
│   ├── App.java
│   ├── MultiplyTest.java
│   ├── MultiplyTest_1.java
│   ├── MultiplyTest_2.java
│   └── MultiplyTest_3.java
├── .gitignore
├── Makefile
└── README.md
```

## Versions included

| Class | Description based on the submitted source |
|---|---|
| `MultiplyTest_1` | Generates random multiplication questions, checks answers, and gives a basic correct/incorrect response. |
| `MultiplyTest_2` | Adds randomized variations of positive and retry feedback messages. |
| `MultiplyTest_3` | Adds a 10-question round, correct/incorrect counters, score calculation, and an instructor-help message for scores below 75. |
| `App` | Launcher that creates `MultiplyTest_2` and starts its `quiz()` method. |
| `MultiplyTest` | An additional launcher that also creates `MultiplyTest_2`. |

`App` and `MultiplyTest` are alternative entry points for the same `MultiplyTest_2` quiz. The numbered classes are separate versions and are retained as submitted.

## Requirements

- Java Development Kit (JDK) 8 or later
- Terminal / command prompt

Check Java is installed:

```bash
java -version
javac -version
```

## Compile

From the project root:

```bash
make
```

Or compile manually:

```bash
javac -d build src/*.java
```

## Run

Run the default launcher (`App`, which starts `MultiplyTest_2`):

```bash
make run
```

Run a particular version directly:

```bash
java -cp build MultiplyTest_1
java -cp build MultiplyTest_2
java -cp build MultiplyTest_3
```

Alternative launcher:

```bash
java -cp build MultiplyTest
```

## How the quiz works

- The program generates two random digits from 0 through 9.
- It displays a multiplication question.
- The user enters an answer.
- The program checks the answer and responds.
- In versions 1 and 2, entering `-1` at the main answer prompt exits the quiz.
- Version 3 groups questions into rounds of up to 10 and calculates a score from the number of correct answers.

## Notes and known limitations

- The original source files have been retained rather than rewritten.
- `App.java` and `MultiplyTest.java` both launch `MultiplyTest_2`; they are redundant entry points, but both are included to preserve the submitted work.
- `MultiplyTest_3` has different input-flow logic from versions 1 and 2. Its retry loop does not consistently handle `-1` as an exit command while waiting for a correct answer. Test this behavior before presenting it as a finished feature.
- The score calculation in version 3 is based on the number of correct answers out of 10; the source does not enforce a full 10 answered questions if the user exits early.
- This is an educational console project, not a production-grade assessment system.

## Clean compiled classes

```bash
make clean
```
