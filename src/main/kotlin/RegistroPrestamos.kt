package org.pebiblioteca

open class RegistroPrestamos {
    private val registroPrestamos = mutableListOf<Libro>()
    private val historial = mutableMapOf<String, String>()

    fun registrarPrestamo(libro: Libro){
        registroPrestamos.add(libro)
        historial[libro.id] = "Libro prestado"
    }

    fun libroDevuelto(libro: Libro){
        registroPrestamos.add(libro)
        historial[libro.id] = "Libro devuelto"
    }

    fun consultarPrestamosLibro(libro: Libro){
        val librosPrestados = historial.filter { it.key == libro.id }
        println(librosPrestados)
    }

    fun consultarHistorialUsuario(usuario: Usuario){
        usuario.librosPrestados.forEach { println(it) }
    }

}