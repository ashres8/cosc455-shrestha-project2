val chinese: List[String] = List("ling", "yi", "er", "san", "si", "wu", "liu", "qi", "ba", "jiu", "shi")
val english: List[String] = List("zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten")

val chiandnum = chinese.zipWithIndex
val engandnum = english.zipWithIndex

val languageMap = (chiandnum:::engandnum).toMap

def changeLangToNum(langList: List[String]): List[Int] =
  langList.map(x => if (languageMap.exists(_._1 == x)) languageMap.apply(x) else -1).filter(_ > -1)

changeLangToNum(List("yi", "josh", "three", "si"))

def go(l: List[String]): Unit = {
  println("Translation " + changeLangToNum(l).mkString(", "))
  println("Sum: " + changeLangToNum(l).sum)
  println("Multiplication: " + changeLangToNum(l).product)
}

go(List("yi", "josh", "three", "si", "two", "three", "four", "apples"))
