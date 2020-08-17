'''
2005年的百度之星初赛有这么一道题，一个正整数有可能可以被表示为 m(m>1) 个连续正整数之和，如：

15=1+2+3+4+5
15=4+5+6
15=7+8
但现在你的任务是判断给定的整数n能否表示成连续的m(m>1)个正整数之和。

解答要求
时间限制：1000ms, 内存限制：64MB
输入
输入只有一个整数n (1<n<230 +1)。

输出
若n能表示成连续的m(m>1)个正整数之和则输出“YES”，否则输出“NO”。

样例
输入样例 1 复制

15
输出样例 1

YES
'''

import math
while True:
    try:
        target = int(input())
        end = "NO"
        if target % 2 == 1:
            end = "YES"
        else:
            for i in range(2, math.ceil(math.sqrt(target))):
                if target % i == 0:
                    if i % 2 == 1:
                        end = "YES"
                        break
                    if i % 2 == 0 and (target / i) % 2 == 1:
                        end = "YES"
                        break
        print(end)
    except:
        break
