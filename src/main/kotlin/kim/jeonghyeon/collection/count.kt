package kim.jeonghyeon.collection

fun count() {
    listOf(1, 2, 3).count {
        it == 1
    }
}