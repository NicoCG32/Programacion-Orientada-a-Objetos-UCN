# Programación Orientada a Objetos - UCN

Repositorio de enunciados, archivos de entrada, soluciones y documentación de apoyo para el curso **Programación Orientada a Objetos** de la Universidad Católica del Norte.

Este repositorio fue separado desde el repositorio monolítico original para dejar el material de POO en una unidad autónoma. El foco del curso está en modelar problemas mediante clases, objetos, relaciones, interfaces, arquitectura por capas y patrones de diseño aplicados en Java.

## Estructura

```text
Programacion-Orientada-a-Objetos-UCN/
├── PRUEBA 1/
├── PRUEBA 2/
└── RECA/
```

Cada evaluación puede contener:

- `PRUEBA.pdf` o `Prueba - Parte 1/2.pdf`: enunciado de la evaluación.
- Archivos `.txt`: datos de entrada usados por la solución.
- `Solución/`: implementación Java y documentación local.
- `Solución/src/`: código fuente.
- `Solución/README.md`: ficha breve con estado, tipo de ejercicios y referencia a la explicación.
- `Solución/EXPLICACION.md` o `EXPLICACIÓN.MD`: desarrollo conceptual y técnico, cuando existe.

## Soluciones implementadas

### Completas

| Evaluación | Ejercicios disponibles | Conceptos principales |
| --- | --- | --- |
| [Prueba 1 - 2025 S1](PRUEBA%201/2025%20S1/Solución/) | Ruteo de objetos y sistema Music Analytics. | Diagrama de objetos, relaciones 1..N, lectura de archivos y modelo de dominio. |
| [Prueba 1 - 2024 S1](PRUEBA%201/2024%20S1/Solución/) | Ruteo paso a paso y programa Mapaches Celulares. | Estado de objetos, arreglos, simulación por turnos, carga de archivos y reglas de dominio. |
| [Prueba 2 - 2024 S2](PRUEBA%202/2024%20S2/Solución/) | Ruteo GUI y sistema Rent a Car. | Swing, arquitectura por capas, Factory, Strategy, Visitor y Singleton. |
| [Prueba 2 - 2024 S1](PRUEBA%202/2024%20S1/Solución/) | Ruteo GUI y sistema New Jurassic World. | Swing, herencia, Factory, Visitor, Singleton y arquitectura `App / Sistema / SistemaImpl`. |

### Parciales

| Evaluación | Avance disponible | Pendiente principal |
| --- | --- | --- |
| [Prueba 1 - 2023 S2](PRUEBA%201/2023%20S2/Solución/) | Implementación de ruteo y sistema Gestión UCN. | Completar o profundizar la documentación del ruteo y validaciones finales. |

## Evaluaciones

### Prueba 1

| Periodo | Estado | Contenido principal |
| --- | --- | --- |
| [2025 S1](PRUEBA%201/2025%20S1/) | Completa | Ruteo con salida y diagrama de objetos; programa Music Analytics con relaciones 1..N. |
| [2025 INVIERNO](PRUEBA%201/2025%20INVIERNO/) | Base por implementar | Enunciado y estructura de solución. |
| [2024 S2](PRUEBA%201/2024%20S2/) | Base por implementar | Enunciado, archivos de entrada y estructura de solución. |
| [2024 S2 RESILIENCIA](PRUEBA%201/2024%20S2%20RESILIENCIA/) | Base por implementar | Enunciado, archivos de entrada y estructura de solución. |
| [2024 S1](PRUEBA%201/2024%20S1/) | Completa | Ruteo paso a paso; programa Mapaches Celulares. |
| [2024 S1 RESILIENCIA](PRUEBA%201/2024%20S1%20RESILIENCIA/) | Base por implementar | Enunciado, archivos de entrada y estructura de solución. |
| [2023 S2](PRUEBA%201/2023%20S2/) | Implementada | Ruteo de línea a línea; programa Gestión UCN con multiplicidad N..N. |
| [2023 S2 RESILIENCIA](PRUEBA%201/2023%20S2%20RESILIENCIA/) | Base por implementar | Enunciado y estructura de solución. |

### Prueba 2

| Periodo | Estado | Contenido principal |
| --- | --- | --- |
| [2024 S2](PRUEBA%202/2024%20S2/) | Completa | Ruteo GUI dinámico; sistema Rent a Car con Strategy, Visitor y arquitectura por capas. |
| [2024 S1](PRUEBA%202/2024%20S1/) | Completa | Ruteo GUI dinámico; sistema New Jurassic World con Factory, Visitor y arquitectura por capas. |
| [2023 S2](PRUEBA%202/2023%20S2/) | Base por implementar | Enunciado, archivos de entrada y estructura de solución. |
| [2022 S2](PRUEBA%202/2022%20S2/) | Base por implementar | Material histórico incorporado desde Programación Avanzada; enunciado y archivos de entrada. |

