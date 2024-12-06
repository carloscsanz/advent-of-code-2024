package es.carloscsanz.adventofcode

import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Test

class Day2RedNosedReportsTest {
    private val exercise = Day2RedNosedReports("/day-2-input.txt")

    @Test
    fun `should calculate the expected total distance for the first challenge`() {
        val actual = exercise.firstChallenge()

        actual shouldBe 2
    }

    @Test
    fun `should calculate the expected similarity score for the second challenge`() {
        val actual = exercise.secondChallenge()

        actual shouldBe 4
    }
}
