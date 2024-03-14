package org.pebiblioteca

class GestorBiblioteca{

    val catalogo = mutableListOf<Libro>()
    val registroPrestamos = mutableMapOf<String, String>()

    fun agregarLibroCatalogo(libro: Libro){
        catalogo.add(libro)
    }

    fun eliminarLibroCatalogo(libro: Libro){
        catalogo.remove(libro)
    }

    fun prestarLibro(libro: Libro){
        if (libro.estado == Estado.DISPONIBLE){
            libro.estado = Estado.PRESTADO
            registroPrestamos[libro.id] = "Libro prestado"
        }else{
            println("El libro: ${libro.titulo} ya esta prestado.")
        }
    }

    fun devolverLibro(libro: Libro){
        if (libro.estado == Estado.PRESTADO){
            libro.estado = Estado.DISPONIBLE
            registroPrestamos[libro.id] = "Libro devuelto"
        }else{
            println("El libro: ${libro.titulo} no ha sido prestado todavía.")
        }
    }

    fun disponibilidad(id: String){

        val libro = buscarLibro(id)

        if (libro != null) {
            if (libro.estado == Estado.DISPONIBLE){
                println("El libro: ${libro.titulo} se encuentra disponible en la biblioteca.")
            }else{
                println("El libro: ${libro.titulo} ha sido prestado y aun no se ha devuelto.")
            }
        }else{
            println("No se encuentra ningún libro con id: $id")
        }

    }

    private fun buscarLibro(id: String) = catalogo.find { libro: Libro -> libro.id == id }

    fun mostrarLibros(){
        println("--------Catálogo de libros--------")
        catalogo.forEach { println(it) }

        println("-----------Disponibles------------")
        mostrarLibrosDisponibles()

        println("------------Prestados-------------")
        mostrarLibrosPrestados()
    }

    private fun mostrarLibrosPrestados(){
        catalogo.forEach { libro ->
            if (libro.estado == Estado.PRESTADO){
                println(libro)
            }
        }
    }

    private fun mostrarLibrosDisponibles(){
        catalogo.forEach { libro ->
            if (libro.estado == Estado.DISPONIBLE){
                println(libro)
            }
        }
    }

}