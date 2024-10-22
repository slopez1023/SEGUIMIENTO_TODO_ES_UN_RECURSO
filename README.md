# Proyecto: Seguimiento principio "Todo es un recurso"

## Descripción
Este proyecto sigue el principio REST de que todo es un recurso. Cada recurso es accesible a través de un URI único y puede ser recuperado usando el método HTTP GET.

### Estructura del proyecto
Dentro de `resources/static/` se encuentran las carpetas para los distintos tipos de archivos:
- `imagenes/`: Archivos de imágenes (.jpg, .png)
- `html/`: Archivos HTML (.html)
- `xml/`: Archivos XML (.xml)
- `pdf/`: Archivos PDF (.pdf)
- `json/`: Archivos JSON (.json)

### Ejemplos de uso
- Para cargar una imagen:  
  `GET` http://localhost:8080/apiarchivos/imagen/{nombre}
  Ejemplo: `http://localhost:8080/apiarchivos/imagen/logo`

- Para cargar un archivo HTML:  
  `GET` http://localhost:8080/apiarchivos/html/{nombre}
  Ejemplo: `http://localhost:8080/apiarchivos/html/persona`

- Para cargar un archivo XML:  
  `GET` http://localhost:8080/apiarchivos/xml/{nombre}
  Ejemplo: `http://localhost:8080/apiarchivos/xml/persona`

- Para cargar un archivo PDF:  
  `GET` http://localhost:8080/apiarchivos/pdf/{nombre}
  Ejemplo: `http://localhost:8080/apiarchivos/pdf/Strategy Pattern`

- Para cargar un archivo JSON:  
  `GET` http://localhost:8080/apiarchivos/json/{nombre}
  Ejemplo: `http://localhost:8080/apiarchivos/json/persona`
