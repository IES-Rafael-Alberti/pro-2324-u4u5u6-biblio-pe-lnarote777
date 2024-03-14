package org.pebiblioteca

data class Libro(val titulo: String, val autor: String, val anioPublicacion: Int, val tematica: String, var estado: Estado = Estado.DISPONIBLE ){

    val id = generarId()

    companion object{

        fun generarId(): String{

            val num1 = String.format("%03d", (1..300).random())
            val num2 = String.format("%03d", (1..300).random())

            return "$num1-$num2"
        }

    }

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
