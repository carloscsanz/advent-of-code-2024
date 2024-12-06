package es.carloscsanz.adventofcode

import kotlin.math.abs

fun main() {
    val exercise = Day2RedNosedReports("/day-2-input.txt")

    val firstChallenge = exercise.firstChallenge()
    val secondChallenge = exercise.secondChallenge()

    println("DAY 2:")
    println("- [CHALLENGE 1] Safe reports: $firstChallenge")
    println("- [CHALLENGE 2] ¿?: $secondChallenge")
}

class Day2RedNosedReports(filePath: String) {
    private val reports: List<List<Int>>

    init {
        val rawReports = mutableListOf<List<Int>>()

        this::class.java.getResourceAsStream(filePath)!!
            .bufferedReader()
            .forEachLine { line -> rawReports.add(line.split(" ").map { it.toInt() }) }

        reports = rawReports.toList()
    }

    fun firstChallenge(): Int = reports.count { it.isSafe() }

    fun secondChallenge(): Int {
        TODO()
    }

    private fun List<Int>.isSafe(): Boolean {
        if (!isSortedAscending() && !isSortedDescending()) return false

        return windowed(size = 2, step = 1)
            .map { it[0] - it[1] }
            .all { abs(it) in 1..3 }
    }

    private fun List<Int>.isSortedAscending(): Boolean {
        for (i in indices) {
            if (i == size - 1) break
            if (this[i] > this[i + 1]) return false
        }

        return true
    }

    private fun List<Int>.isSortedDescending(): Boolean {
        for (i in indices) {
            if (i == size - 1) break
            if (this[i] < this[i + 1]) return false
        }

        return true
    }
}
