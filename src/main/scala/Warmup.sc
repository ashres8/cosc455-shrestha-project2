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

val twinList = twinprimeslist(50)

def gbHelper(i: Int, n: Int): Unit={
  //println(i)
  if ((i + n-i == n) && isPrime(i) && isPrime(n-i))
      println("Golden bach number for " + n + " is " + i + " + " + (n-i))
  else if(i < n)
      gbHelper(i+1, n)
}

def goldbach(n: Int): Unit = {
  if(n % 2 != 0 || n <= 2)
    println("Not Even or less then 2")
  else
    gbHelper(1, n)
}

goldbach(28)
goldbach(60)