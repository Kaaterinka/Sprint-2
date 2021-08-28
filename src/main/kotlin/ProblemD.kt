class ProblemD {

    fun main() {
        val t = readInt()

        repeat(t) {
            var n = readInt()
            val a = readListLong()
            var maxMoney = 0L
            for (element in a) {
                val countPeople = countPeopleByPrice(element, a)
                val money = element * countPeople
                if (money > maxMoney) {
                    maxMoney = money
                }
            }
            println(maxMoney)
        }
    }

    fun countPeopleByPrice(price: Long, spends: List<Long>): Int {
        var count = 0
        for (s in spends) {
            if (s >= price)
                count++
        }
        return count
    }

}