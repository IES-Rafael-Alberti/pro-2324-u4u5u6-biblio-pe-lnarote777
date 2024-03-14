package org.pebiblioteca

interface Catalogo {
    fun agregarAlCatalogo(elemento: Libro)
    fun eliminarDelCatalogo(elemento: Libro)
}