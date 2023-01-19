
import kotlin.math.*
fun main(args: Array<String>) {
    println("Welcome to BMI calculator.")

    println("Enter the height in meters:")
    var v = readln().toDouble()
    println("Enter the weight in kilograms:")
    var h = readln().toDouble()

    val m = v * v //výpočet na metry čtverečný
    val bmi: Double = h / m

    print("Your BMI is $bmi " )
    if (bmi <=18.5){
        print("you are underfed, go eat.")
    } else if (bmi >= 18.5 && bmi <= 24.9){
        print("you have ideal weight.")
    } else if (bmi >= 25 && bmi <= 29.9 ){
        print("you are overweight, get off the sofa and start doing something.")
    } else if (bmi >= 30){
        print("you are obese Stop eating like that.")
    }

}