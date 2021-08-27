object solutionB3 extends App {

  def maximumDifference(array: Array[Int]) = {

    val result = array.max - array.min
    result

  }

  println(maximumDifference(array = Array(2, 3, 1, 7, 9, 5, 11, 3, 5)))
}
