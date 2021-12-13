package com.javiersc.kover.repro.library.jvm

import kotlin.test.assertTrue
import org.junit.Test

class SomeClassJvmTest {

    private val someClassJvm = SomeClassJvm()

    @Test
    fun someFunJvm() = assertTrue { someClassJvm.someFunJvm() == "someFunJvm" }
}
