'''
2. Inverter uma String 
 Crie uma função que receba uma string e retorne essa string invertida, sem 
usar funções prontas de inversão direta como [::-1] se o entrevistador pedir a lógica 
pura, mas em Python o slicing é aceito se bem fundamentado. Vamos usar a 
abordagem algorítmica para demonstrar lógica
'''

def invert_string(txt):
    # variable that will contain the inverted string
    inverted =''

    #for loop to invert the string by adding the last letter contained in 'txt' variable
    for i in range(len(txt)):
        inverted += txt[len(txt)-(i+1)]

    return inverted


if __name__ == "__main__":
    print(invert_string('victor'))
    print(invert_string('arriz'))
    print(invert_string('grana'))