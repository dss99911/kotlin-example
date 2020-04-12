@file:Suppress("RedundantExplicitType", "unused")

package kim.jeonghyeon.exception

fun a() {
    error("asdf")
    assert(true) {
        "it's not true"
    }

    check(true) {
        "it's not true"
    }
}