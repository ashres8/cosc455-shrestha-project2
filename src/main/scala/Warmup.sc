def isPrime(n: Int) : Boolean =
  (divisor(n).size == 2) || n == 2

def divisor(n: Int): List[Int] =
  (1 to n).toList.filter((x: Int) => {n % x == 0})

divisor(41)
isPrime(23)

def twinPrime(n1: Int, n2: Int) : Boolean =
  ((n1 - n2) == 2 || (n1 - n2) == -2) && isPrime(n1) && isPrime(n2)

twinPrime(41, 43)

def twinprimeslist(n: Int): List[Int] = n match{
  case x if x < 3 => Nil
  case _ => if(twinPrime(n-2, n) || twinPrime(n+2, n)) n::twinprimeslist(n-1) else twinprimeslist(n-1)
}

println()

val twinList = twinprimeslist(50)

def goldbach(n: Int): Unit = {
  println((1 to n).toList.filter(isPrime))
}

goldbach(28)