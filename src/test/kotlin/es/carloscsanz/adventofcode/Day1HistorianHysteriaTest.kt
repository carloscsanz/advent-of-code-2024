package es.carloscsanz.adventofcode

import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Test

class Day1HistorianHysteriaTest {
    private val exercise = Day1HistorianHysteria("/day-1/input.txt")

    @Test
    fun `should calculate the expected total distance for the first challenge`() {
        val actual = exercise.firstChallenge()

        actual shouldBe 11
    }

    @Test
    fun `should calculate the expected similarity score for the second challenge`() {
        val actual = exercise.secondChallenge()

        actual shouldBe 31
    }
}
