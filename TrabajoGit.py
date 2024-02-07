def git():
    nombre = input("Escriba su nombre completo: ")
    salario = 0
    valorHora = int(input("Ingresa el valor de la hora: "))
    numeroHoras = int(input("Ingrese el numero de horas trabajadas: "))
    extras = 0

    if (numeroHoras >= 47):
        extras = numeroHoras - 47

    if (numeroHoras >= 47):
        porcentaje = valorHora * 0.35
        Valor_extras = porcentaje + valorHora
        Horas_extras = extras * Valor_extras

if __name__ == '__main__':
    git()