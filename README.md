# Guessing_Number_Game

## The rules of the game:
1. If the guessed number is bigger than the actual number, the program will respond with the message that the guessed number is higher than the actual number.
2. If the guessed number is smaller than the actual number, the program will respond with the message that the guessed number is lower than the actual number.
3. If the guessed number is equal to the actual number or if the **K** trials are exhausted, the program will end with a suitable message.

## Approach:
1. The approach is to generate a random number using `Math.random()` method in Java.
2. Now using a loop, take **K** input from the user and for each input print whether the number is smaller or larger than the actual number.
3. If within **K** trials the user guessed the number correctly, print that the user won.
4. Else print that he was not able to guess and then print the actual number.
