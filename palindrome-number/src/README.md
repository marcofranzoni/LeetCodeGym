# Palindrome Number

Given an integer x, return true if x is a palindrome, and false otherwise.

## Follow up
Could you solve it without converting the integer to a string?

# My Notes

My initial solution simply loops comparing the first and the last number of the input.
If they're equals the process continue with the second element and the penultimate, etc.
When the loop reaches the index length/2, it means that the number is palindrome.

### E.g.
- 12321
- Length = 5
- index = 2 (number 3) -> exit the loop

The final solution doesn't use the int to String conversion anymore.
It uses just simple math operator to extract the last digit of the input using the modulo operator
and shift the input until great than zero. Doing so it's possible to read the number from the end to the beginning
and compare it with the original input.