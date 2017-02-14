object Feb142017 {
  def main(args: Array[String]): Unit = {
    val car1 = new Car(2015, "Fiat")
    test(car1)

    var score1 = scala.io.StdIn.readLine().toInt
    var score2 = scala.io.StdIn.readLine().toInt
    var score3 = scala.io.StdIn.readLine().toInt
    val scores = new TestScore(score1, score2, score3)
    println("Your average for that score is " + scores.average())
  }

  def test(car: Car) = {
    for(_ <- 0 to 4) {
      println(car.accelerate())
    }
    for(_ <- 0 to 4) {
      println(car.brake())
    }
  }

  class Car(yearModel: Int, make: String) {

    var speed = 0
    def getYearModel: Int = yearModel
    def getMake: String = make

    def accelerate() = {
      this.speed += 5
      "we are accelerating from " + (this.speed - 5) + " to " + this.speed
    }

    def brake() = {
      this.speed -= 5
      "we are slowing down from " + (this.speed + 5) + " to " + this.speed
    }
  }

  class TestScore(s1: Int, s2: Int, s3: Int) {
    def average(): Int = (s1 + s2 + s3) / 3
  }
}
