import org.scalatest.FunSuite

class ClientTest extends FunSuite {
  test("multiply returns the correct result") {
    assert(Client.multiply(3) === 27)
  }
}