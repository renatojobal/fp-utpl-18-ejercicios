

"""
    Ingreso de datos en Python
    Tomado de: https://pyformat.info/
"""


print("Estamos relizando una prueba para el ciclo while")

# Comentarios de una línea

continuar = True

cadena = "%s\t%s\t%s\n" % ("Nombres", "Apellidos", "Edad")
while continuar:
    nombre = input("Ingrese su nombre: \n")
    apellido = input("Ingrese su apellido: \n")
    edad = input("Ingrese su edad: \n")
    cadena = "%s%s\t%s\t\t%d\n" % (cadena, nombre, apellido, int(edad))
    

    continuar = str(input("¿DESEA CONTINUAR? Si --> '1'  No --> '2' "))
    if continuar == "1":
    	continuar = True
    else:
    	continuar = False

print(cadena)