### RECA

| Periodo | Estado | Contenido principal |
| --- | --- | --- |
| [2025 S2](RECA/2025%20S2/) | Base por implementar | Enunciado en dos partes, archivos de entrada y estructura de solución. |
| [2024 S1](RECA/2024%20S1/) | Base por implementar | Enunciado, archivos de entrada y estructura de solución. |

## Cómo estudiar este repositorio

1. Lee primero el enunciado de la evaluación.
2. Identifica las entidades del dominio antes de mirar el código.
3. Revisa el `README.md` de la carpeta `Solución/`.
4. Ejecuta el código desde `src/` en Eclipse o en el entorno Java que uses.
5. Contrasta la implementación con `EXPLICACION.md` cuando exista.

La idea no es memorizar clases aisladas, sino comprender la transición desde el problema escrito hacia un modelo de objetos coherente.

## Cómo ejecutar las soluciones

Las instrucciones de uso son comunes para todas las evaluaciones y se concentran aquí para evitar repetición en cada carpeta.

### En Eclipse

1. Crea un proyecto Java nuevo.
2. Copia el contenido de la carpeta `Solución/src/` de la evaluación que quieres revisar dentro del `src/` del proyecto.
3. Copia en la raíz del proyecto los archivos `.txt` que estén junto al enunciado, si la solución los utiliza.
4. Ejecuta la clase que contiene `public static void main(String[] args)`.

### Desde terminal

1. Entra a la carpeta `Solución/src/` de la evaluación.
2. Compila los archivos Java con `javac`.
3. Ejecuta la clase principal con `java`.
4. Si el programa lee archivos `.txt`, ejecútalo desde una ubicación donde esas rutas sean válidas o copia los `.txt` al directorio esperado por el código.

## Temario del curso

| Unidad | Contenidos |
| --- | --- |
| 1. Fundamentos de Java | Sintaxis básica, tipos de datos, variables, operadores, entrada y salida, compilación y ejecución. |
| 2. Archivos y excepciones | Lectura de archivos con `Scanner` y `File`, manejo de errores, `try/catch`, validación de datos de entrada. |
| 3. Clases y objetos | Abstracción, atributos, métodos, constructores, referencias, estado de objetos y comunicación mediante mensajes. |
| 4. Encapsulamiento | Modificadores de acceso, getters/setters, protección de invariantes y separación entre interfaz pública y estado interno. |
| 5. Colecciones y genéricos | Arreglos, `ArrayList`, `LinkedList`, interfaz `List`, iteradores y recorridos de estructuras dinámicas. |
| 6. Relaciones entre clases | Composición, agregación, asociaciones, multiplicidad 1..1, 1..N y N..N, modelo de dominio y diagramas de clases. |
| 7. Herencia y polimorfismo | Generalización, especialización, clases abstractas, métodos abstractos, sobrecarga, sobreescritura y casting. |
| 8. Interfaces y contratos | Definición de interfaces, implementación de contratos, desacoplamiento y documentación mediante Javadoc. |
| 9. Arquitectura de aplicaciones | Separación `App / Sistema / SistemaImpl`, organización por paquetes, capas y responsabilidades. |
| 10. Principios SOLID | Responsabilidad única, abierto/cerrado, sustitución de Liskov, segregación de interfaces e inversión de dependencias. |
| 11. Patrones de diseño | Singleton, Factory, Abstract Factory, Builder, Strategy, Visitor, Observer, Decorator, Adapter, Facade y criterios para decidir cuándo aplicarlos. |
| 12. Interfaces gráficas | Fundamentos de Swing, ventanas, paneles, botones, eventos, listeners, layouts e integración con lógica de dominio. |

## Temas de estudio

### Fundamentos de Java

- Tipos de datos, variables y referencias.
- Lectura de archivos mediante `Scanner` y `File`.
- Diferencia entre compilación y ejecución.
- Manejo de excepciones con `try`, `catch` y `finally`.
- Uso de colecciones como arreglos, `ArrayList`, `LinkedList`, `List` e iteradores.

### Conceptos centrales de POO

Una **clase** define estructura y comportamiento: atributos, métodos, constructores y reglas internas. Un **objeto** es una instancia concreta de una clase; existe en memoria durante la ejecución y posee estado propio.

La **abstracción** consiste en decidir qué elementos del problema son relevantes para el software. Una buena abstracción identifica entidades, responsabilidades y relaciones; una mala abstracción suele producir clases confusas, duplicación de lógica y acoplamiento innecesario.

