class Triangle(_name: String) : Shape(_name) {

    fun setDimensions(opp: Double, adj: Double, hyp: Double) {
        var hyp: Double = 0.0
        var adj: Double = 0.0
        var opp: Double = 0.0

        this.opp = opp
        this.adj = adj
        this.hyp = hyp
    }

    override fun printDimensions()
        println("The Dimensions for the Triangle is \nOpposite = %1f \nAdjacent =%1f", opp, adj, hyp)


    val tPerimeter = (opp + adj + hyp) / 2
    override fun getArea(): Double {
        val tArea = Math.sqrt((tPerimeter(tPerimeter - opp)(tPerimeter - adj)(tPerimeter - hyp)))
        return tArea
    }
}


