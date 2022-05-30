



class WashingMachine constructor(marca: String, model: String, capacity: Int){

    var marca: String = marca
    var model: String = model
    var capacity: Int = capacity
    var isFull: Boolean = false
    var isActive: Boolean = false
    var detergent: Boolean = false
    var softener: Boolean = false
    var isOn: Boolean = false



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
    val myWashingMachine: WashingMachine = WashingMachine("Miele", "WCA020 WCS Active", 7)
    
    //myWashingMachine.on()
    //println(myWashingMachine.isOn)
    //myWashingMachine.off()
    //println(myWashingMachine.isOn)

    // myWashingMachine.selectProgram("lento")
    // println(myWashingMachine.isActive)
    // myWashingMachine.stopProgram()
    // println(myWashingMachine.isActive)

    // println(myWashingMachine.softener)
    // println(myWashingMachine.detergent)
    // myWashingMachine.addSoftener()
    // println(myWashingMachine.softener)
    // myWashingMachine.addDetergent()
    // println(myWashingMachine.detergent)


    // println(MyWashingMachine.capacity)
    // MyWashingMachine.insertClothes()
    // println(MyWashingMachine.capacity)
    // MyWashingMachine.takeClotherOut()
    // MyWashingMachine.takeClotherOut()
    // println(MyWashingMachine.capacity)


}
