'''
题目描述
solo从小就对英文字母非常感兴趣，尤其是元音字母(a,e,i,o,u,A,E,I,O,U)，他在写日记的时候都会把元音字母写成大写的，辅音字母则都写成小写，虽然别人看起来很别扭，但是solo却非常熟练。你试试把一个句子翻译成solo写日记的习惯吧。

解答要求
时间限制：1000ms, 内存限制：64MB
输入
输入一个字符串S(长度不超过100，只包含大小写的英文字母和空格)。

输出
按照solo写日记的习惯输出翻译后的字符串S。

样例
输入样例 1 复制

Who Love Solo
输出样例 1

whO lOvE sOlO
'''

while True:
    try:
        targetStr = input().lower()
        chars = list(targetStr)

        for i in range(len(chars)):
            if chars[i] == 'a' or chars[i] == 'e' or chars[i] == 'i' or chars[i] == 'o'or chars[i] == 'u':
                chars[i] = chr(ord(chars[i]) -32)
        resStr = "".join(chars)
        print(resStr)
    except:
        break
