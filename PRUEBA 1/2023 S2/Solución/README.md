# Solución

**Asignatura**: Programación Orientada a Objetos  
**Período**: 2023 Semestre 2  
**Tipo**: Prueba 1

**Estado**: ✅ Implementación completa | ⚠️ Documentación en proceso

## Descripción

Solución de la Prueba 1 con dos partes: el ruteo del Problema 1 y el sistema de gestión UCN del Problema 2. Incluye el menú, la lógica de contratos (roles), unidades y reportes solicitados en el enunciado.
- **Fecha**: 21-10-2023
- **Duración**: 6 horas
- **Profesores**: Alejandro Paolini, Eric Ross
- **Puntaje total**: 100 puntos (60 para aprobatoria)

## Explicación Detallada

Para una explicación completa del modelado y los reportes, revisa [EXPLICACIÓN.MD](EXPLICACIÓN.MD).

## Ejercicio

### Problema 1: Ruteo
**Problema:** Ruteo de un sistema de trenes y vagones (carga y pasajeros) con operaciones de agregar, eliminar, subir y bajar pasajeros.  
**Estado:** ✅ Código implementado en [src/Ruteo/Main.java](src/Ruteo/Main.java) | ⚠️ Explicación detallada pendiente.

### Problema 2: Gestión UCN
**Problema:** Construir un sistema que registre personas, unidades y roles por períodos de tiempo, y genere reportes de gestión.

**Acciones del menú:**
1) Agregar persona
2) Agregar unidad
3) Asociar persona a unidad entre fechas
4) Reportabilidad
5) Terminar simulación

**Reportes requeridos:**
1) Cargos por persona según fecha
2) Personas en cada unidad según fecha
3) Historial de una persona por RUT
4) Roles cumplidos por unidad
5) Estadísticas generales
   - Persona con más antigüedad
   - Persona con más roles

## Estructura de la Solución

```
Solución/
├── src/
│   ├── Ruteo/
│   │   ├── Main.java
│   │   ├── Tren.java
│   │   ├── VagonCarga.java
│   │   └── VagonPasajero.java
│   └── GestionUCN/
│       ├── Main.java
│       ├── Persona.java
│       ├── Unidad.java
│       ├── Contrato.java
│       └── Fecha.java
├── README.md
└── EXPLICACIÓN.MD
```

## Cómo Cargar y Ejecutar en Eclipse

### Ubicación en el Repositorio
Este código se encuentra en: `Prog. Orientada a Objetos/PRUEBA 1/2023 S2/Solución/src/`

### Opción Recomendada: Copiar la Carpeta `src/`

1. **Obtener los archivos fuente:**
   - Descarga o clona el repositorio `Programacion-Avanzada`
   - Navega a `Prog. Orientada a Objetos/PRUEBA 1/2023 S2/Solución/`
   - Copia SOLO la carpeta `src/` a tu computadora

2. **En Eclipse, crear un nuevo proyecto Java:**
   - `File` → `New` → `Java Project`
   - Nombre: `Prueba1_POO`
   - Selecciona `Create from existing source`
   - Browse → Apunta a la carpeta `src/` que copiaste
   - Finish

3. **Ejecutar el programa:**
   - Para el ruteo: clic derecho en `Ruteo/Main.java` → `Run As` → `Java Application`
   - Para la gestión UCN: clic derecho en `GestionUCN/Main.java` → `Run As` → `Java Application`

### Opción Alternativa: Copiar Archivos Manualmente

1. **Crear un nuevo proyecto Java en Eclipse:**
   - `File` → `New` → `Java Project` → Nombre: `Prueba1_POO` → Finish

2. **Copiar los archivos `.java`:**
   - Abre el Explorador de archivos
   - Ve a `Prog. Orientada a Objetos/PRUEBA 1/2023 S2/Solución/src/`
   - Copia las carpetas `Ruteo` y `GestionUCN` dentro del `src/` de tu proyecto
   - Eclipse pedirá confirmación → Clic "Yes to All"

3. **Ejecutar:**
   - Clic derecho en `Ruteo/Main.java` o `GestionUCN/Main.java`
   - `Run As` → `Java Application`

## Verificar que Todo Funciona Correctamente

- Al ejecutar `GestionUCN/Main.java`, deberías ver el menú principal en la consola:
  ```
  ¿Qué desea realizar?
  1) Agregar persona
  2) Agregar Unidad
  3) Asociar Persona A Unidad
  4) Reportabilidad
  5) Terminar simulación
  ```
- El ruteo imprime el estado de los vagones antes y después de las operaciones.

## Notas

- El sistema de Gestión UCN funciona por consola y no requiere archivos de entrada.
- Las fechas se ingresan en formato DD/MM/AAAA.

## Estado

- [x] Base de estructura
- [x] Implementación completa
- [x] Documentación Problema 2 (Gestión UCN)
- [ ] Documentación Problema 1 (Ruteo)