El **encapsulamiento** controla el acceso al estado interno de los objetos. Los atributos no deberían exponerse sin necesidad; la interacción debe ocurrir mediante métodos que preserven invariantes y reglas del dominio.

La **composición** modela objetos que contienen o coordinan otros objetos. En las pruebas del curso aparece con frecuencia mediante relaciones 1..1, 1..N y N..N. La multiplicidad no es un detalle decorativo: determina cómo se almacenan, recorren y consultan los datos.

La **herencia** representa una relación conceptual de especialización. Debe usarse cuando una subclase realmente es un tipo de la clase base. Si solo se quiere reutilizar código, normalmente conviene revisar si composición o interfaces son alternativas más limpias.

El **polimorfismo** permite invocar una misma operación y obtener comportamientos distintos según el tipo real del objeto. En POO es esencial para evitar condicionales excesivos y delegar la responsabilidad a las clases adecuadas.

### Interfaces y contratos

Una **interfaz** define qué operaciones ofrece un componente, sin imponer cómo se implementan internamente. Actúa como contrato entre quien solicita una operación y quien la ejecuta.

Un contrato bien escrito debe indicar:

- Qué hace el método.
- Qué parámetros recibe.
- Qué valor retorna.
- Qué errores o excepciones pueden ocurrir.

En Java, esta documentación suele expresarse mediante Javadoc con etiquetas como `@param`, `@return` y `@throws`.

### Arquitectura App / Sistema / SistemaImpl

El curso usa frecuentemente una separación simple:

- `App`: punto de entrada, interacción con usuario y presentación de resultados.
- `Sistema`: interfaz que declara las operaciones disponibles.
- `SistemaImpl`: implementación concreta de la lógica del problema.

Esta estructura separa responsabilidades. La `App` no debería resolver las reglas centrales del dominio; debe pedir servicios al sistema. Así se reduce el acoplamiento y se facilita modificar la lógica sin cambiar la interfaz de uso.

### Principios SOLID

Los principios SOLID ayudan a organizar responsabilidades y reducir dependencias frágiles:

- **SRP**: una clase debe tener una responsabilidad principal.
- **OCP**: el diseño debe permitir extensión sin modificar innecesariamente código estable.
- **LSP**: una subclase debe poder usarse donde se espera la clase base.
- **ISP**: es preferible tener interfaces específicas antes que interfaces enormes.
- **DIP**: los módulos deben depender de abstracciones, no de implementaciones concretas.

### Patrones de diseño

#### Patrones creacionales

- **Singleton**: garantiza una única instancia en toda la aplicación cuando conceptualmente solo debe existir un objeto de ese tipo.
- **Factory**: concentra la creación de objetos y evita dispersar `new` por la lógica principal.
- **Abstract Factory**: crea familias de objetos relacionados sin acoplar el código cliente a clases concretas. Generalmente se estudia como referencia.
- **Builder**: construye objetos complejos paso a paso, separando el proceso de construcción de la representación final. Generalmente se estudia como referencia.

#### Patrones de comportamiento

- **Strategy**: permite cambiar el comportamiento de un objeto en tiempo de ejecución mediante una estrategia intercambiable.
- **Visitor**: permite aplicar operaciones distintas según el tipo concreto dentro de una jerarquía.
- **Observer**: notifica cambios de estado a múltiples observadores sin acoplar directamente el emisor con sus receptores. Generalmente se estudia como referencia.

#### Patrones estructurales

- **Decorator**: añade responsabilidades a un objeto de forma dinámica sin modificar su clase original. Generalmente se estudia como referencia.
- **Adapter**: permite que dos interfaces incompatibles colaboren mediante una capa de adaptación. Generalmente se estudia como referencia.
- **Facade**: ofrece una interfaz simple para coordinar un conjunto de clases, operaciones o subsistemas. Generalmente se estudia como referencia.

Una distinción práctica: si el comportamiento depende del tipo concreto del objeto, suele aparecer Visitor; si el comportamiento cambia para una misma instancia, suele aparecer Strategy.

### Interfaz gráfica con Swing

Las pruebas de GUI trabajan con ventanas, paneles, botones, listeners, layouts e imágenes. En estos ejercicios conviene separar la construcción visual de la lógica del problema para evitar que la interfaz absorba responsabilidades que pertenecen al dominio.

## Secuencia conceptual recomendada

1. Abstraer el problema.
2. Definir clases y responsabilidades.
3. Encapsular el estado.
4. Modelar relaciones y multiplicidades.
5. Aplicar herencia solo cuando la relación conceptual lo justifique.
6. Usar polimorfismo para distribuir comportamiento.
7. Definir interfaces y contratos.
8. Ordenar el sistema mediante capas.
9. Aplicar patrones de diseño cuando resuelvan una necesidad real del problema.
