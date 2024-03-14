package org.pebiblioteca

interface IGestorPrestamos {
    fun registrardevolucion(elemento: Libro)
    fun registrarPrestamo(elemento: Libro)
    fun consultarHistorialLibros(elemento: Libro)
    fun consultarHistorialUsuario(usuario: Usuario)

}