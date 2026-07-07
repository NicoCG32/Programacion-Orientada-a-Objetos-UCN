# Explicación Detallada - Prueba 2, 2025 S1

## Objetivo

La prueba evalúa dos dimensiones centrales de Programación Orientada a Objetos:

1. Comprender el comportamiento de una aplicación Swing mediante ruteo.
2. Modelar un problema de dominio usando clases, objetos, interfaces, arquitectura `App / Sistema / SistemaImpl` y patrones de diseño.

El segundo problema se resuelve con el patrón **Strategy**, porque el cálculo de ingreso y kilometraje depende del recorrido activo de cada micro. Además se utiliza **Singleton** para mantener una instancia compartida del sistema y una instancia única por estrategia de recorrido.

## Problema 1: Ruteo GUI

Esta sección registra el comportamiento general observado, pero aún falta completar el ruteo paso a paso con el estado de las variables, objetos gráficos, estrategia activa y resultado visual después de cada evento.

El ruteo define una ventana con:

- Un panel izquierdo con botones.
- Un panel central gris.
- Una estrategia inicial `DefaultStrategy`.
- Un botón especial inicialmente oculto.

La variable `currentNumber` comienza en `-1`. Mientras no se ingrese un número, el resultado se calcula con `DefaultStrategy`, que siempre retorna `1`.

Cuando se ingresa un número:

- Si es par, se usa `MultiplyStrategy`; el resultado será `n * n`.
- Si es impar, se usa `AddStrategy`; el resultado será `n + n`.

Al hacer clic en el panel central se alterna la visibilidad del botón especial. Al presionar ese botón, la estrategia pasa a `ZeroStrategy`, por lo que cualquier resultado posterior será `0` hasta ingresar otro número o borrar el estado.

## Problema 2: Modelo Del West

El dominio se organiza alrededor de la clase `Micro`. Cada micro conserva:

- `patente`: identificador.
- `kilometraje`: kilometraje acumulado.
- `ultimoRecorrido`: recorrido activo al final del procesamiento.
- `recorrido`: estrategia que calcula según A, B o C.
- `ganancia`: ingreso acumulado.

El sistema procesa dos tipos de líneas en `viajes.txt`:

- Líneas de viaje: `patente,adultos,mayores,estudiantes,vueltas,dia`.
- Líneas de cambio: `patente,recorrido`.

La decisión de diseño importante es que el viaje se evalúa con el recorrido activo en ese momento. Por eso, cuando aparece una línea de cambio, la micro cambia su estrategia antes de procesar los viajes siguientes.

## Strategy

La interfaz `Strategy` declara:

```java
int CalcularGanancia(int adultos, int mayores, int estudiantes, String dia);
double CalcularKilometraje(int cantVueltas);
```

Cada recorrido implementa esas operaciones con sus propias reglas:

- `RecA`: distancia 25 km, tarifa adulto 850, reglas especiales para tercera edad y estudiantes.
- `RecB`: distancia 27.6 km, tarifas fijas por tipo de pasajero.
- `RecC`: distancia 34.2 km, tarifa adulto 1000, descuentos diferenciados.

Esta separación evita que `Micro` tenga un bloque condicional grande para todos los recorridos. La micro delega el cálculo al objeto estrategia que representa su recorrido activo.

## Singleton

`SistemaImpl` usa Singleton para centralizar el estado de la aplicación:

```java
private static SistemaImpl instancia;
```

Esto permite que `App` trabaje contra la interfaz `Sistema` y no cree múltiples listas de micros accidentalmente.

Las estrategias `RecA`, `RecB` y `RecC` también se instancian como Singleton. En este caso tiene sentido porque no guardan estado individual de una micro; solo encapsulan reglas de cálculo comunes para cada recorrido.

## Flujo de ejecución

1. `App` invoca `LeerArchivos()`.
2. `LeerColectivos()` carga `colectivos.txt`.
3. `LeerViajes()` procesa `viajes.txt` en orden.
4. Cada línea de viaje acumula ingreso y kilometraje en la micro correspondiente.
5. Cada línea de cambio actualiza el recorrido activo.
6. Se muestran tres resultados por consola y mediante botones Swing.

## Archivos de entrada

### `colectivos.txt`

Formato:

```text
patente,recorridoInicial,kilometrajeInicial
```

Ejemplo:

```text
5NPDH4AE8EH255890,A,38586
```

### `viajes.txt`

Formato de viaje:

```text
patente,adultos,mayores,estudiantes,vueltas,dia
```

Formato de cambio:

```text
patente,recorrido
```

Los datos incluidos son sintéticos y agregados: una línea puede representar un bloque de viajes del mes. Fueron construidos para reproducir los resultados del ejemplo de ejecución del enunciado:

```text
El ingreso total es de: $32230330
El kilometraje total es de: 1124976 km
```

## Kilometraje decimal

El recorrido B mide `27.6 km` y el recorrido C mide `34.2 km`. Por eso el kilometraje debe mantenerse como `double` durante los cálculos. La solución formatea el resultado de esta manera:

- Si el valor es entero, se muestra sin decimal.
- Si el valor tiene fracción, se muestra con un decimal.

Esto evita perder información en casos como `1227.6 km`, que no debe truncarse a `1227 km`.

## Interfaz gráfica

La interfaz crea:

- Un `JFrame` de 500x600.
- Tres botones.
- Un panel central donde se reemplaza el resultado mostrado.

Cada botón limpia el panel, inserta el nuevo `JLabel`, y luego llama:

```java
panel.revalidate();
panel.repaint();
```

`revalidate()` recalcula el layout y `repaint()` fuerza el redibujado visual. Ambos son importantes cuando el contenido de un contenedor Swing cambia dinámicamente.

## Importación en Eclipse

Para el Problema 2, la raíz de paquetes no es `Solución/src`, sino:

```text
Solución/src/Del West
```

Eclipse debe usar esa carpeta como source folder. Desde ahí se encuentran directamente los paquetes:

```text
Dominio/
Logica/
Strategy/
```

Si se usa `Solución/src` como raíz, Eclipse interpretará `Del West` como una carpeta intermedia y los paquetes declarados no coincidirán con la ubicación esperada.
