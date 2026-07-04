# Programación Orientada a Objetos - UCN

![Java](https://img.shields.io/badge/Java-17%20%7C%2021-ED8B00?logo=openjdk&logoColor=white)
![Eclipse](https://img.shields.io/badge/IDE-Eclipse-2C2255?logo=eclipseide&logoColor=white)
![Swing](https://img.shields.io/badge/GUI-Swing-0B6DB0)
![Nivel](https://img.shields.io/badge/Nivel-1%20Modelado%20POO-blue)

Repositorio de enunciados, archivos de entrada, soluciones y documentación de apoyo para el curso **Programación Orientada a Objetos** de la Universidad Católica del Norte.

Este repositorio fue separado desde el repositorio monolítico original para dejar el material de POO en una unidad autónoma. El foco del curso está en modelar problemas mediante clases, objetos, relaciones, interfaces, arquitectura por capas y patrones de diseño aplicados en Java.

## Entorno del curso

El curso se desarrolla en **Java**, normalmente usando **Eclipse** como IDE. La versión exacta de Java no suele ser crítica para este material; Java 17 o Java 21 son opciones razonables mientras el proyecto compile correctamente.

Lo importante es que el entorno tenga soporte para **Swing**, porque varias evaluaciones de la segunda parte del curso trabajan interfaces gráficas, eventos, ventanas, botones, paneles y separación entre interfaz y lógica de dominio.

## Estructura

```text
Programacion-Orientada-a-Objetos-UCN/
├── Ayudantías/
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

### Ayudantías

| Material | Estado | Contenido principal |
| --- | --- | --- |
| [PRE PRUEBA 2](<Ayudantías/PRE PRUEBA 2/README.md>) | Enunciado y datos disponibles | Preparación para Prueba 2, modelado de dominio, lectura de archivos y diseño de sistema en Java. |

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

## Glosario NicoPablo

Esta sección conserva las explicaciones simples del README original. La intención es estudiar los conceptos con lenguaje humano, antes de entrar al vocabulario más formal.

### Clase vs objeto

La **clase** es el molde o plano que define la estructura y el comportamiento de un conjunto de objetos. En ella se especifican:

- Los **atributos**: el estado.
- Los **métodos**: el comportamiento.
- Las reglas internas que regulan su funcionamiento.

Puede entenderse como una receta o un cortador de galletas.

El **objeto**, en cambio, es una **instancia concreta** creada a partir de una clase. Es la galleta real, con valores propios en sus atributos.

Conceptualmente:

- La clase define la estructura.
- El objeto contiene el estado.
- La clase existe en el código.
- El objeto existe en memoria durante la ejecución.

### Abstracción

La **abstracción** consiste en interpretar y modelar un problema del mundo real, identificando los elementos esenciales y omitiendo los irrelevantes.

Antes de programar, se debe decidir:

- Qué entidades forman parte del problema.
- Qué clases se necesitan.
- Qué atributos son relevantes.
- Qué comportamientos deben modelarse.

Por ejemplo, si un amigo te pide guardar ropa, puedes pensar en un clóset, una habitación o una caja; tú defines la forma y las propiedades específicas.

Abstraer implica:

- Simplificar la realidad.
- Enfocarse en lo necesario para resolver el problema.
- Construir un modelo coherente y funcional.

Una mala abstracción conduce a un diseño deficiente.

### Encapsulamiento

El **encapsulamiento** consiste en controlar la visibilidad y el acceso a los atributos y métodos de una clase.

Su objetivo es:

- Proteger el estado interno.
- Evitar accesos indebidos.
- Exponer únicamente lo necesario.

No todos los atributos deben ser públicos. No todas las operaciones deben ser accesibles desde cualquier parte del sistema.

Aplicado a la arquitectura:

- La `App` realiza solicitudes.
- El `Sistema` define los métodos disponibles.
- El `SistemaImpl` implementa la lógica interna.

La `App` no conoce cómo se ejecutan las operaciones; solo conoce qué puede solicitar. Esto permite mantener el control sobre la lógica interna y reducir el acoplamiento entre componentes.

### Herencia

La **herencia** permite que una clase derive de otra, reutilizando atributos y métodos comunes.

Se utiliza cuando varias clases comparten características similares. En lugar de duplicar código:

- Se define una clase base con los elementos comunes.
- Las subclases heredan esos elementos.

Si la clase base no debe instanciarse directamente, se declara como `abstract`.

Esto implica que:

- No se pueden crear objetos de la clase base.
- Solo se pueden crear instancias de las subclases concretas.
- Todas comparten la estructura y comportamiento común definido en la clase base.

La herencia representa una relación del tipo: “es un tipo de”. Debe utilizarse únicamente cuando esa relación conceptual es válida.

### Polimorfismo

El **polimorfismo** permite que un mismo nombre de método represente comportamientos distintos según el contexto.

#### Polimorfismo en métodos: sobrecarga

Consiste en definir varios métodos con el mismo nombre, pero con diferentes listas de parámetros.

El compilador determina cuál método ejecutar según los argumentos proporcionados. Este tipo de polimorfismo se resuelve en tiempo de compilación.

#### Polimorfismo en clases: sobreescritura

Ocurre cuando una subclase redefine un método heredado de la clase base, proporcionando una implementación específica.

Por ejemplo, todos los peleadores pueden tener un método `golpear()`, pero:

- El boxeador golpea a puño cerrado.
- El karateka golpea a mano abierta.

El nombre del método es el mismo, pero el comportamiento depende del tipo real del objeto en tiempo de ejecución. Este es el polimorfismo más relevante en Programación Orientada a Objetos.

### Interfaces

Una **interfaz** define un conjunto de métodos que una clase debe implementar, sin especificar cómo deben hacerlo.

Puede compararse con el panel de controles de un auto: los botones y palancas disponibles para el conductor.

El conductor:

- No necesita conocer el funcionamiento interno.
- Solo utiliza los controles disponibles.

En programación:

- La interfaz define qué métodos están disponibles.
- La implementación concreta define cómo funcionan.

Un buen ejemplo es `List`. Tiene varias implementaciones, como `ArrayList` y `LinkedList`. Uno ocupa los métodos definidos por la interfaz `List`, aunque no sepa exactamente cómo funciona cada implementación internamente.

También podrías crear tu propia clase `Lista` e implementar la interfaz `List`, definiendo sus mecanismos con tu propia lógica.

### El contrato

Las interfaces deben incluir un mensaje claro que indique qué hacen los métodos definidos. Ese mensaje constituye el **contrato**.

El contrato especifica:

- Qué hace el método.
- Qué parámetros recibe.
- Qué valor retorna.
- Qué excepciones puede lanzar.

En Java, el contrato suele documentarse con Javadoc:

- `@param`: qué parámetros recibe el método.
- `@throws`: qué excepciones lanza el método.
- `@return`: qué devuelve el método.
- `@author`: quién es el autor.

El cliente conoce qué hace el método, pero no cómo lo hace.

### Principios SOLID

Los principios **SOLID** proporcionan lineamientos para diseñar software mantenible y escalable.

Su correcta aplicación permite:

- Evitar clases excesivamente grandes.
- Reducir dependencias innecesarias.
- Facilitar modificaciones futuras.
- Mejorar la legibilidad del código.

No es imprescindible memorizar cada principio, sino comprender su finalidad: organizar responsabilidades y minimizar el acoplamiento.

### Arquitectura App / Sistema / SistemaImpl

#### App

Es el cliente.

Por cliente se entiende una entidad que solicita servicios y recibe resultados, pero no implementa la lógica interna. Por eso se denomina cliente: pide cosas concretas sin necesitar entender cómo se le dan.

Desde la `App`:

- Se realizan solicitudes.
- Se muestran resultados por pantalla.
- Se gestiona la interacción con el usuario.

La `App` no contiene lógica de implementación, porque el cliente no hace las cosas: las pide y las recibe.

#### Sistema

Define qué puede solicitar el cliente.

Actúa como el panel de botones disponible para la `App`.

Generalmente retorna `String` para que la `App` los imprima. La `App` solo puede ver la interfaz, no la implementación concreta.

#### SistemaImpl

Implementa la lógica real de cada método definido en `Sistema`.

Aquí se encuentran:

- Métodos privados.
- Algoritmos internos.
- Reglas de negocio.

Puede haber distintas implementaciones de `Sistema` según la lógica requerida. Este diseño permite cambiar la implementación sin modificar la `App`.

### Patrones de diseño explicados simple

#### Factory

El patrón **Factory** delega la responsabilidad de creación de objetos a una clase especializada, en lugar de realizar la creación directamente en `Sistema`.

Factory puede implementarse como clase o como interfaz, dependiendo de las necesidades del problema. Sin embargo, es recomendable implementarlo como interfaz cuando se quiere definir correctamente su contrato.

Esto permite:

- Centralizar la lógica de creación.
- Reducir dependencias directas.
- Facilitar cambios futuros en la construcción de objetos.

#### Singleton

El patrón **Singleton** se utiliza cuando una clase debe tener una única instancia durante la ejecución del programa.

Por ejemplo, si una fábrica crea instancias particulares, no tiene sentido crear una fábrica nueva para cada objeto. Una sola fábrica puede crear todas las instancias.

Generalmente se usa para `SistemaImpl`, ya que rara vez se requiere más de una implementación activa del `Sistema`.

#### Visitor

Se utiliza **Visitor** cuando se requiere aplicar operaciones distintas según el tipo concreto de objeto dentro de una jerarquía de clases.

Visitor se implementa como interfaz, pues define los métodos del visitante, y sus implementaciones concretas se realizan como clases.

Por ejemplo, distinguir entre Auto, Camioneta y SUV para aplicar una lógica distinta a cada uno.

Es útil cuando el problema exige diferenciar el comportamiento según el tipo de instancia.

#### Strategy

Se utiliza **Strategy** cuando se necesita cambiar el comportamiento de una instancia específica en tiempo de ejecución.

Strategy se implementa como interfaz. La instancia cambia su comportamiento según la estrategia concreta que se le asigna.

Por ejemplo, asignar un modo de manejo distinto a un vehículo.

Permite que un mismo objeto cambie su algoritmo o forma de operar sin modificar su clase.

#### Diferencia entre Visitor y Strategy

- Si el comportamiento cambia para la **misma instancia**, se utiliza **Strategy**.
- Si la lógica cambia según el **tipo concreto de clase**, se utiliza **Visitor**.
- Si el problema requiere ambas condiciones, es posible combinar ambos patrones.

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

## Nota sobre niveles de abstracción

Los conceptos de Programación Orientada a Objetos no deben entenderse como elementos fijos, mecánicos e inamovibles. Son herramientas de interpretación para representar elementos complejos, relacionados entre sí y observados desde distintos niveles de abstracción.

Una buena forma de entender la progresión de los cursos es mirarlos como una escala: cada nivel exige pensar menos en líneas sueltas de código y más en modelos, estructuras, componentes y arquitectura.

### Nivel 0: programación estructurada

En el primer nivel, la abstracción es nula o muy baja. Se trabaja principalmente con instrucciones, variables, condiciones, ciclos, funciones y algoritmos concretos.

La lógica dominante es lineal:

```text
input -> proceso 1 -> proceso 2 -> proceso 3 -> output
```

Aquí el foco está en memorizar, entender y aplicar líneas de código. Se aprende a transformar una entrada en una salida siguiendo una secuencia de pasos. Es una base necesaria, pero todavía se piensa muy cerca del código mismo.

Repositorio asociado:

[NicoCG32/Programacion-UCN](https://github.com/NicoCG32/Programacion-UCN)

### Nivel 1: dominio, clases y componentes básicos

En Programación Orientada a Objetos y Técnicas y Metodologías de Programación Avanzada aparece el primer salto real de abstracción.

Ya no basta con pensar solo en el código. Pensar únicamente en líneas, instrucciones y algoritmos te mantiene en el nivel anterior. En POO debes pensar primero en el **modelo que responde al problema**. Ese modelo se conoce como **dominio**.

Las clases no aparecen mágicamente ni existen como verdades absolutas: son abstracciones que tú construyes al interpretar el problema. Una clase representa una decisión de diseño. Decides qué entidad existe, qué atributos importan, qué comportamiento le corresponde y cómo se relaciona con las demás.

En Técnicas y Metodologías también empieza a aparecer una abstracción distinta: los **contenedores**. Al trabajar con una `LinkedList`, un árbol o una estructura similar, ya no piensas en una sola clase aislada. Piensas en una organización de clases que colaboran para formar un componente básico. Por ejemplo, una lista enlazada puede requerir nodos, referencias, operaciones de inserción, eliminación y recorrido; todo eso funciona como una unidad conceptual.

Al final de este nivel aparece una primera pincelada de arquitectura mediante la separación:

```text
App -> Sistema (interface) -> SistemaImpl
```

Esa separación no es todavía arquitectura avanzada, pero sí enseña una idea importante: organizar responsabilidades y evitar que todo el programa viva en una sola clase.

Repositorios asociados:

[NicoCG32/Programacion-Orientada-a-Objetos-UCN](https://github.com/NicoCG32/Programacion-Orientada-a-Objetos-UCN)

[NicoCG32/Tecnicas-y-Metodologias-de-Programacion-Avanzada-UCN](https://github.com/NicoCG32/Tecnicas-y-Metodologias-de-Programacion-Avanzada-UCN)

### Nivel 2: estructuras de datos

En Estructura de Datos se profundiza la aplicación de contenedores.

Aquí las estructuras dejan de ser solo ejercicios puntuales y pasan a verse como herramientas generales para resolver problemas más complejos. Listas, pilas, colas, árboles, grafos, tablas hash u otras estructuras permiten organizar información de forma más inteligente, para luego aplicar algoritmos sobre ellas.

Este nivel exige pensar más allá del dato individual. Se empieza a pensar en cómo los datos se conectan, cómo se recorren, cómo se insertan, cómo se eliminan y qué costo tiene cada operación.

Repositorio asociado:

[NicoCG32/Estructura-de-Datos-UCN](https://github.com/NicoCG32/Estructura-de-Datos-UCN)

### Nivel 3: componentes y arquitectura

En Patrones de Software y Programación el foco sube nuevamente.

Ya no se piensa solo en dominio, clases concretas o estructuras individuales. Se empieza a pensar en **componentes**: grupos de clases que colaboran para cumplir una responsabilidad mayor. Esos componentes se componen, se comunican, se aíslan y se ordenan para formar una arquitectura de software.

En este nivel, los patrones ayudan a modelar soluciones reutilizables para problemas comunes de diseño. No son recetas rígidas, sino formas de organizar componentes, dependencias y responsabilidades de manera más limpia.

Repositorio asociado:

[NicoCG32/Patrones-de-Software-y-Programacion-UCN](https://github.com/NicoCG32/Patrones-de-Software-y-Programacion-UCN)

### Resumen de la progresión

| Nivel | Curso o enfoque | Forma principal de pensar |
| --- | --- | --- |
| 0 | Programación | Líneas de código, pasos, instrucciones y algoritmos directos. |
| 1 | POO / Técnicas y Metodologías | Dominio, clases, objetos, relaciones y componentes básicos. |
| 2 | Estructura de Datos | Contenedores, organización de datos y algoritmos más complejos. |
| 3 | Patrones de Software y Programación | Componentes, composición de clases y arquitectura de software. |
