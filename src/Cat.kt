class Cat (private val name: String, private var age: Int, var weight: Int) {

    fun eat() {
        println("How much would you like to feed $name?")
        val catfeed = readln().toInt()
        if(catfeed+weight<20){
            weight+=catfeed
            println("$name is now a weight of $weight")
        } else {
            println("$name cannot eat.")
        }
    }

    public fun walk(distance: Int) : Boolean {
        if(weight - distance >= 5) {
            weight -= distance
            return true
        }
        return false
    }


    public override fun toString() : String {
        return "Name: $name Age: $age Weight: $weight"
    }
}
