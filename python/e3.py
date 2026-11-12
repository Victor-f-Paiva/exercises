'''
3. Verificar Palíndromo 
Um palíndromo é uma palavra que se lê da mesma forma de trás para 
frente (ex: "arara", "osso"). Escreva uma função que retorne True se a palavra for um 
palíndromo e False caso contrário
'''

from e2 import invert_string

def palindrome(word):
    word = word.lower()
    if (word == invert_string(word)):
        return True
    else:
        return False



if __name__ == "__main__":
    print(palindrome('Arara'))
    print(palindrome('oSso'))
    print(palindrome('gaivota'))
    print(palindrome('arrow'))