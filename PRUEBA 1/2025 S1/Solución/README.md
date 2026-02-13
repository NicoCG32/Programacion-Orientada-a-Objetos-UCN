# Solución

**Asignatura**: Programación Orientada a Objetos  
**Periodo**: 2025 Semestre 1  
**Tipo**: Prueba 1

**Estado**: Implementación completa

## Descripción

Solución para el Problema 2 (Music Analytics). El programa carga datos desde archivos de texto, modela bandas, álbumes, canciones y playlists, y entrega los reportes solicitados en la prueba.
- **Fecha**: 29-04-2025
- **Duración**: 3 horas
- **Profesores**: Alejandro Paolini, Cristhian Rabbi

## Explicación Detallada

Para una explicación completa y paso a paso sobre el modelado y los reportes, revisa el archivo [EXPLICACION.md](EXPLICACION.md).

## Ejercicio

### Problema 1: Ruteo (pendiente)
**Problema:** Ruteo de código para indicar la salida esperada y dibujar la situación final de los objetos (sin paso a paso).
**Estado:** Se dejará espacio para adjuntar el enunciado y completar la explicación.

### Problema 2: Music Analytics
**Problema:** Construir un sistema que permita registrar bandas, álbumes, canciones y playlists, y generar reportes de análisis musical.

**Archivos de entrada:**
- bandas.txt
- musica.txt
- playlists.txt
- ejemplos.txt (referencia de salida)

**Reportes requeridos:**
1) Composición de estilos por banda
2) Composición de álbumes por playlist
3) Álbumes agrupados por década (1950-2030)
4) Rating promedio por banda (promedio de ratings de sus canciones)

## Estructura de la Solución

```
Solución/
├── src/
│   └── MusicAnalytics/
│       ├── Main.java       (carga datos y menú)
│       ├── Banda.java      (banda y sus álbumes)
│       ├── Album.java      (álbum y canciones)
│       ├── Cancion.java    (canción con género y rating)
│       └── Playlist.java   (playlist y reportes)
├── README.md
└── EXPLICACION.md
```

## Cómo Cargar y Ejecutar en Eclipse

### Ubicación en el Repositorio
Este código se encuentra en: `Prog. Orientada a Objetos/PRUEBA 1/2025 S1/Solución/src/`

### Opción Recomendada: Copiar la Carpeta `src/`

1. **Obtener los archivos fuente:**
	- Descarga o clona el repositorio `Programacion-Avanzada`
	- Navega a `Prog. Orientada a Objetos/PRUEBA 1/2025 S1/Solución/`
	- Copia SOLO la carpeta `src/` a tu computadora

2. **En Eclipse, crear un nuevo proyecto Java:**
	- `File` → `New` → `Java Project`
	- Nombre: `Prueba1_POO`
	- Selecciona `Create from existing source`
	- Browse → Apunta a la carpeta `src/` que copiaste
	- Finish

3. **Ejecutar el programa:**
	- Clic derecho en `Main.java`
	- `Run As` → `Java Application`
	- Deberías ver el menú de opciones en la consola

### Opción Alternativa: Copiar Archivos Manualmente

1. **Crear un nuevo proyecto Java en Eclipse:**
	- `File` → `New` → `Java Project` → Nombre: `Prueba1_POO` → Finish

2. **Copiar los archivos `.java`:**
	- Abre el Explorador de archivos
	- Ve a `Prog. Orientada a Objetos/PRUEBA 1/2025 S1/Solución/src/MusicAnalytics/`
	- Selecciona todos los archivos `.java`
	- Cópialos y pégalos en la carpeta `src/` de tu proyecto en Eclipse
	- Eclipse pedirá confirmación → Clic "Yes to All"

3. **Ejecutar:**
	- Clic derecho en `Main.java`
	- `Run As` → `Java Application`

## Verificar que Todo Funciona Correctamente

- Al ejecutar `Main.java`, deberías ver el menú principal en la consola:
  ```
  ===== Menú de opciones: =====
  1 - Mostrar composición de géneros por banda
  2 - Mostrar composición de álbumes por playlist
  3 - Mostrar álbumes agrupados por década
  4 - Mostrar rating promedio por banda
  5 - Salir
  Ingrese una opción:
  ```
- Prueba cada opción (1-4) y verifica que la salida sea coherente con los datos de entrada

## Notas

- El sistema asume que los IDs de canciones y bandas existen en los archivos.
- Los porcentajes se calculan sobre el total de canciones consideradas.

## Estado

- [x] Base de estructura
- [x] Implementación completa
