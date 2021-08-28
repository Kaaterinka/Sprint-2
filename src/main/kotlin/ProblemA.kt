class ProblemA {
    fun main() {

        val t = readInt()

        repeat(t) {
            val abk = readListLong()
            val a = abk.get(0)
            val b = abk.get(1)
            val k = abk.get(2)
            var res = 0L
            for (i in 1..(k + 1) / 2) {
                res += a
            }
            for (i in 1..k - (k + 1) / 2) {
                res -= b
            }
            println(res)
        }
    }
}