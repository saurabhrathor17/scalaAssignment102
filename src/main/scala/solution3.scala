object solution3 extends App {

  def counting(list: List[Int]): Int = {

    // last position = 9 +1 ==> 10

    val count = list.indexOf(list.last) + 1
    count

  }

  println(counting(list = List(2, 5, 1, 4, 3, 7, 8, 6, 0, 9)))


}
