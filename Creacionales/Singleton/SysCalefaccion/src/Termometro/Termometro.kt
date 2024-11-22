package Termometro
import TempHabitacion.TempHabitacion
interface Termometro {
    fun leerTempo(tempActual: TempHabitacion): Double
    fun mostrarTemp(tempActual: TempHabitacion)
}