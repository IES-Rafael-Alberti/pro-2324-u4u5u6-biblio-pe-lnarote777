package org.pebiblioteca

open class GestorBiblioteca: UtilidadesBiblioteca() {

    companion object{
        val registroPrestamos = RegistroPrestamos()
        val catalogo = mutableListOf<Libro>()
    }

    fun agregarLibroCatalogo(libro: Libro){

        libro.id = generarIdentificadorUnico()

        catalogo.add(libro)
    }

    fun eliminarLibroCatalogo(libro: Libro){
        catalogo.remove(libro)
    }

    fun prestarLibro(libro: Libro, usuario: Usuario){
        if (libro.estado == Estado.DISPONIBLE){
            libro.estado = Estado.PRESTADO

            usuario.agregarLibroPrestado(libro)
            registroPrestamos.registrarPrestamo(libro)
        }else{
            println("El libro: ${libro.titulo} ya esta prestado.")
        }

    }

    fun devolverLibro(libro: Libro, usuario: Usuario){
        if (libro.estado == Estado.PRESTADO){
            libro.estado = Estado.DISPONIBLE

            usuario.devolverLibro(libro)
            registroPrestamos.libroDevuelto(libro)
        }else{
            println("El libro: ${libro.titulo} no ha sido prestado todavía.")
        }
    }

    fun disponibilidad(id: String){

        val libro = buscarLibro(id)

        if (libro != null) {
            if (libro.estado == Estado.DISPONIBLE){
                println("El libro: '${libro.titulo}' se encuentra disponible en la biblioteca.")
            }else{
                println("El libro: '${libro.titulo}' ha sido prestado y aun no se ha devuelto.")
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