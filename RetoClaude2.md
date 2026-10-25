# Reto 3: Estadísticas de calificaciones

## Enunciado

Un profesor quiere un resumen rápido de las calificaciones de su grupo. Escribe un programa en Java que lea:

1. La cantidad de alumnos (entero).
2. La calificación de cada alumno (entero entre 0 y 100, una por una).

## Qué debe calcular

- **Promedio** de todas las calificaciones (puede tener decimales).
- **Mayor** calificación.
- **Menor** calificación.
- **Aprobados**: cuántos alumnos tienen calificación de 60 o más.

## Salida

El programa debe imprimir una sola línea con este formato exacto:

`Promedio: P, Mayor: M, Menor: N, Aprobados: A`

El promedio se imprime tal como Java imprime un `double`.

## Ejemplos

| Entrada | Salida |
|---|---|
| `4 80 55 90 70` | `Promedio: 73.75, Mayor: 90, Menor: 55, Aprobados: 3` |
| `3 60 60 60` | `Promedio: 60.0, Mayor: 60, Menor: 60, Aprobados: 3` |
| `5 100 0 50 59 61` | `Promedio: 54.0, Mayor: 100, Menor: 0, Aprobados: 2` |

## Evaluación

- **Porcentaje:** evaluación técnica de tu código.
- **Veredicto:** Pasaste / No pasaste, según si tu código reproduce la entrada y la salida del reto.