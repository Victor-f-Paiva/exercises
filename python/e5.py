'''
5. Maior Elemento de uma Lista 
Enunciado: Dado um array (lista) de números inteiros, 
escreva uma função que retorne o maior valor presente na lista, 
sem utilizar a função nativa max()
'''

array = [3, 5, 2, 9, 1]
array2 = [3, 5, 2, 9, 1, 11]
array3 = [3, 5, 2, 13,  9, 1]
array4 = [15, 3, 5, 2, 9, 1]

def main():
    print(get_bigger(array))
    print(get_bigger(array2))
    print(get_bigger(array3))
    print(get_bigger(array4))


def get_bigger(list):
    bigger = list[0]

    # for loop to discover the bigger number
    for n in list:
        if n > bigger:
            bigger = n
    return bigger


if __name__ == "__main__":
    main()