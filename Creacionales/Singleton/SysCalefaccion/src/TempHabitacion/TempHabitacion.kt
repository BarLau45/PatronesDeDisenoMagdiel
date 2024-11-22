package TempHabitacion

class TempHabitacion private constructor() {
    private var tempActual: Double = 0.0

    companion object {
        private var instance: TempHabitacion? = null
        fun getInstance(): TempHabitacion {
            if (instance == null) {
                return TempHabitacion()
            }
            return instance!!
        }
    }


    fun setTempActual(tempActual: Double) {
        this.tempActual = tempActual
    }

    fun getTempActual(): Double {
        return tempActual
    }
}