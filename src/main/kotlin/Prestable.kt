package org.pebiblioteca

interface Prestable<T> {
    fun prestar(elemento : T)
    fun devolver(elemento: T)
}