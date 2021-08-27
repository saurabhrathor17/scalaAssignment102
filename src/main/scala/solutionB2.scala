object solutionB2 extends App {


  def product(array: Array[Int]) = {

    var possibleMax = Integer.MIN_VALUE
    var fi = -1
    var fj = -1

    for (x <- array.indices) {
      for (y <- x + 1 until array.length) {

        if (possibleMax < array(x) * array(y)) {
          possibleMax = array(x) * array(y)
          fi = x
          fj = y
        }
      }
    }
    // for product multiply
    val result = array(fi) * array(fj)
    result
  }

  println(product(Array(2, 3, 5, 7, -7, 5, 8, -5)))
}
