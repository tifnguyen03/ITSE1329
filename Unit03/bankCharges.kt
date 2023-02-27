/*Tiffany Nguyen
* 03.8 Bank Charges
* 02/26/2023*/

fun main(){

    print("Enter number of checks written for the month: ");
    var checks = readln()
    var c = checks.toDouble()

    val BASE = 10.0

    var total: Double



    if(c < 20.0){

        total = (BASE + (c * .10))

        print("The bank's service fees for the month is $$total")
    }
    else if(c == 20.0 || c <= 39.0){

        total = (BASE + (c * .08))

        print("The bank's service fees for the month is $$total")
    }
    else if(c == 40.0 || c <= 59.0){

        total = BASE + (c * .06)

        print("The bank's service fees for the month is $$total")
    }
    else if(c > 60.0){

        total = (BASE + (c * .04))

        print("The bank's service fees for the month is $$total")
    }
}