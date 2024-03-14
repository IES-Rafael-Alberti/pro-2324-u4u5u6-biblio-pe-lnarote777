package org.pebiblioteca

open class UtilidadesBiblioteca {

    companion object{

        fun generarIdentificadorUnico(): String{

            val num1 = String.format("%03d", (1..300).random())
            val num2 = String.format("%03d", (1..300).random())

            return "$num1-$num2"
        }

    }

}