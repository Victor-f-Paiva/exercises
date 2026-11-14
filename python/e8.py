'''
8. Contador de Vogais 
Escreva uma função que conte o número de vogais (a, e, i, o, u) em uma string fornecida
'''
def main():
    print(count_vowel('Victor'))
    print(count_vowel('Paiva'))
    print(count_vowel('Banana'))
    print(count_vowel('PIKACHU'))
    print(count_vowel('spider man'))
    print(count_vowel('excelsior'))
    print(count_vowel('Engenharia de Software'))


def count_vowel(txt):
    # handling with the string
    txt = txt.lower()

    counter = 0
    for letter in txt:
        if (letter == 'a' or
            letter == 'e' or
            letter == 'i' or 
            letter == 'o' or 
            letter == 'u') :
            counter += 1
    return counter


if __name__ == "__main__":
    main()