import org.scalatest.funsuite.AnyFunSuite

class testSolutionB1 extends AnyFunSuite {

  test("solutionB1"){
    assert(solutionB1.rightReplace(Array(1,2,3,4,5,21,6,15,10))===Array(21,21,21,21,21,15,15,10,-1))

  }
}
