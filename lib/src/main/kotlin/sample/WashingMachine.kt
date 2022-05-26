



class WashingMachine {

    var marca: String
    var model: String
    var capacity: Int
    var isFull: Boolean = false
    var isActive: Boolean = false
    var detergent: Boolean = false
    var softener: Boolean = false
    var isOn: Boolean = false

    constructor(marca: String, model: String, capacity: Int) {
        this.marca = marca
        this.model = model
        this.capacity = capacity
    }

    fun on() {
        this.isOn = true
    }

    fun off() {
        this.isOn = false
    }

    fun insertClothes() {
        if (this.capacity <= 0) {
            this.isFull = true
            println("Washer drum full: ${this.isFull}")
        } else {
            this.capacity -= 1
        }
    }

    fun takeClotherOut() {
        if (this.capacity <= 0 || this.capacity >= 7) {
            println("it's not possible to remove clothes")
        } else {
            this.capacity +=1
        }
    }
    fun addSoftener() {
        this.softener = true
    }
    fun addDetergent() {
        this.detergent = true
    }
    fun startProgram() {
        this.isActive = true
    }

    fun stopProgram() {
        this.isActive = false
    }

    fun selectProgram( program :String):String{
        this.startProgram()
        println(" selected program: ${program} ")
        return program //?
    }
}


fun main() {
    val MyWashingMachine = WashingMachine("Miele", "WCA020 WCS Active", 7)
    
    //MyWashingMachine.on()
    //println(MyWashingMachine.isOn)
    //MyWashingMachine.off()
    //println(MyWashingMachine.isOn)

    // MyWashingMachine.selectProgram("rápido")
    // println(MyWashingMachine.isActive)
    // MyWashingMachine.stopProgram()
    // println(MyWashingMachine.isActive)

    // println(MyWashingMachine.softener)
    // println(MyWashingMachine.detergent)
    // MyWashingMachine.addSoftener()
    // println(MyWashingMachine.softener)
    // MyWashingMachine.addDetergent()
    // println(MyWashingMachine.detergent)


    // println(MyWashingMachine.capacity)
    // MyWashingMachine.insertClothes()
    // println(MyWashingMachine.capacity)
    // MyWashingMachine.takeClotherOut()
    // MyWashingMachine.takeClotherOut()
    // println(MyWashingMachine.capacity)


}
