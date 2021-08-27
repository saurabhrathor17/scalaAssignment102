object solutionB1 extends App {

  def rightReplace(array: Array[Int]): Array[Int] = {

    val size = array.length

    var rightMax = array(size - 1)

    array(size - 1) = -1

    var tmp = 0

    for (i <- size - 2 to 0 by -1) {
      tmp = array(i)

      array(i) = rightMax

      if (rightMax < tmp) rightMax = tmp
    }
    array
  }

  var result = rightReplace(Array(9, 5, 8, 4, -10, 21, 6, 17, 11))

  result.foreach(println)


}