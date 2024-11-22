import UI.Menu
import Calentador.*
import TempHabitacion.Regulador
import TempHabitacion.TempHabitacion
import Termometro.*
import java.util.Scanner

fun main() {
    var input = Scanner(System.`in`)
    var tempActual: TempHabitacion = TempHabitacion.getInstance()
    val calentador = CalentadorGas()
    val termometro = TermometroDigital()
    var regulador: Regulador = Regulador.getInstance()

    regulador.setMaxTemp(38.5)
    regulador.setMinTemp(17.5)
    tempActual.setTempActual(29.5)

    val menu: Menu = Menu()
    menu.mostrarMenu()
}