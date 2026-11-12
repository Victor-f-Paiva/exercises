#Escreva uma função que receba um número inteiro e retorne se ele é "Par" ou "Ímpar". 

def odd_or_even(n):
    if (n%2 == 0):
        print("even")
    else:
        print("odd")

if __name__ == "__main__":
    odd_or_even(2)
    odd_or_even(3)
    odd_or_even(4)
    odd_or_even(7)
