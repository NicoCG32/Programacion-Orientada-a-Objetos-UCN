# Explicación detallada - Programación Orientada a Objetos

## Objetivo

Documentar la solución del Problema 2 (Gestión UCN), basada en el menú y la lógica de contratos por fechas. La explicación del ruteo del Problema 1 está pendiente.

## Ejercicio 1: Ruteo

⚠️ **Explicación en proceso**

El ruteo del Problema 1 está implementado en [src/Ruteo/Main.java](src/Ruteo/Main.java). La explicación detallada de la ejecución paso a paso, diagramas de objetos y análisis de variables estáticas estará disponible próximamente.

## Ejercicio 2: Gestión UCN

### Modelo de dominio

![Modelo de Dominio - Gestión UCN](src/GestionUCN/DiagramaModeloDominio.png)

El modelo de dominio simplificado muestra las entidades principales y sus relaciones:
- `Persona` y `Unidad` se relacionan a través de `Contrato`
- `Contrato` almacena el rol y las fechas de inicio y término
- `Fecha` es una clase auxiliar para representar y comparar fechas

### Modelo de clases

- `Persona`: tiene `rut` y una lista de `Contrato`.
- `Unidad`: tiene `nombre` y una lista de `Contrato`.
- `Contrato`: une `Persona` y `Unidad` con un `rol`, `fechaInicio` y `fechaTermino`.
- `Fecha`: representa `año/mes/día` y valida fechas.

Notas de modelado:

- `Persona` podría tener muchos atributos, pero para la funcionalidad basta el `rut` (y opcionalmente el nombre por estética).
- `Unidad` también podría tener más atributos, pero se reduce a `nombre` para el alcance del programa.
- La relación entre personas y unidades es N..N, por eso se usa la clase auxiliar `Contrato` (o "relación"). Esta clase concentra datos que no son responsabilidad directa ni de `Persona` ni de `Unidad` (rol y fechas) y evita manejar listas paralelas. Es un ejemplo de abstracción: no se entregan las clases, se interpretan según la necesidad.
- `Fecha` también es una abstracción útil: simplifica el trabajo del `Contrato` y delega la responsabilidad de comparar fechas a la propia fecha, evitando usar `getAño`, `getMes` y `getDía` en cada comparación.

Relaciones principales:

- Persona 1..N Contrato
- Unidad 1..N Contrato
- Contrato 1..1 Persona y 1..1 Unidad

### Comparación de fechas

`Fecha.estaDespues` y `Fecha.estaAntes` son **inclusivos**: si la fecha es igual al inicio o al término, se considera dentro del rango.

Alternativas válidas:

- Se puede usar `Date` en lugar de `Fecha` si se desea delegar validación y comparación a la librería estándar.
- Se puede usar `compareTo` en lugar de `estaAntes`/`estaDespues` para comparar fechas.

### Flujo general del menú

1) Agregar persona (por `rut`).
2) Agregar unidad (por `nombre`).
3) Asociar persona a unidad con rol y fechas.
4) Reportabilidad.
5) Terminar simulación.

### Reportes implementados

1) **Cargos por persona según fecha**: recorre contratos de cada persona e imprime los que están vigentes en la fecha.
2) **Personas por unidad según fecha**: cuenta personas distintas con contratos vigentes en la unidad.
3) **Historial por RUT**: ordena contratos por fecha de inicio y los imprime.
4) **Roles cumplidos por unidad**: imprime los contratos registrados en la unidad.
5) **Estadísticas generales**:
	 - Persona con más antigüedad (contrato con menor fecha de inicio).
	 - Persona con más roles (mayor cantidad de contratos).

Nota de implementación:

- En el bloque de estadísticas se podría ordenar la lista de contratos por fecha de inicio y tomar el primero (índice 0) como el más antiguo.

### Manejo de errores

- Se valida existencia de persona/unidad antes de asociar.
- Se valida formato de fecha `DD/MM/AAAA` y coherencia de rango.
- Se reportan errores con mensajes claros por consola.

### Ejemplo de sesión (resumen)

```
¿Qué desea realizar?
1) Agregar persona
2) Agregar Unidad
3) Asociar Persona A Unidad
4) Reportabilidad
5) Terminar simulación
1
Ingrese el RUT de la persona:
11.111.111-1
2
Ingrese el nombre de la unidad:
Escuela de Ingeniería
3
Ingrese el nombre de la unidad:
Escuela de Ingeniería
Ingrese el RUT de la persona:
11.111.111-1
Ingrese el rol de la persona:
Estudiante
Ingrese la fecha de inicio (DD/MM/AAAA):
01/03/2023
Ingrese la fecha final (DD/MM/AAAA):
31/12/2023
4
¿Qué desea reportar?
1) Cargos por persona según fecha
...
```

### Diagrama de clases

![Diagrama de Clases - Gestión UCN](src/GestionUCN/DiagramaDeClases.png)

El diagrama de clases detalla:
- Los atributos y métodos de cada clase
- Las relaciones de composición entre `Persona`/`Unidad` y `Contrato`
- La asociación entre `Contrato` y `Fecha`

## Observaciones

- El sistema funciona por consola y no usa archivos de entrada.
- Las listas se mantienen en memoria durante la ejecución.
- En el reporte de personas por unidad se usa `contains` para evitar contar dos veces a la misma persona. `contains` recorre la lista y verifica si el objeto ya existe (por `equals`), devolviendo `true` si encuentra una coincidencia.
