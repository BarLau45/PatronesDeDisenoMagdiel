package Calentador
import java.util.Scanner
import TempHabitacion.TempHabitacion
class CalentadorGas : Calentador {
    var input = Scanner(System.`in`)
    override fun ajustarTempe(tempActual: TempHabitacion) {
        var continuar = true

        while (continuar) {

            println("""
                
                (1) Selecciona una opción:
                
                1. Aumentar temperatura (+2'C)
                2. Atrás
            """.trimIndent())

            var opcion: Int = input.nextInt()

            when (opcion) {
                1 -> {
                    tempActual.setTempActual(tempActual.getTempActual() + 2)
                    println("""
                        ..:: Temperatura aumentada: +2'C ::..
                        --------------------------------
                        Temp. Actual: ${tempActual.getTempActual()}
                    """.trimIndent())
                }

                0 -> {
                    println("Regresando al menú principal")
                    continuar = false
                }
            }
        }
    }
}