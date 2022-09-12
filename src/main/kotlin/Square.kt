class Square(var height, var length) : Shape(_name) {
    override fun printDimensions() {
        println("The dimension for the \$sqName are \$length and \$height ")
    }
    override fun getArea(): Double {
        val sqName = "Square"
        var height: Double = 0.0
        var length: Double =0.0
        val sqArea = length * height
        return sqArea


}
    fun setDimensions(Length: Double, Height: Double) {
        this.length = length

        this.height = height
    }

}