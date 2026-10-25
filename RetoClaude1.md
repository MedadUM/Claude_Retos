# Reto 1: Descuento por cantidad de productos

## Enunciado

Una tienda aplica un descuento según cuántos productos compra el cliente. Escribe un programa en Java que lea:

1. La cantidad de productos (entero).
2. El precio de cada producto (entero, uno por uno).

## Reglas de descuento (sobre el total de la compra)

| Cantidad de productos | Descuento |
|---|---|
| 1 a 2 | 0% |
| 3 a 5 | 10% |
| 6 o más | 25% |

## Salida

El programa debe imprimir una sola línea con este formato exacto:

`Total: X, Descuento: Y%, A pagar: Z`

- **X**: total sin descuento.
- **Y**: porcentaje de descuento aplicado.
- **Z**: monto que se paga.

## Ejemplos

| Entrada | Salida |
|---|---|
| `3 100 200 300` | `Total: 600, Descuento: 10%, A pagar: 540.0` |
| `2 50 70` | `Total: 120, Descuento: 0%, A pagar: 120.0` |
| `6 10 10 10 10 10 10` | `Total: 60, Descuento: 25%, A pagar: 45.0` |

## Evaluación

- **Porcentaje:** evaluación técnica de tu código.
- **Veredicto:** Pasaste / No pasaste, según si tu código reproduce la entrada y la salida del reto.