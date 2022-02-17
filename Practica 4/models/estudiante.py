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
            
