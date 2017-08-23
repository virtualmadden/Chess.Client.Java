import org.scalatest.FunSuite

class EngineTest extends FunSuite {
  test("multiply returns the correct result") {
    assert(Engine.multiply(3) === 27)
  }
}