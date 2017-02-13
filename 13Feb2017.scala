object Obj {
  def main(args: Array[String]): Unit = {
    val n1 = new Person("Catalin", "february")
    val n2 = new Person("Maria", "may")
    val d1 = new MyData(28, 2 ,1900)
    val d2 = new MyData(1, 5, 1999)
    val p1 = new PayRoll(n1.getName, 10, 10)
    val p2 = new PayRoll(n2.getName, 12, 10)

    println("%s was born in %s - > %s and gets payed %d".format(n1.getName, n1.getBirthday, d1.displayDate(), p1.grossPay()))
    println("%s was born in %s - > %s and gets payed %d".format(n2.getName, n2.getBirthday, d2.displayDate(), p2.grossPay()))
  }
}

class Person(name: String, birthDay: String) {
  def getName: String = name
  def getBirthday: String = birthDay
}

class MyData(day: Int, month: Int,  year: Int) {
  def getDay: Int = day
  def getMonth: Int = month
  def getYear: Int = year
  def displayDate(): String = "%d/%d/%d".format(getDay, getMonth, getYear)
}

class PayRoll(name: String, payRate: Int, numberOfHours: Int) {
  def getName: String = name
  def grossPay(): Int = payRate * numberOfHours
}
