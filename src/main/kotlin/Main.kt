package org.pebiblioteca

fun main() {

    val registroPrestamos = RegistroPrestamos()
    val biblioteca = GestorBiblioteca(registroPrestamos)

    //Libros
    val libro = Libro( "Bruma Roja", "Isabel", 2023, "Fantasía")
    val libro2 = Libro( "Harry Poter y la piedra filosofal", "JK", 1990, "Magos")

    //usuarios
    val juan = Usuario("2112", "Juan")
    val ana = Usuario("4223", "Ana")
    val antonio = Usuario("6541", "Antonio")

    //añadir libros al catálogo
    biblioteca.agregarAlCatalogo(libro2)
    biblioteca.agregarAlCatalogo(libro)

    //prestar libros
    biblioteca.prestarLibro(libro, juan)
    biblioteca.prestarLibro(libro2, ana)

    //devolver libros
    biblioteca.devolverLibro(libro, juan)
    biblioteca.devolverLibro(libro2, ana)






}