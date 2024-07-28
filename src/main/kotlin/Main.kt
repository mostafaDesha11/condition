fun main(args: Array<String>) {
  var price:Int=29
    if(price>=30){
        println("The price is ${price}")
    }
    else if(price<30){
        println("the price is less")
    }
    else{
        println("Notfou")
    }
    //single line if
    if(3>5) println("the condition is true") else println("The condion not ")
    //and
    if(31>4 ||51<9) println("yes") else println("NO")
    if(22!=22)println("true codition") else println("flase condition")
    if(!true)print("true") else println("falsee")
  //equality two types is structural and
    var obj1=person("mostafa")
    var obj2=person("mostafa")
    if(obj1===obj2)println("equal") else println("notEquals")

//new line i added hhhhh hhhh hhh 
//i kill u 

}
class person(var name:String)
