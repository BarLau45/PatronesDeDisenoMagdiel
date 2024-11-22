package UI
import Calentador.*
import TempHabitacion.*
import Termometro.*
import java.util.Scanner

class Menu {
    var input = Scanner(System.`in`)
    var tempActual: TempHabitacion = TempHabitacion.getInstance()
    val calentador = CalentadorGas()
    val termometro = TermometroDigital()
    private val regulador: Regulador = Regulador.getInstance()

    fun mostrarMenu() {
        var continuar = true

        while (continuar) {
            println("""
                ..:: Sistema de calefacción ::..
                Temp Actual: ${tempActual.getTempActual()}
                
                Seleccione una opción: 
                1. Interfaz Calentador
                2. Revisar termómetro
                3. Calibrar temperatura
                0. Salir
                
            """.trimIndent())

            var opcion: Int = input.nextInt()

            when (opcion) {
                1 -> {
                    calentador.ajustarTempe(tempActual)
                }

                2 -> {
                    termometro.mostrarTemp(tempActual)
                }

                3 -> {
                    regulador.calibrarTemp(termometro, tempActual)
                }

                0 -> {
                    println("""
                        Saliendo... ¡Hecho!
                    """.trimIndent())
                    continuar = false
                }
                else -> {
                    println("Opción no válida, intente nuevamente")
                }

            }
        }
        input.close()
    }
}