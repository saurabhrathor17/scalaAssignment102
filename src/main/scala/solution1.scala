object solution1 extends App {

  def repeater(n: Int, list: List[Int]) = {

    list.flatMap(List.fill(n)(_))

  }

  val newList = repeater(n = 3, list = List(1, 2, 3, 4))

  for (num <- newList)
    println(num)

}
