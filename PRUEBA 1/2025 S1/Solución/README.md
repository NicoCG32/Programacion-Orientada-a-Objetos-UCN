# Solucion

**Asignatura**: Programacion Orientada a Objetos  
**Periodo**: 2025 Semestre 1  
**Tipo**: Prueba 1

**Estado**: Implementacion completa

## Descripcion

Solucion para el Problema 2 (Music Analytics). El programa carga datos desde archivos de texto, modela bandas, albumes, canciones y playlists, y entrega los reportes solicitados en la prueba.
- **Fecha**: 29-04-2025
- **Duracion**: 3 horas
- **Profesores**: Alejandro Paolini, Cristhian Rabbi

## Explicacion Detallada

Para una explicacion completa y paso a paso sobre el modelado y los reportes, revisa el archivo [EXPLICACION.md](EXPLICACION.md).

## Ejercicio

### Problema 1: Ruteo (pendiente)
**Problema:** Ruteo de codigo para indicar la salida esperada y dibujar la situacion final de los objetos (sin paso a paso).
**Estado:** Se dejara espacio para adjuntar el enunciado y completar la explicacion.

### Problema 2: Music Analytics
**Problema:** Construir un sistema que permita registrar bandas, albumes, canciones y playlists, y generar reportes de analisis musical.

**Archivos de entrada:**
- bandas.txt
- musica.txt
- playlists.txt
- ejemplos.txt (referencia de salida)

**Reportes requeridos:**
1) Composicion de estilos por banda
2) Composicion de albumes por playlist
3) Albumes agrupados por decada (1950-2030)
4) Rating promedio por banda (promedio de ratings de sus canciones)

## Estructura de la Solucion

```
Solucion/
├── src/
│   └── MusicAnalytics/
│       ├── Main.java       (carga datos y menu)
│       ├── Banda.java      (banda y sus albumes)
│       ├── Album.java      (album y canciones)
│       ├── Cancion.java    (cancion con genero y rating)
│       └── Playlist.java   (playlist y reportes)
├── README.md
└── EXPLICACION.md
```

## Como Cargar y Ejecutar en Eclipse

### Opcion 1: Importar como Proyecto Existente

1. **Crear una carpeta del proyecto:**
	- Copia toda la carpeta `Solucion/` a una ubicacion accesible
	- Renombrala a algo mas descriptivo, ej: `Prueba1_POO`

2. **Abrir Eclipse y crear un nuevo proyecto Java:**
	- `File` → `New` → `Java Project`
	- Nombre del proyecto: `Prueba1_POO`
	- Sol project contents: `Create from existing source`
	- Browse → Selecciona la carpeta que copiaste
	- Finish

3. **Lo que Eclipse deberia detectar:**
	- Una carpeta `src/` con los archivos Java
	- Eclipse automaticamente compilara los archivos

4. **Ejecutar el programa:**
	- Click derecho en `Main.java` en el Project Explorer
	- `Run As` → `Java Application`

### Opcion 2: Importar la Carpeta `src/` Directamente

1. **En Eclipse, crear un nuevo Java Project:**
	- `File` → `New` → `Java Project`
	- Nombre: `Prueba1_POO`
	- Finish

2. **Copiar archivos fuente:**
	- En el Project Explorer, expande el proyecto
	- Click derecho en la carpeta `src/` (dentro del proyecto)
	- `Import` → `File System`
	- Selecciona la carpeta `src/` de esta solucion
	- Finish

3. **Ejecutar:**
	- Click derecho en `Main.java`
	- `Run As` → `Java Application`

### Opcion 3: Copiar y Pegar Archivos Manualmente

1. **Crear proyecto Java:**
	- `File` → `New` → `Java Project` → Nombre: `Prueba1_POO` → Finish

2. **Copiar archivos:**
	- Abre el Explorador de archivos
	- Ve a la carpeta `src/` de esta solucion
	- Selecciona todos los archivos `.java`
	- Copialos y pegalos en `Prueba1_POO/src/` en Eclipse
	- Eclipse te pedira confirmar → Click "Yes to All"

3. **Ejecutar:**
	- Click derecho en `Main.java`
	- `Run As` → `Java Application`

## Verificar que Todo Funciona

- En la consola deberias ver el menu con las 4 opciones de reporte.
- Selecciona una opcion (1-4) y verifica la salida.

## Notas

- El sistema asume que los IDs de canciones y bandas existen en los archivos.
- Los porcentajes se calculan sobre el total de canciones consideradas.

## Estado

- [x] Base de estructura
- [x] Implementacion completa
