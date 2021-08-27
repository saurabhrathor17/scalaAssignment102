import org.scalatest.funsuite.AnyFunSuite

class testSolutionB2 extends AnyFunSuite{

  test("solutionB2"){
    assert(solutionB2.product(Array(1,2,3,4,5,6,7,8,9))===72)
    assert(solutionB2.product(Array(1,2,3,4,5,6,7))===42)
  }

}
