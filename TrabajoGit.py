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

        totalHoras = valorHora * numeroHoras
        neto = totalHoras + Horas_extras
        semana = valorHora * 47

        print(f'El nombre del empleado es: {nombre}')
        print(f'El valor de la hora es: {valorHora}')
        print(f'El nuemro de las horas trabajadas son: {numeroHoras}')
        print(f'El Valor de las (47) horas semanales : {semana}')
        print(f'Las horas extras trabajadas son : {extras}')
        print(f'El Valor de las horas extras son : {Horas_extras}')
        print(f'El valor de las horas trabajadas es de : {totalHoras}')
        print(f'El neto es de: {neto}')


if __name__ == '__main__':
    git()