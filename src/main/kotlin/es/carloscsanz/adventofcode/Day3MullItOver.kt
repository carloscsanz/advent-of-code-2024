package es.carloscsanz.adventofcode

fun main() {
    val exercise = Day3MullItOver("/day-3-input.txt")

    val firstChallenge = exercise.firstChallenge()
    val secondChallenge = exercise.secondChallenge()

    println("DAY 3:")
    println("- [CHALLENGE 1] Total result: $firstChallenge")
    println("- [CHALLENGE 2] Similarity score: $secondChallenge")
}

class Day3MullItOver(filePath: String) {
    private val memory: String =
        this::class.java.getResourceAsStream(filePath)!!
            .bufferedReader()
            .readText()

    fun firstChallenge(): Long {
        val regex = Regex("""mul\(([0-9]{1,3}?),([0-9]{1,3}?)\)""")
        val matches = regex.findAll(memory)
        val results = matches.map { it.groupValues[1].toLong() * it.groupValues[2].toLong() }

        return results.sum()
    }

    fun secondChallenge(): Int {
        return 0
    }
}
