fun main(){
    val box1 = Box() //instance of box
    val box2 = Box()
    val box3 = Box()
    //can create a lot of instance

    box1.height = 7
    println("Height: ${box1.height}")
    println("Length: ${box1.length}")
    println("Width: ${box1.width}")

    box1.openBox()
    box1.fillContents()

}