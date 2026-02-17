# Solución

**Asignatura**: Programación Orientada a Objetos  
**Período**: 2024 Semestre 2  
**Tipo**: Prueba 2

**Estado**: ✅ Implementación completa | ✅ Documentación completa

## Descripción

Esta carpeta contiene la solución de la Prueba 2: el ruteo con interfaz gráfica (Problema 1) y el sistema Rent a Car (Problema 2). El programa carga datos desde archivos de texto, modela vehículos y modos de manejo, y entrega los reportes solicitados en la prueba.
- **Fecha**: 28-11-2024
- **Duración**: 3 horas
- **Profesores**: Alejandro Paolini, Moisés Moraga
- **Puntaje total**: 1 punto (0.6 para aprobatoria)

## Explicación Detallada

Para una explicación completa y paso a paso sobre el modelado, los patrones y los diagramas, revisa el archivo [EXPLICACIÓN.MD](EXPLICACIÓN.MD).

## Ejercicio

### Problema 1: Ruteo con Interfaz Gráfica
**Problema:** Ruteo de código con componentes Swing (JFrame, JPanel, JButton, JTextField) y eventos.

**Descripción:**  
Sistema que solicita el RUT del usuario y crea una interfaz gráfica con layout dinámico según el cuarto dígito:
- **Dígito 0-5**: Layout horizontal (5 botones en fila)
- **Dígito 6-9**: Layout vertical (5 botones en columna)

**Patrones de diseño implementados:**
- **Singleton**: Para el configurador (única instancia)
- **Strategy**: Para la estrategia de layout (HorizontalLayoutStrategy, VerticalLayoutStrategy)

**Componentes Swing utilizados:**
- JFrame (ventana principal 400x400)
- JPanel (panel contenedor con BoxLayout)
- JButton (5 botones numerados)
- BoxLayout (X_AXIS para horizontal, Y_AXIS para vertical)

### Problema 2: Rent a Car
**Problema:** Sistema de gestión de flota de vehículos (Camionetas, SUV, Autos) con modos de manejo y cálculo de consumo.

**Archivo de entrada:**
- fleet.txt (información de vehículos y usos)

**Funcionalidades requeridas:**
1) Calcular kilometraje recorrido de cada vehículo
2) Calcular combustible utilizado (según modo de manejo)
3) Identificar vehículos con mayor consumo por categoría

**Patrones de diseño implementados:**
- **Visitor**: Para recorrer y calcular consumos
- **Strategy**: Para los modos de manejo (Eco, Normal, Sport)
- **Factory**: Para creación de vehículos (con interfaz `IVehiculoFactory`)

**Arquitectura:** Sistema de 3 capas (Dominio, Lógica, Presentación)

## Estructura de la Solución

```
Solución/
├── src/
│   ├── RuteoGUI/
│   │   ├── Main.java                (incluye todas las clases)
│   │   └── Respuestas.md
│   └── RentACar/
│       ├── Dominio/
│       │   ├── Vehiculo.java         (clase abstracta base)
│       │   ├── Camioneta.java
│       │   ├── SUV.java
│       │   └── Auto.java
│       ├── Strategy/
│       │   ├── Strategy.java         (interface)
│       │   ├── ModoEco.java
│       │   ├── ModoNormal.java
│       │   └── ModoSport.java
│       ├── Visitor/
│       │   ├── Visitor.java          (interface)
│       │   └── VisitorMayorConsumo.java
│       ├── Factory/
│       │   ├── IVehiculoFactory.java (interface)
│       │   └── VehiculoFactory.java
│       └── Logica/
│           ├── App.java              (main Rent a Car)
│           ├── Sistema.java          (interface)
│           └── SistemaImpl.java
├── README.md
└── EXPLICACIÓN.MD
```

## Cómo Cargar y Ejecutar en Eclipse

### Ubicación en el Repositorio
Este código se encuentra en: `Prog. Orientada a Objetos/PRUEBA 2/2024 S2/Solución/src/`

### Opción Recomendada: Copiar la Carpeta `src/`

1. **Obtener los archivos fuente:**
   - Descarga o clona el repositorio `Programacion-Avanzada`
   - Navega a `Prog. Orientada a Objetos/PRUEBA 2/2024 S2/Solución/`
   - Copia SOLO la carpeta `src/` a tu computadora

2. **En Eclipse, crear un nuevo proyecto Java:**
   - `File` → `New` → `Java Project`
   - Nombre: `Prueba2_POO`
   - Selecciona `Create from existing source`
   - Browse → Apunta a la carpeta `src/` que copiaste
   - Finish

3. **Ejecutar el programa:**
   - Para Rent a Car: clic derecho en `RentACar/Logica/App.java` → `Run As` → `Java Application`
   - Para el ruteo GUI: clic derecho en `RuteoGUI/Main.java` → `Run As` → `Java Application`

### Importante: Archivos de Texto

Para que el programa pueda leer los archivos de texto (.txt) correctamente:
- Copia el archivo `fleet.txt` desde `Prog. Orientada a Objetos/PRUEBA 2/2024 S2/` a la raíz de tu proyecto (paralelo a la carpeta `src/`)
- Los archivos requeridos son:
  - `fleet.txt` (información de la flota de vehículos)
- El programa los buscará en la raíz del proyecto, no dentro de `src/`

### Opción Alternativa: Copiar Archivos Manualmente

1. **Crear un nuevo proyecto Java en Eclipse:**
   - `File` → `New` → `Java Project` → Nombre: `Prueba2_POO` → Finish

2. **Copiar los archivos `.java`:**
   - Abre el Explorador de archivos
   - Ve a `Prog. Orientada a Objetos/PRUEBA 2/2024 S2/Solución/src/`
   - Copia las carpetas `RentACar` y `RuteoGUI` dentro del `src/` de tu proyecto
   - Eclipse pedirá confirmación → Clic "Yes to All"

3. **Ejecutar:**
   - Clic derecho en el archivo Main correspondiente
   - `Run As` → `Java Application`

## Verificar que Todo Funciona Correctamente

### Ruteo GUI
- Al ejecutar `RuteoGUI/Main.java`, se te solicitará ingresar tu RUT
- Ingresa el RUT sin puntos ni guión (ejemplo: 12345678-9)
- Se abrirá una ventana con 5 botones dispuestos según el cuarto dígito:
  - Si es 0-5: botones en fila horizontal
  - Si es 6-9: botones en columna vertical

### Rent a Car
- Al ejecutar `RentACar/Logica/App.java`, deberías ver la salida con:
  - Consumo y odómetro de cada vehículo
  - Mayor consumo por categoría (Camioneta, SUV, Auto)
- El sistema lee el archivo `fleet.txt` y procesa la información de la flota

## Notas Generales

- El sistema Rent a Car requiere el archivo `fleet.txt` en la raíz del proyecto (paralelo a `src/`).
- Los modos de manejo ajustan la eficiencia según la implementación: Eco `* 1.111111`, Normal `* 1.0`, Sport `* 0.8`.
- Se implementa arquitectura de 3 capas con separación de responsabilidades.
- No se utilizan ciclos anidados según especificación.
- **Manejo de excepciones:** Si algún archivo no se encuentra o hay errores de formato, el sistema muestra mensajes claros y detiene la ejecución para evitar resultados inconsistentes. Usa try-catch para capturar excepciones como `FileNotFoundException` y `IllegalArgumentException`.

## Estado

- [x] Base de estructura
- [x] Implementación completa
- [x] Implementación Problema 1 (Ruteo GUI)
- [x] Implementación Problema 2 (Rent a Car)