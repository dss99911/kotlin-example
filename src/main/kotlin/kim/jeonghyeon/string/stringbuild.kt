package kim.jeonghyeon.string

fun stringBuild() {
    buildString {
        for (i in 1..10) {
            append(i)
        }
    }
}