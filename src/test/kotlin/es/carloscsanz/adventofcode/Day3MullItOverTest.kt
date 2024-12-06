package es.carloscsanz.adventofcode

import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Test

class Day3MullItOverTest {
    private val exercise = Day3MullItOver("/day-3-input.txt")

    @Test
    fun `should calculate the expected first challenge`() {
        val actual = exercise.firstChallenge()

        actual shouldBe 161
    }

    @Test
    fun `should calculate the expected second challenge`() {
        val actual = exercise.secondChallenge()

        actual shouldBe 4
    }
}
