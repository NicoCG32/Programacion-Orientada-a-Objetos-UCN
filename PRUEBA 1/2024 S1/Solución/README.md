# Solución

**Asignatura**: Programación Orientada a Objetos  
**Período**: 2024 Semestre 1  
**Tipo**: Prueba 1

**Estado**: ✅ Implementación completa | ✅ Documentación completa

## Descripción

Esta carpeta contiene las soluciones de la Prueba 1: el ruteo del Problema 1 y el simulador de Mapaches Celulares del Problema 2. El programa carga datos desde archivos de texto, modela el tablero y los mapaches, y entrega la salida en el formato solicitado.

## Explicación Detallada

Para una explicación completa y paso a paso sobre el ruteo, el modelado y la logica del juego, revisa el archivo [EXPLICACIÓN.MD](EXPLICACIÓN.MD).

## Ejercicio

### Problema 1: Ruteo
**Problema:** Ruteo de codigo para indicar la salida esperada y dibujar la situacion final de los objetos.
**Estado:** Resuelto y documentado en [EXPLICACIÓN.MD](EXPLICACIÓN.MD).

### Problema 2: Mapaches Celulares
**Problema:** Simular una batalla de mapaches en un tablero por turnos, con movimientos, alimentacion y consultas de informacion.

**Archivos de entrada:**
- mapaches_posiciones.txt
- mapaches.txt
- ejemplos.txt (referencia de salida)

## Estructura de la Solución

```
Solución/
├── src/
│   ├── MapachesCelulares/
│   │   ├── Main.java       (carga archivos y menu)
│   │   ├── Mapa.java       (tablero, turnos y reglas)
│   │   └── Mapache.java    (entidad mapache)
│   └── Ruteo/
│       ├── App.java        (main del ruteo)
│       ├── ClubDeYates.java
│       └── Velero.java
├── README.md
└── EXPLICACIÓN.MD
```

## Cómo Cargar y Ejecutar en Eclipse

### Ubicación en el Repositorio
Este codigo se encuentra en: `Prog. Orientada a Objetos/PRUEBA 1/2024 S1/Solución/src/`

### Opción Recomendada: Copiar la Carpeta `src/`

1. **Obtener los archivos fuente:**
	- Descarga o clona el repositorio `Programacion-Avanzada`
	- Navega a `Prog. Orientada a Objetos/PRUEBA 1/2024 S1/Solución/`
	- Copia SOLO la carpeta `src/` a tu computadora

2. **En Eclipse, crear un nuevo proyecto Java:**
	- `File` → `New` → `Java Project`
	- Nombre: `Prueba1_POO`
	- Selecciona `Create from existing source`
	- Browse → Apunta a la carpeta `src/` que copiaste
	- Finish

3. **Ejecutar el programa:**
	- Clic derecho en `App.java` (ruteo) o `Main.java` (mapaches)
	- `Run As` → `Java Application`

### Opción Alternativa: Copiar Archivos Manualmente

1. **Crear un nuevo proyecto Java en Eclipse:**
	- `File` → `New` → `Java Project` → Nombre: `Prueba1_POO` → Finish

2. **Copiar los archivos `.java`:**
	- Abre el Explorador de archivos
	- Ve a `Prog. Orientada a Objetos/PRUEBA 1/2024 S1/Solución/src/`
	- Selecciona todos los archivos `.java`
	- Copialos y pegalos en la carpeta `src/` de tu proyecto en Eclipse
	- Eclipse pedira confirmacion → Clic "Yes to All"

3. **Ejecutar:**
	- Clic derecho en `App.java` o `Main.java`
	- `Run As` → `Java Application`

## Verificar que Todo Funciona Correctamente

- En el ruteo, `App.java` imprime las posiciones finales de los veleros en puerto y bahia.
- En Mapaches Celulares, `Main.java` muestra el tablero y el menu de acciones por turno.

## Notas

- Los archivos de entrada deben estar disponibles en la ruta esperada por el programa (ver constantes en `Main.java`).
- Si usas las carpetas del repositorio, puedes mover los txt a una carpeta `TxtMapache/` o ajustar la ruta en el codigo.

## Estado

- [x] Base de estructura
- [ ] Implementación completa
- [x] Documentación Problema 1 (Ruteo)
- [ ] Documentación Problema 2 (Mapaches Celulares)