class EquilateralTriangle(_name: String) : Shape(_name) {
    fun setDimensions(Side : Int) {
        var OneSide: Double = 0.0
    }
        override fun getArea(): Double {
            var hyp: Double = 0.0
            var adj: Double = 0.0
            var opp: Double = 0.0
            var perimeter: Double = 0.5

            val EqTArea = Math.sqrt((0.5*(perimeter - opp)(perimeter - adj)(perimeter - hyp)))
        return EqTArea
    }

    override fun printDimensions() {
        println("The dimension for the Equilateral Triangle is \$Opposite and \$adjacent and \$Hypotenuse",opp,adj,hyp)

    }
}
