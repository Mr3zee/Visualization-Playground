package sysoev.projects.visualization.base

fun <T: Comparable<T>> T.bounded(minV: T, maxV: T): T {
    return maxOf(minV, minOf(maxV, this))
}

fun String.upperFirstChar() = replaceFirstChar { if (it.isLowerCase()) it.titlecase() else it.toString() }