

import MiLavadora
import CajonDetergenteSuavizante
import EnchufeTomaCorriente

object MiLavadora {
    var marca: String = "Miele"
    var modelo: String = "WCA020 WCS Active"
    var capacidad: Int = 7
    var isFull: Boolean = false
    var isActive: Boolean = false

    fun introducirRopa(){
        if(this.capacidad <= 0 ){
            println("Tambor lleno, alcanzó la capacidad máxima") 
        }else{
            MiLavadora.capacidad = this.capacidad -1
            println("introduciendo ropa : ${MiLavadora.capacidad}")
        } 
    }

    fun sacarRopa(){
        if(this.capacidad <= 0 || this.capacidad >7){
            println("Error, no es posible sacar ropa") 
        }else{
            MiLavadora.capacidad = this.capacidad +1
            println("sacando ropa: ${MiLavadora.capacidad}")
        }
    }
 }

 object EnchufeTomaCorriente {
    var encendida: Boolean = false
    fun encender(){
        EnchufeTomaCorriente.encendida = true
    }
    fun apagar(){
        EnchufeTomaCorriente.encendida = false
    }
 }
    

object CajonDetergenteSuavizante{
    var detergente: Boolean = false
    var suavizante: Boolean = false
    fun agregarSuavizante(){
        CajonDetergenteSuavizante.suavizante = true
    }
    fun agregarDetergente(){
        CajonDetergenteSuavizante.detergente = true
    }
}

// object ProgramaLavadora(programa?){
//     var progRapido : Boolean = false
//     var progNormal : Boolean = false
//     var progLento : Boolean = false
//     val list = listOf("rapido", "normal", "lento")?
//     fun GetPrograma(){
//       
//        }
//   }
//     }
//iniciarPrograma(){
//    when
//}
//detenerPrograma(){
//    when
//}



fun main(){
    MiLavadora.introducirRopa()
    MiLavadora.sacarRopa()
   
    
    EnchufeTomaCorriente.encender()
    println("¿está encendido? : ${EnchufeTomaCorriente.encendida}")
    EnchufeTomaCorriente.apagar()
    println("¿está encendido? : ${EnchufeTomaCorriente.encendida}")
    
    CajonDetergenteSuavizante.agregarDetergente()
    CajonDetergenteSuavizante.agregarSuavizante()
    println("¿puse detergente?: ${CajonDetergenteSuavizante.detergente}")
    println("¿puse suavizante?: ${CajonDetergenteSuavizante.suavizante}")
}