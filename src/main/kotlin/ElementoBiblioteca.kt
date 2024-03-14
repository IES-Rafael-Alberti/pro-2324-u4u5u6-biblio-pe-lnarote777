package org.pebiblioteca

abstract class ElementoBiblioteca {
    abstract val id : String
    var estado : Estado = Estado.DISPONIBLE
}