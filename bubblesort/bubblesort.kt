fun bubbleSort(arr: IntArray) {
    val n = arr.size
    for (i in 0 until n - 1) {
        for (j in 0 until n - 1 - i) {
            if (arr[j] > arr[j + 1]) {
                val temp = arr[j]
                arr[j] = arr[j + 1]
                arr[j + 1] = temp
            }
        }
    }
}

fun main() {
    val lista = intArrayOf(2, 12, 0, 3, 8, 90, 69)
    bubbleSort(lista)
    println("Lista ordenada: ${lista.joinToString(", ")}")
}
