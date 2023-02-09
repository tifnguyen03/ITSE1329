/*
* Tiffany Nguyen
* 02.2 Variable Declaration and Initialization
* 02/09/2023
* */

fun main() {

    val myAge = 19;
    var averageAge = 19.0
    averageAge = (19.0 + 30.0) / 2.0
    println(averageAge)

    val testNumber = 53
    val evenOdd = testNumber % 2
    println(evenOdd)
    // if testNumber is even, then testNumber prints 0.
    // If testNumber is odd, then testNumber prints 1.

    var answer = 0
    println(answer)

    answer = ++answer
    println(answer)

    answer += 10
    println(answer)

    answer *= 10
    println(answer)

    answer *= 1000
    println(answer)

}