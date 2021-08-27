import org.scalatest.funsuite.AnyFunSuite

class testSolution4 extends AnyFunSuite{

  test("solution4"){

    assert(solution4.absoluteValue(List(-3, 4, -8, -1, -15, -4, 0))===List(3,4,8,1,15,4,0))
  }
}
