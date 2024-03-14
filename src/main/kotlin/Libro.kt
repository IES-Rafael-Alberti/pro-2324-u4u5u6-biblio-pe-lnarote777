package org.pebiblioteca

data class Libro(val titulo: String, private val autor: String,private val anioPublicacion: Int, private val tematica: String, var estado: Estado = Estado.DISPONIBLE ){

    lateinit var id : String

    init {

        require(titulo.isNotBlank()) {"El título del libro no puede estar vacío."}
        require(anioPublicacion in (1..2024)) {"El año de publicación debe estar entre el año 1 y el 2024."}
        require(autor.isNotBlank()) {"El autor no puede estar en blanco."}
        require(tematica.isNotBlank()) {"Indique la temática por favor."}
    }

}

enum class Estado(){
    DISPONIBLE, PRESTADO
}
