# Challenge Lucas

A small Kotlin/JVM project that models a golf match and verifies the behavior with unit tests.

## Project Structure

```text
src/main/kotlin/GolfMatch.kt       App code
src/test/kotlin/GolfMatchTest.kt   Test code
```

The project uses Gradle with the Kotlin JVM plugin and `kotlin.test` running on JUnit Platform.

## Requirements

- JDK 25 or newer
- Gradle wrapper included in this repository

On this machine, OpenJDK is installed through Homebrew at:

```bash
/opt/homebrew/opt/openjdk
```

## Run Tests

```bash
JAVA_HOME=/opt/homebrew/opt/openjdk ./gradlew test
```

If Java is already configured in your shell, this is enough:

```bash
./gradlew test
```

## Golf Match Rules

- A player scores by calling `playHole("P1")` or `playHole("P2")`.
- The first player to reach at least 4 points and lead by 2 wins.
- Once there is a winner, later holes do not change the score.
