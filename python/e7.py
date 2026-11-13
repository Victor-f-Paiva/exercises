'''
7. Sequência de Fibonacci 
Crie uma função que gere os primeiros $n$ termos da sequência de Fibonacci 
(onde cada número é a soma dos dois anteriores: 0, 1, 1, 2, 3, 5...). 
'''
def main():
    print(fibo(2))
    print(fibo(3))
    print(fibo(5))
    print(fibo(7))
    print(fibo(9))


def fibo(n):
    fibo_list = []

    for i in range(n):
        if i == 0:
            fibo_list.append(0)
        elif i == 1:
            fibo_list.append(1)
        # starting at 3rd number, the algorithm sum the last two items of the list
        else:
            fibo_list.append(fibo_list[-2] + fibo_list[-1])
    return fibo_list


if __name__ == "__main__":
    main()