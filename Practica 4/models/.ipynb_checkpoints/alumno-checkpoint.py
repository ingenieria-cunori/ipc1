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
        
