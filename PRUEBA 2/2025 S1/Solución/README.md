# Solución

**Asignatura**: Programación Orientada a Objetos
**Período**: 2025 Semestre 1
**Tipo**: Prueba 2

**Estado**: Implementación completa | Documentación parcial

## Descripción

Esta carpeta contiene la solución de la Prueba 2: el ruteo de una interfaz gráfica con estrategias y el sistema **Del West** para procesar recorridos de micros, cambios de recorrido, ingresos y kilometraje acumulado.

- **Fecha**: 25-06-2025
- **Duración**: 3 horas
- **Profesores**: Alejandro Paolini, Cristhian Rabbi
- **Puntaje total**: 1 punto (0.6 para aprobatoria)

## Explicación detallada

Para el análisis conceptual, la justificación de los patrones y el detalle de los datos de prueba, revisa [EXPLICACIÓN.md](EXPLICACIÓN.md).

## Ejercicios

### Problema 1: Ruteo GUI

**Problema:** Rutear una aplicación Swing que cambia de estrategia según el número ingresado y según la interacción con un botón especial. **Estado:** Implementado en `src/Ruteo/Main.java`; documentación paso a paso pendiente.

### Problema 2: Del West

**Problema:** Construir un sistema que procese micros, viajes y cambios de recorrido para calcular:

1. Lista final de micros con patente, kilometraje, recorrido activo e ingreso.
2. Ingreso total de la flota.
3. Kilometraje total de la flota.

**Archivos de entrada:**

- `colectivos.txt`
- `viajes.txt`

Los archivos están en la carpeta de la evaluación: `PRUEBA 2/2025 S1/`.

## Estructura de la solución

```text
Solución/
├── README.md
├── EXPLICACIÓN.md
└── src/
    ├── Ruteo/
    │   └── Main.java
    └── Del West/
        ├── Dominio/
        │   └── Micro.java
        ├── Logica/
        │   ├── App.java
        │   ├── Sistema.java
        │   └── SistemaImpl.java
        └── Strategy/
            ├── Strategy.java
            ├── RecA.java
            ├── RecB.java
            └── RecC.java
```

## Cómo cargar en Eclipse

Esta evaluación tiene dos raíces de código distintas.

### Problema 1: Ruteo

1. Crea un proyecto Java.
2. Usa como carpeta fuente `Solución/src/Ruteo`.
3. Ejecuta `Main.java`.

### Problema 2: Del West

1. Crea un proyecto Java.
2. Usa como carpeta fuente `Solución/src/Del West`.
3. Copia `colectivos.txt` y `viajes.txt` a la raíz del proyecto, al mismo nivel que `src`.
4. Ejecuta `Logica.App`.

Eclipse debe tratar `Solución/src/Del West` como la raíz de los paquetes. Desde esa carpeta cuelgan directamente `Dominio`, `Logica` y `Strategy`.

## Resultado esperado con los datos incluidos

Con los archivos `colectivos.txt` y `viajes.txt` incluidos en esta evaluación, el sistema debe producir:

```text
El ingreso total es de: $32230330
El kilometraje total es de: 1124976 km
```

La lista de micros debe coincidir con las patentes, recorridos finales, kilometrajes e ingresos del ejemplo de ejecución del enunciado.

## Estado

- [x] Enunciado PDF disponible
- [x] Enunciado Markdown disponible
- [x] Archivos de entrada disponibles
- [x] Ruteo GUI implementado
- [ ] Ruteo GUI documentado paso a paso
- [x] Sistema Del West implementado
- [x] Strategy aplicado a recorridos
- [x] Singleton aplicado al sistema y a las estrategias de recorrido
- [x] Interfaz Swing con tres botones y panel central
