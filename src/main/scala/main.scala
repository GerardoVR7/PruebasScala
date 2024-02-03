@main
def main(): Unit = {
  println("Hello world!")
  print(x(11))
}

def test( parametro: Int): Int => Boolean = {
  (numero: Int) => numero > parametro
}

val x = test(10)


