fun main() {
    val binnie = Cat("Binnie", 10, 10)
    val clyde = Cat("Clyde", 5, 5)
    binnie.walk()
    clyde.walk()
    println(binnie)
    println(clyde)
    binnie.eat()
    clyde.eat()
    println(binnie)
    println(clyde)
}