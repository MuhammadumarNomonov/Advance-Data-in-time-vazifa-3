import java.util.*

fun main() {
    val myservice = Myservice()
    while (true) {
        println("1-> qo`shish; 2-> korish; 3 -> tahrirlash; 4 -> o`chirish; 5->qidirish")
        when (Scanner(System.`in`).nextInt()) {
            1 -> myservice.addUser()
            2 -> myservice.showUser()
            3 -> myservice.editUser()
            4 -> myservice.deleteUser()
            5 -> myservice.searchUser()
        }
    }
}

