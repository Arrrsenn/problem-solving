#Here I will collect solutions to problems from tests for an internship (or work)#

##**Task 1: Ksyusha and letter coloring**

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

###**Input data format**
In the first line, enter the number n (1 <= n <= 100) - the number of letters in the department name.
In the second line, the name itself is entered - the string s (1 <= s <= 100), consisting of Latin letters
and spaces. It is guaranteed that there is no more than one space between any two letters, the string
begins and ends with a letter, and also contains exactly n letters.
In the third line, a string b of length n is entered, consisting of the letters Y and B - Ksyusha's idea of coloring
the name. If bi = Y, then the i-th letter of the name should be painted yellow; if
bi ; = B, then the i-th letter should be painted black.
###**Output data format**
In a single line, print a number - the number of ugly words in the colored department name.
