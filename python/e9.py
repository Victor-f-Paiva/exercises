'''
9. Remover Duplicatas de uma Lista 
Dada uma lista de elementos, crie uma função que retorne uma nova lista 
contendo apenas os elementos únicos, 
preservando a ordem original ou utilizando estruturas eficientes
'''

import random

# creating a random list with 10 nums
duplicated_list = [int(random.randint(1,9)) for _ in range(10)]
ex_list = [1, 2, 2, 3, 4, 4, 1]

def main():
    print('1st list = ', duplicated_list)
    print('2nd list = ', ex_list, '\n')
    print(get_set(duplicated_list))
    print(get_set(ex_list))



def get_set(list):
    new_list = []

    for n in list:
        if n not in new_list:
            new_list.append(n)
    return new_list


if __name__ == "__main__":
    main()