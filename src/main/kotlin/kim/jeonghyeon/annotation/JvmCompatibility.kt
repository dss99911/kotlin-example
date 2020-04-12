@file:JvmName("GlobalUtility")

package kim.jeonghyeon.annotation

fun globalFunction() {
    println("this is called by java")
    println("GlobalUtility.globalFunction()")
}

object JavaCompatibility {

    /**
     * without @JvmStatic.
     * you should call as JavaCompatibility.INSTANCE.intListToString()
     * with @JvmStatic, you can use the below
     * JavaCompatibility.intListToString()
     */
    @JvmStatic
    fun intListToString(ints: List<Int>?): String? {
        return ints?.joinToString(",")
    }
}
