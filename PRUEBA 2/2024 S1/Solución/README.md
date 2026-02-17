# Solución

**Asignatura**: Programación Orientada a Objetos  
**Período**: 2024 Semestre 1  
**Tipo**: Prueba 2

**Estado**: ✅ Implementación completa | ✅ Documentación completa

## Descripción

Esta carpeta contiene la solución de la Prueba 2. Incluye el ruteo del Problema 1 (interfaz y eventos) y el sistema "New Jurassic World" del Problema 2, que procesa dinosaurios desde un archivo de texto y genera los reportes solicitados.
- **Fecha**: 22-06-2024
- **Duración**: 3 horas
- **Profesores**: Alejandro Paolini, Moisés Moraga, Eric Ross
- **Puntaje total**: 1 punto (0.6 para aprobatoria)

## Explicación Detallada

Para una explicación completa y paso a paso sobre el modelado, los reportes y el uso de Visitor, revisa el archivo [EXPLICACIÓN.MD](EXPLICACIÓN.MD).

## Ejercicio

### Problema 1: Ruteo e Interfaz
**Problema:** Ruteo de codigo con Swing e interpretacion de interfaz, botones y cierre de la ventana.
**Estado:** Resuelto y documentado en [EXPLICACIÓN.MD](EXPLICACIÓN.MD).

### Problema 2: New Jurassic World
**Problema:** Modelar dinosaurios (4 especies) y calcular estadisticas globales usando herencia y el patron Visitor.

**Archivo de entrada:**
- fauna.txt

**Archivo de salida de referencia:**
- ejemplo.txt

**Reportes requeridos:**
1) Por hemisferio, cantidad de dinosaurios por especie.
2) Dinosaurio mas pesado, mas alto y mas veloz.
3) Dinosaurio con mayor tasa de adaptacion (segun especie).

## Estructura de la Solución

```
Solución/
├── src/
│   ├── NewJurassicWorld/
│   │   ├── Dominio/
│   │   │   ├── Brachiosaurus.java
│   │   │   ├── Dinosaurio.java
│   │   │   ├── Tiranosaurio.java
│   │   │   ├── Triceratops.java
│   │   │   └── Velociraptor.java
│   │   ├── Factory/
│   │   │   └── DinoFactory.java
│   │   ├── Logica/
│   │   │   ├── App.java
│   │   │   ├── Sistema.java
│   │   │   └── SistemaImpl.java
│   │   └── Visitor/
│   │       ├── DinoVisitor.java
│   │       ├── DinoVisitorCantidadPorEspecie.java
│   │       ├── DinoVisitorMasAtributo.java
│   │       └── DinoVisitorMayorTasa.java
│   └── RuteoGUI/
│       ├── Configurador.java
│       ├── Main.java
│       ├── MiFactory.java
│       ├── MiFactory1.java
│       ├── MiFactory2.java
│       └── Respuestas.md
├── README.md
└── EXPLICACIÓN.MD
```

## Cómo Cargar y Ejecutar en Eclipse

### Ubicación en el Repositorio
Este código se encuentra en: `Prog. Orientada a Objetos/PRUEBA 2/2024 S1/Solución/src/`

### Opción Recomendada: Copiar la Carpeta `src/`

1. **Obtener los archivos fuente:**
   - Descarga o clona el repositorio `Programacion-Avanzada`
   - Navega a `Prog. Orientada a Objetos/PRUEBA 2/2024 S1/Solución/`
   - Copia SOLO la carpeta `src/` a tu computadora

2. **En Eclipse, crear un nuevo proyecto Java:**
   - `File` → `New` → `Java Project`
   - Nombre: `Prueba2_POO`
   - Selecciona `Create from existing source`
   - Browse → Apunta a la carpeta `src/` que copiaste
   - Finish

3. **Ejecutar el programa:**
   - Para el Problema 1: `RuteoGUI/Main.java`
   - Para el Problema 2: `NewJurassicWorld/Logica/App.java`
   - Clic derecho en el archivo → `Run As` → `Java Application`

### Importante: Archivos de Texto

Para que el programa pueda leer los archivos de texto (.txt) correctamente:
- Copia el archivo `fauna.txt` desde `Prog. Orientada a Objetos/PRUEBA 2/2024 S1/` a la raíz de tu proyecto (paralelo a la carpeta `src/`)
- Los archivos requeridos son:
  - `fauna.txt` (información de dinosaurios)
- El programa los buscará en la raíz del proyecto, no dentro de `src/`

### Opción Alternativa: Copiar Archivos Manualmente

1. **Crear un nuevo proyecto Java en Eclipse:**
   - `File` → `New` → `Java Project` → Nombre: `Prueba2_POO` → Finish

2. **Copiar los archivos `.java`:**
   - Abre el Explorador de archivos
   - Ve a `Prog. Orientada a Objetos/PRUEBA 2/2024 S1/Solución/src/`
   - Selecciona todos los archivos `.java`
   - Cópialos y pégalos en la carpeta `src/` de tu proyecto en Eclipse
   - Eclipse pedirá confirmación → Clic "Yes to All"

3. **Ejecutar:**
   - Para el Problema 1: `RuteoGUI/Main.java`
   - Para el Problema 2: `NewJurassicWorld/Logica/App.java`
   - Clic derecho en el archivo → `Run As` → `Java Application`

## Notas

- Se requiere usar herencia, patron Visitor y la arquitectura con `Sistema`.
- Los dinosaurios deben almacenarse en una sola lista.
- Evitar ciclos anidados, usar funciones auxiliares.
- El archivo `fauna.txt` debe estar en la raíz del proyecto (paralelo a `src/`).

## Estado

- [x] Base de estructura
- [x] Implementacion completa
- [x] Documentacion Problema 1 (Ruteo)
- [x] Documentacion Problema 2 (New Jurassic World)