class Cat (private val name: String, private var age: Int, weightIn: Int) {

    var weight = 0
        set(newWeight) {
            if(newWeight >= 5) {
                field = newWeight
            }
        }
    init {
        weight = weightIn
    }



    override fun toString() : String {
        return "Name: $name Age: $age Weight: $weight"
    }
}
