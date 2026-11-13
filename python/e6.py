'''
6. Validação de Número Primo 
Escreva uma função que verifique se um número inteiro positivo é primo 
(divisível apenas por 1 e por ele mesmo). 
Retorne True ou False
'''

def main():
    print(is_prime(2))
    print(is_prime(3))
    print(is_prime(4))
    print(is_prime(5))
    print(is_prime(6))


def is_prime(n):
    # less then 1 is note prime
    if n <= 1:
        return False
    # 2 is prime
    if n ==2:
        return True
    # even numbers, except for 2, is not prime
    if n%2 == 0:
        return False
    # testing odd numbers until n
    for i in range(3, n,2):
        if n%i == 0:
            return False
    # if not return false on for loop, it means it is prime
    return True


if __name__ == "__main__":
    main()