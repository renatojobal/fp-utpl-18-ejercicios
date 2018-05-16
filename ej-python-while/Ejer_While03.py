# Ejercicio Final
print("******Ejercicio con ciclo while******")
contador = 1
limite = 3.0 # Al poner 3.0 se lo declara como valor tipo float para poder operar con el más adelante
cadena = "%s\t\t%s\t%s\t%s\t%s\n" % ("Nombres", "Nota1", "Nota2", "Nota3", "Promedio")
while contador<=limite:
    print("\n") # Se imprime un salto de linea
    nombre = str(input("Ingrese el nombre del estudiante: "))
    nota1 = float(input("Ingrese la calificacion 1: "))
    nota2 = float(input("Ingrese la calificacion 2: "))
    nota3 = float(input("Ingrese la calificacion 3: "))
    suma = nota1 + nota2 + nota3
    promedio = suma/limite
    cadena = "%s%s\t\t%.2f\t%.2f\t%.2f\t%.2f\n" % (cadena, nombre, float(nota1), float(nota2), float(nota3), float(promedio))
    
    contador = contador + 1 # incremento contador
print("\n")
print(cadena)