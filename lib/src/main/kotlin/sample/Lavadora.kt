object MiLavadora {
    var marca: String = "Miele"
    var modelo: String = "WCA020 WCS Active"
    var capacidad: Int = 7
    var isFull: Boolean = false
    var isActive: Boolean = false
    var detergente: Boolean = false
    var suavizante: Boolean = false
    var isOn: Boolean = false

    fun introducirRopa() {
        if (this.capacidad <= 0) {
            println("Tambor lleno,  isFull: ${this.isFull}")
        } else {
            MiLavadora.capacidad = this.capacidad - 1
            println("introduciendo ropa : ${MiLavadora.capacidad}")
        }
    }

    fun sacarRopa() {
        if (this.capacidad <= 0 || this.capacidad > 7) {
            println("Error, no es posible sacar ropa")
        } else {
            MiLavadora.capacidad = this.capacidad + 1
            println("sacando ropa: ${MiLavadora.capacidad}")
        }
    }
}

object EnchufeTomaCorriente {
    var encendida: Boolean = false
    fun on() {
        MiLavadora.isOn = true
    }
    fun off() {
        MiLavadora.isOn = false
    }
}

object CajonDetergenteSuavizante {
    fun agregarSuavizante() {
        MiLavadora.suavizante = true
    }
    fun agregarDetergente() {
        MiLavadora.detergente = true
    }
}

object ProgramaLavadora {
    //     var progRapido : Boolean = false
    //     var progNormal : Boolean = false
    //     var progLento : Boolean = false
    //     val list = listOf("rapido", "normal", "lento")?
    //     fun GetPrograma(x){

    fun iniciarPrograma() {
        MiLavadora.isActive = true
    }

    fun detenerPrograma() {
        MiLavadora.isActive = false
    }
}

fun main() {
    MiLavadora.introducirRopa()
    MiLavadora.sacarRopa()
    CajonDetergenteSuavizante.agregarDetergente()
    CajonDetergenteSuavizante.agregarSuavizante()
    println("¿puse detergente?: ${MiLavadora.detergente}")
    println("¿puse suavizante?: ${MiLavadora.suavizante}")
}
