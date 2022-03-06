'''
__init__() -> constructor
self       -> permite al usuario especificar y acceder a los atributos y métodos
'''

class Alumno:   
    
    def __init__(self, carne, nombre, carrera):
        self.carne = carne
        self.nombre = nombre
        self.carrera = carrera
    
    def toString(self):
        print(f"carne: {self.carne}, nombre: {self.nombre}, carrera: {self.carrera}")

#-----------------------------------------------------------------------
        
class Perro:   
    raza = 'Chihuahua'
    
    def __init__(self, nombre):
        self.nombre = nombre
        
    def toString(self):
        print(f"{self.nombre} raza: {self.raza}")

#-----------------------------------------------------------------------

class Estudiante:
    cursos = {}
    
    def __init__(self, carne, nombre, carrera, curso):
        self.carne = carne
        self.nombre = nombre
        self.carrera = carrera
        self.cursos = curso
        
    def toString(self):
        print(f"Carné: {self.carne}, Nombre: {self.nombre}, Carrera: {self.carrera}, Cursos: {self.cursos}")
        
    def addCurso(self, cursos):
        if len(cursos) > 0:
            for c in cursos:
                self.cursos[c] = cursos[c]
                
#-----------------------------------------------------------------------

#from models.alumno import Alumno
           
x = Alumno(23659878,'José','Ingeniería')
x.toString()

#from models.perro import Perro

obj1 = Perro('Firulais')
obj2 = Perro('Rambo')

obj1.toString()
obj2.toString()

#from models.estudiante import Estudiante

estudiantes = []

e = Estudiante(2022046574, 'Juan Pérez', 'Ingeniería', {90 : 'Progra 1', 92 : 'Progra 2'})
e.toString()

estudiantes.append(e)

for e in estudiantes:
    print(e.toString())
    
j = Estudiante(2021456723, 'María López', 'Ingeniería Civil', {})
estudiantes.append(j)


for e in estudiantes:
    print(e.toString())
    

dic = {990:'XXX. II' ,791: 'Int. Progra. I'}
for d in dic:
    print(dic[d])
    

for e in estudiantes:
    if e.carne == 2021456723:
        e.addCurso(dic)
        

for e in estudiantes:
    print(e.toString())

