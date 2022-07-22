package org.dropProject.samples.sampleKotlinAssignment

fun findMax(numbers: Array<Int>) : Int {
    if (numbers.size == 0) {
        return 0
    }

    var max = numbers[0]
    for (pos in numbers) {
        if (max > numbers[pos]) {
            max = numbers[pos]
        }
    }

    return max
}