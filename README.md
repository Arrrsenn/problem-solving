# Here I will collect my ways of solving task from tests for internship (or work)

## **Task 1: Ksyusha and paint letters**
Ksyusha recently got a job at Tinkoff. As the first task, she was assigned to choose
the colors for the name of the new department. Ksyusha has already decided that she will paint it in two colors - yellow and
black, it remains only to paint.
The name of the department is a string s consisting of several words separated
by spaces. Each word consists of Latin letters, in total there are exactly n of them in the name.
Ksyusha has already come up with what colors she will paint each letter, but she wants the coloring to be
the most beautiful. A word is considered ugly if it has adjacent letters painted in
the same color.
Ksyusha wants to find out how many words in the name of the department will turn out to be ugly if you color them in
accordance with her idea. Please help her count.
### **Input data format**
In the first line, enter the number n (1 <= n <= 100) - the number of letters in the department name.
In the second line, the name itself is entered - the string s (1 <= s <= 100), consisting of Latin letters
and spaces. It is guaranteed that there is no more than one space between any two letters, the string
begins and ends with a letter, and also contains exactly n letters.
In the third line, a string b of length n is entered, consisting of the letters Y and B - Ksyusha's idea of coloring
the name. If bi = Y, then the i-th letter of the name should be painted yellow; if
bi ; = B, then the i-th letter should be painted black.
### **Output data format**
In a single line, print a number - the number of ugly words in the colored department name.
### **Example**
#### **Input**
7

Tinkoff

BYBYBYB
#### **Output**
0

## **Task 2: Mathematical lottery**
For a new marketing campaign, Ksyusha came up with the idea of holding a mathematical lottery. She
guessed a natural number N and printed on the tickets pairs of positive numbers a, b, such that
a - b = n. The lottery winners will be considered the participant who received a ticket with the minimum smallest common multiple (NOC) of the numbers a and B. Ksyusha wants to understand in advance which suitable numbers a and B can be chosen so that their NOC is the minimum possible. Will you help her?
### **Input data format**
In a single line, a natural number n (2 < n < 10^9) is entered - the number n that Ksyusha has guessed
### **Output data format** 
Print two numbers a and b separated by a space - the desired pair with the minimum NOC.
If there are several suitable answers, output any one.
### **Example**
#### **Input**
3
#### **Output**
1 2

## **Task 3: Read command**
The "countSet" var for specifying the initial number of sets

List<Integer> arr - for storing sets
  
The "request" var - number of requests
  
StringBuilder sbr - for storing "YES" and "NO" outputs
  
Command:
0 X - "0" - Сhecks if the set X is in the list
  
1 X - "1" - Increases all values in the list by X
  
2 X - "2" - Adds the value of X to the list, provided that it is missing
  
3 X - "3" - Removes the value of X from the list

### **Output data format** 
When executing the "0" command, you need to output:
  
-if the value of X is in the list - "YES";
  
-if the X value is not in the list - "NO";
### **Example**
#### **Input**
2

2 7

5

0 2

0 7

1 3

0 2

0 7
#### **Output**
YES

YES

NO

NO

## **Task 4:**

### **Input data format**

### **Output data format**
