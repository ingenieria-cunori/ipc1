def saludar():
    print ("Hola desde una función")
    
saludar()

def sumar(num1, num2):
    print (num1 + num2)

sumar(4,5)

# valor por defecto quiere decir que cuando NO se le envie ese parámetro a la 
# función, por defecto tomará el valor de asignado
def sumar(num1, num2 = 10):
    print (num1 + num2)
    
sumar(20,50)
sumar(90)

## Definiendo el orden de asignación de parámetros
def sumar(number1, number2=20):
    print (number1)
    print (number2)
    print (number1 + number2)

sumar(number2=10, number1=15)

## Listas como parámetros
def sumar(numeros):
    r = 0
    for n in numeros:
        r+=n
    print (r)
    
sumar([0,1,2,3,4,5,6,7,8,9])



# UTILIDAD DEL * 
# Recepción de múchos parámetros
# *p = 0 o más parámetros
# p, *ps
# p1, p2, p3, ps*

# NO VÁLIDO
# *ps, *ps2

# VÁLIDO
# def funcion(*ps, p1=0).
# def funcion(p1, *ps, p2=0, p3=0).
# def funcion(p1, *ps, p2, p3=0). 
# En este caso es obligatorio indicar el parámetro p2 con su nombre al 
# invocar a la función de esta manera, por ejemplo: funcion(0, 1, 2, 3, p2=4).
def saludar(*nombre):
    print (type(nombre))
    print (nombre)
    for n in nombre:
        print (f"Hola, {n}")

saludar("A","B","C","D")


# Replicar cadenas de texto , listas o tuplas
print ('texto ' * 5)
print ([1,2,3] * 5)
print (('a','b','c') * 5)


# Doble asterisco
# El asterisco doble ** en Python se utiliza para calcular potencias (2 ** 3), 
print (2**3)


# aceptar múltiples parámetros con nombre en funciones (def f(**args)),
def saludar(**nombres):
    print(nombres)
    for parametro in nombres:
        print(f'¡Hola, {nombres[parametro]}!')
        
saludar(nombre1='Juan', nombre2='Laura', nombre3='Lucía')


# desempaquetar diccionarios en otros diccionarios (diccionario = {**d1, **d2}).
meses1 = {'01':'Enero', '02':'Febrero', '03':'Marzo'}
meses2 = {'04':'Abril', '05':'Mayo'}
meses = {**meses1, **meses2}
print(meses)


# write Fibonacci series up to n
def fib(n):
    a, b = 0, 1
    while a < n:
        print(a, end=' ')
        a, b = b, a+b
    print()
    
    
fib(15)

# write Fibonacci series up to n
def fib2(n):
    r = []
    a, b = 0, 1
    while a < n:
        r.append(a)        
        a, b = b, a+b
    return r
    

print (fib2(10))


def ask_ok(prompt, retries=4, reminder='Please try again!'):
    while True:
        ok = input(prompt)
        if ok in ('y', 'ye', 'yes'):
            return True
        if ok in ('n', 'no', 'nop', 'nope'):
            return False
        retries = retries - 1
        if retries < 0:
            raise ValueError('invalid user response')
        print(reminder)
        
# FUNCIONES DEFINIDAS

l = [1,2,3,4]
t = (6,7,8,9)
s = set([1,1,2,2,4,4])
fs = frozenset([5,5,6,6,7,7])
d = ({1:'a', 2:'b'})

print (max(l))
print (max(t))
print (max(s))
print (max(fs))
print (max(d))

'''
INVALID
max(2, 'a')
max([1, 2, 3, 'a'])
max([])
'''

# l = [1,2,3,4]
# t = (6,7,8,9)
# s = set([1,1,2,2,4,4])
# fs = frozenset([5,5,6,6,7,7])
# d = ({1:'a', 2:'b'})
print (min(l))
print (min(t))
print (min(s))
print (min(fs))
print (min(d))

print (divmod(7,5))
print (type(divmod(7,5)))


print(hex(9))
print(hex(12))

# l = [1,2,3,4]
# t = (6,7,8,9)
# s = set([1,1,2,2,4,4])
# fs = frozenset([5,5,6,6,7,7])
# d = ({1:'a', 2:'b'})
print (len(l))
print (len(t))
print (len(s))
print (len(fs))
print (len(d))

# RECURSIVIDAD

'''
Recursión o recursividad es la forma en la cual se especifica un proceso 
basado en su propia definición
https://es.wikipedia.org/wiki/Recursi%C3%B3n

Evaluar la PRECONDICIÓN
PRECONDICIÓN -> CASO BASE
'''
def potencia(b,n):
    """ Precondición: n debe ser mayor o igual que cero.
        Devuelve: b\^n. """
    # Caso base
    if n <= 0:
        return 1
    # n par
    if n % 2 == 0:
        pot = potencia(b, n/2)
        return pot * pot
    # n impar
    else:
        pot = potencia(b, (n-1)/2)
        return pot * pot * b
'''
potencia(2,10)
    pot = potencia(2,5)               # b → 2 n → 10
        pot = potencia(2,2)           # b → 2 n → 5
            pot = potencia(2,1)       # b → 2 n → 2
                pot = potencia(2,0)   # b → 2 n → 1
                    return 1          # b → 2 n → 0
                return 1 * 1 * 2      # b → 2 n → 1 pot → 1
            return 2 * 2              # b → 2 n → 2 pot → 2
        return 4 * 4 * 2              # b → 2 n → 5 pot → 4
    return 32 * 32                    # b → 2 n → 10 pot → 32
'''
print (potencia(2,4))

#Esto no es recursivo
libros = [50, 100, 75, 100, 200]
total = 0
for libro in libros:
    total+=libro
print(total)

def totalPaginas(libros):
    if len(libros) == 1:
        return libros[0]
    return libros[0] + totalPaginas(libros[1:])

print (totalPaginas([10,20,20,50]))

def cuenta_regresiva(numero):
    numero -= 1
    if numero > 0:
        print (numero)
        cuenta_regresiva(numero)
    else:
        print ("Boooooooom!")
        print ("Fin de la función", numero)
        
cuenta_regresiva(10)


def factorial(numero):
    print ("Valor inicial ->",numero)
    if numero > 1:
        numero = numero * factorial(numero -1)
    print ("valor final ->",numero)
    return numero
    
print (factorial(5))    





