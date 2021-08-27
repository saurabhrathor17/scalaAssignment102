import org.scalatest.funsuite.AnyFunSuite
class testSolution1 extends AnyFunSuite{

  test("solution1"){
    assert(solution1.repeater(4,List(1,2,3))===List(1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3))
    assert(solution1.repeater(2,List(1,2,3))===List(1, 1, 2, 2, 3, 3))
  }

}
