package com.example.archivosapi.controller;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MimeTypeUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

/**
 * ArchivoController es un controlador REST que permite la descarga de diferentes tipos de archivos
 * (imágenes, HTML, XML, PDF y JSON) almacenados en las carpetas estáticas de la aplicación.
 */
@RestController
@RequestMapping("/apiarchivos")
public class ArchivoController {

    /**
     * Método para obtener una imagen PNG desde la carpeta "static/imagenes/".
     *
     * @param nombre El nombre de la imagen (sin la extensión .png).
     * @return Si el archivo existe, devuelve un ResponseEntity con la imagen PNG y el tipo MIME "image/jpeg".
     *         Si no existe, devuelve un estado 404 (Not Found).
     * @throws IOException Si ocurre un error al intentar acceder al archivo.
     */
    @GetMapping("/imagen/{nombre}")
    public ResponseEntity<Resource> obtenerImagen(@PathVariable String nombre) throws IOException {
        // Carga la imagen desde el directorio "static/imagenes/" con extensión .png
        Resource resource = new ClassPathResource("static/imagenes/" + nombre + ".png");

        // Verifica si el archivo existe
        if (resource.exists()) {
            // Devuelve la imagen con el encabezado Content-Type adecuado (imagen PNG)
            return ResponseEntity.ok()
                    .header(HttpHeaders.CONTENT_TYPE, MimeTypeUtils.IMAGE_JPEG_VALUE)
                    .body(resource);
        } else {
            // Si el archivo no existe, devuelve un estado 404
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
    }

    /**
     * Método para obtener un archivo HTML desde la carpeta "static/html/".
     *
     * @param nombre El nombre del archivo HTML (sin la extensión .html).
     * @return Si el archivo existe, devuelve un ResponseEntity con el contenido HTML y el tipo MIME "text/html".
     *         Si no existe, devuelve un estado 404 (Not Found).
     * @throws IOException Si ocurre un error al intentar acceder al archivo.
     */
    @GetMapping("/html/{nombre}")
    public ResponseEntity<Resource> obtenerHtml(@PathVariable String nombre) throws IOException {
        // Carga el archivo HTML desde el directorio "static/html/" con extensión .html
        Resource resource = new ClassPathResource("static/html/" + nombre + ".html");

        // Verifica si el archivo existe
        if (resource.exists()) {
            // Devuelve el archivo HTML con el encabezado Content-Type adecuado (HTML)
            return ResponseEntity.ok()
                    .header(HttpHeaders.CONTENT_TYPE, MimeTypeUtils.TEXT_HTML_VALUE)
                    .body(resource);
        } else {
            // Si el archivo no existe, devuelve un estado 404
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
    }

    /**
     * Método para obtener un archivo XML desde la carpeta "static/xml/".
     *
     * @param nombre El nombre del archivo XML (sin la extensión .xml).
     * @return Si el archivo existe, devuelve un ResponseEntity con el contenido XML y el tipo MIME "application/xml".
     *         Si no existe, devuelve un estado 404 (Not Found).
     * @throws IOException Si ocurre un error al intentar acceder al archivo.
     */
    @GetMapping("/xml/{nombre}")
    public ResponseEntity<Resource> obtenerXml(@PathVariable String nombre) throws IOException {
        // Carga el archivo XML desde el directorio "static/xml/" con extensión .xml
        Resource resource = new ClassPathResource("static/xml/" + nombre + ".xml");

        // Verifica si el archivo existe
        if (resource.exists()) {
            // Devuelve el archivo XML con el encabezado Content-Type adecuado (XML)
            return ResponseEntity.ok()
                    .header(HttpHeaders.CONTENT_TYPE, MimeTypeUtils.APPLICATION_XML_VALUE)
                    .body(resource);
        } else {
            // Si el archivo no existe, devuelve un estado 404
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
    }

    /**
     * Método para obtener un archivo PDF desde la carpeta "static/pdf/".
     *
     * @param nombre El nombre del archivo PDF (sin la extensión .pdf).
     * @return Si el archivo existe, devuelve un ResponseEntity con el contenido PDF y el tipo MIME "application/pdf".
     *         Si no existe, devuelve un estado 404 (Not Found).
     * @throws IOException Si ocurre un error al intentar acceder al archivo.
     */
    @GetMapping("/pdf/{nombre}")
    public ResponseEntity<Resource> obtenerPdf(@PathVariable String nombre) throws IOException {
        // Carga el archivo PDF desde el directorio "static/pdf/" con extensión .pdf
        Resource resource = new ClassPathResource("static/pdf/" + nombre + ".pdf");

        // Verifica si el archivo existe
        if (resource.exists()) {
            // Devuelve el archivo PDF con el encabezado Content-Type adecuado (PDF)
            return ResponseEntity.ok()
                    .header(HttpHeaders.CONTENT_TYPE, "application/pdf")
                    .body(resource);
        } else {
            // Si el archivo no existe, devuelve un estado 404
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
    }

    /**
     * Método para obtener un archivo JSON desde la carpeta "static/json/".
     *
     * @param nombre El nombre del archivo JSON (sin la extensión .json).
     * @return Si el archivo existe, devuelve un ResponseEntity con el contenido JSON y el tipo MIME "application/json".
     *         Si no existe, devuelve un estado 404 (Not Found).
     * @throws IOException Si ocurre un error al intentar acceder al archivo.
     */
    @GetMapping("/json/{nombre}")
    public ResponseEntity<Resource> obtenerJson(@PathVariable String nombre) throws IOException {
        // Carga el archivo JSON desde el directorio "static/json/" con extensión .json
        Resource resource = new ClassPathResource("static/json/" + nombre + ".json");

        // Verifica si el archivo existe
        if (resource.exists()) {
            // Devuelve el archivo JSON con el encabezado Content-Type adecuado (JSON)
            return ResponseEntity.ok()
                    .header(HttpHeaders.CONTENT_TYPE, MimeTypeUtils.APPLICATION_JSON_VALUE)
                    .body(resource);
        } else {
            // Si el archivo no existe, devuelve un estado 404
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
    }
}
