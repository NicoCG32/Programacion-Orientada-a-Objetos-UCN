# Explicacion detallada - Programacion Orientada a Objetos

## Objetivo

Construir un sistema que modele bandas, albumes, canciones y playlists, cargue la informacion desde archivos de texto y entregue los reportes solicitados en el problema Music Analytics.

## Ejercicio 1: Ruteo

Espacio reservado para el enunciado, la salida esperada y el diagrama del ruteo.

Lo que se entiende del enunciado:
- Se debe rutear el codigo entregado.
- Indicar la salida esperada.
- Dibujar la situacion final de los objetos al terminar la ejecucion.
- No es necesario detallar todo el paso a paso.

## Modelo de clases

- Banda: tiene id, nombre, ano de fundacion y una lista de Album.
- Album: tiene id, nombre, ano de lanzamiento, lista de Cancion y referencia a su Banda.
- Cancion: tiene id, nombre, duracion en segundos, genero, rating y referencia a su Album.
- Playlist: tiene motivo y una lista de Cancion.

## Paso a paso

### 1) Carga de bandas

Metodo: CargarBandas
- Lee cada linea de bandas.txt
- Separa por comas
- Crea un objeto Banda y lo agrega a la lista

### 2) Carga de musica (albumes y canciones)

Metodo: CargarMusica
- Lee la linea del album (id, nombre, idBanda, ano, cantidad de canciones)
- Busca la Banda por id
- Crea el Album y lo agrega a la Banda
- Lee las N lineas de canciones
- Convierte la duracion mm:ss a segundos
- Crea cada Cancion y la agrega al Album

### 3) Carga de playlists

Metodo: CargarPlaylist
- Lee el encabezado de la playlist (motivo, cantidad de canciones)
- Lee la linea siguiente con los IDs de canciones
- Busca cada Cancion en las bandas/albumes y la agrega a la Playlist

## Reportes

### Reporte 1: Composicion de estilos por banda

Metodo: Banda.MostrarComposicion
- Recorre las canciones de todos los albumes
- Genera una lista de generos unicos
- Cuenta cuantas canciones hay por genero
- Calcula porcentaje sobre el total y lo imprime

### Reporte 2: Composicion de albumes por playlist

Metodo: Playlist.MostrarComposicion
- Genera la lista de albumes unicos presentes en la playlist
- Cuenta cuantas canciones pertenecen a cada album
- Calcula porcentaje sobre el total de canciones de la playlist

### Reporte 3: Albumes por decada

Metodo: MostrarAlbumesPorDecada
- Junta todos los albumes en una lista
- Ordena por ano de lanzamiento
- Agrupa por decada (ano / 10 * 10)
- Imprime cada album con banda y ano

### Reporte 4: Rating promedio por banda

Metodo: Banda.calcularRating
- Calcula el promedio de rating de cada album (promedio de sus canciones)
- Promedia los ratings de los albumes de la banda
- Imprime el resultado

## Observaciones

- El programa espera que los archivos de entrada esten en la carpeta de ejecucion.
- Si un ID no existe, se lanza una excepcion con mensaje descriptivo.
