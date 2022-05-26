object MiLavadora {
    var marca: String = "Miele"
    private set
    var modelo: String = "WCA020 WCS Active"
    private set
    var capacidad: Int = 7
    private set
    var isFull: Boolean = false
    var isActive: Boolean = false
    var detergente: Boolean = false
    var suavizante: Boolean = false
    var isOn: Boolean = false
    private var programa = ProgramaLavadora //mantiene referencia en memoria

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
    var programa = arrayOf <String> ("progRapido", "progNormal", "progLento")
    var progRapido : Boolean = false
    var progNormal : Boolean = false
    var progLento : Boolean = false
  
    fun iniciarPrograma() {
        MiLavadora.isActive = true
    }

    fun detenerPrograma() {
        MiLavadora.isActive = false
    }
}

fun main() {
    EnchufeTomaCorriente.on()
    println("¿está encendida?: ${MiLavadora.isOn}")
    MiLavadora.introducirRopa()
    MiLavadora.sacarRopa()
    CajonDetergenteSuavizante.agregarDetergente()
    CajonDetergenteSuavizante.agregarSuavizante()
    println("¿puse detergente?: ${MiLavadora.detergente}")
    println("¿puse suavizante?: ${MiLavadora.suavizante}")
}
