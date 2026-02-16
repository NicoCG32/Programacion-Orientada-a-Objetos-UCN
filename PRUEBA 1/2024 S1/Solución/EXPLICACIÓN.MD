# Explicación detallada - Programación Orientada a Objetos

## Objetivo

Resolver el ruteo del Problema 1 y documentar la solución del Problema 2 (Mapaches Celulares).

## Ejercicio 1: Ruteo

### Modelo y reglas

- `Velero` modela una embarcación con nombre, codigo, costo acumulado y una tarifa estatica de membresia.
- `ClubDeYates` mantiene dos arreglos: `puerto` (ataque) y `bahia` (zarpe), ambos de tamaño 5.
- `atacar(v, dias)` agrega el velero al puerto (si no estaba) y acumula el costo: costo actual + (membresia * dias).
- `zarpar(v)` mueve el velero a bahia (si hay espacio) y lo elimina del puerto.
- `costoMembresia` es `static`, por lo que aplica a todos los veleros.

### Ruteo paso a paso (resumen)

1) Se crean 4 veleros y se fija `costoMembresia = 20000`.
2) `v1` entra a puerto 12 dias (240000).
3) `v2` zarpa a bahia.
4) `v3` entra a puerto 5 dias (100000) y luego zarpa.
5) `v4` entra a puerto 8 dias (160000).
6) Se actualiza la membresia a 30000.
7) `v4` acumula 12 dias mas (520000 total).
8) `v3` entra a puerto 15 dias (550000 total).
9) `v2` entra a puerto 10 dias (300000), zarpa y vuelve a entrar 5 dias (450000 total).
10) `v1` zarpa a bahia.

### Estado final

- Bahia: `Vagabundo 1`, luego 4 posiciones `null`.
- Puerto: `Vagabundo 2`, `Pirata Granate`, `El Ucenino`, con sus costos, y un `null`.

### Salida esperada

```
Zarpe
Vagabundo 1,null,null,null,null,
Ataque
null,Vagabundo 2: 520000,Pirata Granate: 550000,El Ucenino: 450000,null,
```

## Ejercicio 2: Mapaches Celulares

### Modelo de clases

- `Mapache`: identidad (rut, nombre), masa y posicion en el tablero.
- `Mapa`: tablero `Mapache[][]`, lista de mapaches y contador de vivos.
- `Main`: carga los archivos, construye el tablero y ejecuta el menu.

### Carga de datos

1) `mapaches_posiciones.txt` contiene el orden del tablero y la matriz de ruts por celda.
2) `mapaches.txt` contiene la cantidad de mapaches y luego cada mapache con su rut, nombre y masa.
3) Se crea la matriz de enteros, luego los mapaches, y finalmente se construye el tablero con sus posiciones.

### Reglas del juego

- El tablero se imprime con `_` para celdas vacias.
- En cada turno se permite: mover, alimentar, ver informacion o rendirse.
- Un movimiento fuera del tablero se rechaza.
- Si un mapache entra en una celda ocupada, se compara la masa y gana el de mayor masa.
- Alimentar aumenta la masa en 10%.
- El juego termina cuando queda un solo mapache o un jugador se rinde.

### Formato de salida

El programa sigue el formato de los ejemplos:

- Muestra el tablero antes de cada turno.
- Pregunta la accion con el menu numerado.
- Informa batallas como `Compiten A/NOMBRE con B/NOMBRE: gana NOMBRE`.
- La informacion del mapache se imprime en dos lineas.

## Manejo de errores

- Se captura `IllegalArgumentException` al convertir entradas invalidas.
- Se controla `NullPointerException` cuando el rut no existe.
- Si la direccion no es valida, se informa y no se realiza el movimiento.

## Observaciones

- Los archivos de entrada deben estar en la ruta definida en `Main.java`.
- El formato de salida esta ajustado a los ejemplos entregados en la prueba.
