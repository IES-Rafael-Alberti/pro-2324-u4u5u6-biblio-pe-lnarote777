package org.pebiblioteca

class Usuario(val id: String, val nombre : String) {

    val librosPrestados = mutableListOf<Libro>()

    fun agregarLibroPrestado(libro: Libro){
        librosPrestados.add(libro)
    }

    fun devolverLibro(libro: Libro){
        librosPrestados.remove(libro)
    }

    fun listarLibros(){
        librosPrestados.forEach { println("-${it.titulo}") }
    }

}