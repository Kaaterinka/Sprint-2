class ProblemB {

    fun main() {
        val t = readInt()
        val alf = emptyList<Char>().toMutableList()

        for (j in 'a'..'z') {
            alf.add(j)
        }

        repeat(t) {
            val nk = readListInt()
            val s = StringBuilder()
            val n = nk.get(0)
            val k = nk.get(1)

            for (j in 0 until n) {
                s.append(alf[j % k])
            }
            println(s)
        }
    }
}