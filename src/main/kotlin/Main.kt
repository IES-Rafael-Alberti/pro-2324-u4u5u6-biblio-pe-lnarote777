package org.pebiblioteca

fun main() {

    val biblioteca = GestorBiblioteca()

    //Libros
    val libro1 = Libro( "Bruma Roja", "Isabel", 2023, "Fantasía")
    val libro2 = Libro( "Yumi y el pintor de pesadillas", "Brandon Sanderson", 2022, "Fantasía")
    val libro3 = Libro( "Harry Poter y la piedra filosofal", "JK", 1990, "Magos")

    //usuarios
    val juan = Usuario("2112", "Juan")
    val ana = Usuario("4223", "Ana")
    val antonio = Usuario("6541", "Antonio")

    //añadir libros al catálogo
    biblioteca.agregarLibroCatalogo(libro1)
    biblioteca.agregarLibroCatalogo(libro2)
    biblioteca.agregarLibroCatalogo(libro3)

    //prestar libros
    biblioteca.prestarLibro(libro1, juan)
    biblioteca.prestarLibro(libro2, ana)
    biblioteca.prestarLibro(libro1, antonio)

    //devolver libros
    biblioteca.devolverLibro(libro1, juan)
    biblioteca.devolverLibro(libro3, ana)

    




}