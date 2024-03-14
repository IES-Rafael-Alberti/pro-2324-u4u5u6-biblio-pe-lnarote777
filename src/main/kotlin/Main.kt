package org.pebiblioteca

fun main() {

    val biblioteca = GestorBiblioteca()

    val libro1 = Libro( "8723","Bruma Roja", "Isabel", 2023, "Fantasía")
    val libro2 = Libro( "8756","Yumi y el pintor de pesadillas", "Brandon Sanderson", 2022, "Fantasía")
    val libro3 = Libro( "4239","Harry Poter y la piedra filosofal", "JK", 1990, "Magos")

    //añadir libros al catálogo
    biblioteca.agregarLibroCatalogo(libro1)
    biblioteca.agregarLibroCatalogo(libro2)
    biblioteca.agregarLibroCatalogo(libro3)

    //prestar libros
    biblioteca.prestarLibro(libro1)
    biblioteca.prestarLibro(libro3)
    biblioteca.prestarLibro(libro1)

    //devolver libros
    biblioteca.devolverLibro(libro3)
    biblioteca.devolverLibro(libro2)

    //estado actual de los libros
    biblioteca.disponibilidad(libro1.id)
    biblioteca.disponibilidad(libro2.id)
    biblioteca.disponibilidad(libro3.id)

    //mostrar libros
    biblioteca.mostrarLibros()




}