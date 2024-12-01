package es.carloscsanz.adventofcode

import kotlin.math.absoluteValue

fun main() {
    val exercise = Day1HistorianHysteria("/day-1/input.txt")

    val firstChallenge = exercise.firstChallenge()
    val secondChallenge = exercise.secondChallenge()

    println("DAY 1:")
    println("- [CHALLENGE 1] Total distance: $firstChallenge")
    println("- [CHALLENGE 2] Similarity score: $secondChallenge")
}

class Day1HistorianHysteria(filePath: String) {
    private val leftList: List<Long>
    private val rightList: List<Long>

    init {
        val left = mutableListOf<Long>()
        val right = mutableListOf<Long>()

        this::class.java.getResourceAsStream(filePath)!!
            .bufferedReader()
            .forEachLine { line ->
                val (rightNumber, leftNumber) = line.split("   ")

                left.add(leftNumber.toLong())
                right.add(rightNumber.toLong())
            }

        leftList = left
        rightList = right
    }

    fun firstChallenge(): Long {
        val rightSorted = rightList.sorted()
        val distances =
            leftList.sorted().mapIndexed { index, value ->
                val otherValue = rightSorted[index]
                (value - otherValue).absoluteValue
            }

        return distances.sum()
    }

    fun secondChallenge(): Long {
        val values = rightList.groupBy { it }
        val scores =
            leftList.sorted().map { value ->
                val occurrences = values[value]?.count() ?: 0
                value * occurrences
            }

        return scores.sum()
    }
}
