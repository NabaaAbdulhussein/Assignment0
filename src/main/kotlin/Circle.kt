class Circle(_name: String) : Shape(_name) {
    var Radius: Double = 0.0

    fun setDimensions(Radius: Int) {
        var Radius: Double = 0.0
        this.Radius = Radius

        fun getArea(): Double {
            var D: Double = 0.0
            var DimCir = D * Radius
            return DimCir
        }


        }

    override fun printDimensions() {
        println("The dimension for the Circle is \$Radius")
    }
}
