package org.pebiblioteca


data class Dvd(val titulo: String, val tematica: String, val tipo: String): ElementoBiblioteca() {

    override lateinit var id : String

}
