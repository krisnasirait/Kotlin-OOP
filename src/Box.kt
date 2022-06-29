class Box { //class declaration
    //properties (val immutable, var mutable)
    var length: Int = 10
    var width: Int = 20
    var height: Int = 5

    //getters can be initialized using val
    //val properties can't have a val
    val volume
    get() = length * width * height

    //visibility modifiers or class modifiers
    /*
    * public : Default, can be accessed everywhere
    * internal : Available everywhere in the same module
    * private : Available only inside the conatining file or class\
    * protected : Same as private but available inside subclassed or child classes
    * */


    //setters initialized using var
    var boxName: String = "Box name"
    set(value) {
        if(value.length < 3){
            println("Name cannot be less than 3 characters")
        }else{
            field = value
        }
    }


    //behaviors 1
    fun fillContents(){
        println("Box is filled")
    }

    //behaviors 2
    fun openBox(){
        println("Box Opened")
    }
}