package org.pebiblioteca

open class RegistroPrestamos : IGestorPrestamos{
    private val registroPrestamos = mutableListOf<Libro>()
    private val historial = mutableMapOf<String, String>()

    override fun consultarHistorialUsuario(usuario: Usuario){
        usuario.librosPrestados.forEach { println(it) }
    }

    override fun registrardevolucion(libro: Libro) {
        registroPrestamos.add(libro)
        historial[libro.id] = "Libro devuelto"
    }

    override fun registrarPrestamo(libro: Libro) {
        registroPrestamos.add(libro)
        historial[libro.id] = "Libro prestado"
    }

    override fun consultarHistorialLibros(libro: Libro) {
        val librosPrestados = historial.filter { it.key == libro.id }
        println(librosPrestados)
    }

}