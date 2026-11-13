'''
4. Fatorial de um Número 
 Implemente uma função que calcule o fatorial de um número inteiro não negativo $n$. 
 (O fatorial de $n$ é o produto de todos os inteiros positivos menores ou 
iguais a $n$). 
'''

#main function
def main():
    print(factorial(3))
    print(factorial(5))
    print(factorial(7))
    print(factorial(-3))
    print(factorial('a'))

# def that calculates the factorial of a number n
def factorial(n):
    # exception handling
    try:
        n = int(n)
    except (TypeError, ValueError):
        return f'{n} is not a number'

    if n <= 0:
        return f'{n} is not a positive number'
    
    # product from n to 1
    result = 1
    for i in range(n):
        result *= i+1
    return result


if __name__ == "__main__":
    main()