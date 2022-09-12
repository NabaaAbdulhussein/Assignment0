 abstract class Shape (_name : String):Dimensionable
 {

     var name = _name
     val square = Square("Square")
     val circle = Circle("circle")
     val triangle = Triangle("triangle")
     val eqtriangle = EquilateralTriangle("EquilateralTriangle")



     @Override
        open fun getArea(): Double
        {
            
            return 0.0
        }
 }
