

object solution4 extends App {

  def absoluteValue(list: List[Int]): List[Int] = {

    list.map(scala.math.abs)

  }

  absoluteValue(list = List(2, -4, 3, -1, 23, -4, -54))
}
