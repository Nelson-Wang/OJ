'''
题目描述
solo发现他参加Online Judge的比赛表现很不稳定，于是他翻开历史记录，发现他在每一轮的比赛中他的排名R都能整除参赛人数N(包括solo)，于是他每次参赛都会先预测他的排名情况，以给自己更大的自信。

解答要求
时间限制：15000ms, 内存限制：64MB
输入
输入只有一个整数N(0<N<109)，代表参赛人数。

输出
在一行输出solo参赛可能的获得的排名数S以及由小到大输出各个排名Ri (0<i ≤ S)，用空格隔开。

样例
输入样例 1 复制

10
输出样例 1

4 1 2 5 10
'''

while True:
    try:
        num = input().strip()
        n = int(num)
        r = 1
        res = []
        while r <= n ** 0.5:
            if n % r == 0:
                res.append(r)
                if n / r <= n and n / r != r:
                    res.append(int(n / r))
            r += 1
        res.sort()
        print("{0}".format(len(res)), end="")
        for i in res:
            print(" {0}".format(i), end="")
        print()
    except:
        break
