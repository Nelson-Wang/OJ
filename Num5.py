'''
题目详情 提交记录 讨论 代码检视 官方解答
题目描述
编写程序实现将任意10进制正小数m转换成n进制的正小数，小数点后保留10位小数。

解答要求
时间限制：1000ms, 内存限制：64MB
输入
输入包含两个数m,n，用空格隔开。输入包含多组测试，当m,n都为0时输入结束。

Limits:

0.0000009<m<1
1<n<10
输出
输出10进制正小数m的n进制小数。结果保留10位小数。

样例
输入样例 1 复制

0.795 3
0 0
输出样例 1

0.2101101122
'''
while True:
    nums = input().strip().split()
    m = float(nums[0])
    n = int(nums[1])
    if m == 0 and n == 0:
        break
    res = []
    product = 1.0
    while product != 0 and len(res) < 10:
        product = m * n
        tmp = int(product)
        res.append(tmp)
        product -= tmp
        m = product

    out = "0."
    for i in res:
        out = out + str(i)
    print(out)
