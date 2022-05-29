package sample

import WashingMachine
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class WashingMachineTest {

    @Test
    fun `when the capacity is 7, I can't take clothes` () {
        val myWashingMachine = WashingMachine("Miele", "WCA020", 7)
        myWashingMachine.takeClotherOut()
        assertEquals(myWashingMachine.capacity, 7) // ha de marcar error
        assertFalse(myWashingMachine.isFull)
    }


    @Test
    fun `when the capacity is 0, I can't add clothes` () {
        val myWashingMachine = WashingMachine("Miele", "WCA020", 0)
        myWashingMachine.insertClothes()
        assertEquals(myWashingMachine.capacity, 0)
        assertTrue(myWashingMachine.isFull)
    }

    @Test
    fun `when I add or remove clothes, the capacity varies by 1`() {
        val myWashingMachine = WashingMachine("Miele", "WCA020", 7)
        myWashingMachine.insertClothes()
        myWashingMachine.insertClothes()
        myWashingMachine.takeClotherOut()
        assertEquals(myWashingMachine.capacity, 6)
        assertFalse(myWashingMachine.isFull)
    }


    @Test
    fun `when I select a program, my labeler is activated`() {
        val myWashingMachine = WashingMachine("Miele", "WCA020", 7)
        myWashingMachine.selectProgram("lento")
        assertEquals(myWashingMachine.isActive, true)
    }

    @Test
    fun `when I stop a program, my labeler is disabled`() {
        val myWashingMachine = WashingMachine("Miele", "WCA020", 7)
        myWashingMachine.stopProgram()
        assertEquals(myWashingMachine.isActive, false)
    }

    @Test
    fun `I can add detergent `() {
        val myWashingMachine = WashingMachine("Miele", "WCA020", 7)
        myWashingMachine.addDetergent()
        assertTrue(myWashingMachine.detergent)
    }



    @Test
    fun `I can add softener `() {
        val myWashingMachine = WashingMachine("Miele", "WCA020", 7)
        myWashingMachine.addSoftener()
        assertTrue(myWashingMachine.softener)
    }



    @Test
    fun `I can turn on the washing machine `() {
        val myWashingMachine = WashingMachine("Miele", "WCA020", 7)
        myWashingMachine.on()
        assertTrue(myWashingMachine.isOn)
    }



    @Test
    fun `I can turn off the washing machine `() {
        val myWashingMachine = WashingMachine("Miele", "WCA020", 7)
        myWashingMachine.on()
        myWashingMachine.off()
        assertFalse(myWashingMachine.isOn)
    }




}