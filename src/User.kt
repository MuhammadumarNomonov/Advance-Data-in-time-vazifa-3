 import java.net.InetAddress
import java.text.SimpleDateFormat
import java.util.*

data class User(
    var name:String,
    var phone :String,
    var date: String = SimpleDateFormat("dd.MM.yyyy HH:mm:ss").format(Date())

    )

