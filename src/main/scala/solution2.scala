object solution2 extends App {

  def remover(list: List[Int]): List[Int] = {
    // case to find required output
    list.indices.collect { case x if x % 2 == 1 => list(x) }.toList
  }

  // returning new list
  val result = remover(list = List(2, 5, 3, 4, 6, 7, 8, 9))
  result.foreach(println)
}