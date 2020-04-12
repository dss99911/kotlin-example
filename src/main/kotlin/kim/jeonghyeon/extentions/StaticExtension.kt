package kim.jeonghyeon.extentions

class User {
    companion object {

    }
}


fun User.Companion.createUser(): User = User()


fun main() {
    User.createUser()
}