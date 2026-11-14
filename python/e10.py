'''
10. FizzBuzz Clássico 
Escreva um programa que imprima os números de 1 a 20. 
Mas para múltiplos de 3 imprima "Fizz" em vez do número, 
para múltiplos de 5 imprima "Buzz", 
e para múltiplos de ambos (3 e 5) imprima "FizzBuzz"
'''

def main():
    original_list = [i+1 for i in range(20)]
    print(*original_list, '\n')
    print(fizzbuzz(original_list))


def fizzbuzz(list):
    fb_list = []

    for num in list:
        if num%3 == 0 and num%5 == 0:
            fb_list.append('FizzBuzz')
        elif num%3 ==0:
            fb_list.append('Fizz')
        elif num%5 == 0:
            fb_list.append('Buzz')
        else:
            fb_list.append(num)
    return fb_list
        



if __name__ == "__main__":
    main()