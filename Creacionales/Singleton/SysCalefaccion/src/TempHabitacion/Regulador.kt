package TempHabitacion

import Calentador.Calentador
import Termometro.Termometro

class Regulador private constructor() {
    private var maxTemp: Double = 0.0
    private var minTemp: Double = 0.0

    companion object {
        private var instance: Regulador? = null

        fun getInstance(): Regulador {
            if (instance == null) {
                instance = Regulador()
            }
            return instance!!
        }
    }
    fun getMaxTemp(): Double {
        return maxTemp
    }

    fun setMaxTemp(maxTemp: Double) {
        this.maxTemp = maxTemp
    }

    fun getMinTemp(): Double {
        return minTemp
    }

    fun setMinTemp(minTemp: Double) {
        this.minTemp = minTemp
    }

    fun tempPromedio(maxTemp: Double, minTemp: Double): Double {
        return (maxTemp - minTemp) / 2
    }

    fun calibrarTemp(termometro: Termometro, tempActual: TempHabitacion) {
        if(termometro.leerTempo(tempActual) > maxTemp || termometro.leerTempo(tempActual) < minTemp) {
            println("""
                (!) TEMPERATURA FUERA DEL RANGO (!)
                
                Calibrando...
                Temperatura reestablecida a: ${tempPromedio(maxTemp, minTemp)}
            """.trimIndent())
            tempActual.setTempActual(tempPromedio(maxTemp, minTemp))
        } else {
            println("""
                Temperatura dentro de rango permitido, no hay nada que hacer.
            """.trimIndent())
        }
    }

}