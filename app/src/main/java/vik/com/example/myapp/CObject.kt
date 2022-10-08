package vik.com.example.myapp

class CObject (
    var name  : String,
    var description: Int
)
{
    var comments : MutableList<String> = mutableListOf()

    override fun toString(): String {
        return "name: $name age: $description"
    }

}
