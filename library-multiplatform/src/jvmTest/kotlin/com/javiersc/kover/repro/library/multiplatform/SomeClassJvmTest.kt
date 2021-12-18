package com.javiersc.kover.repro.library.multiplatform

import kotlin.test.Test
import kotlin.test.assertTrue

class SomeClassJvmTest {

    private val someClassJvm = SomeClassJvm()
    private val someExpectClass = SomeExpectClass()

    @Test fun `some fun jvm`() = assertTrue { someClassJvm.someFunJvm() == "someFunJvm" }

    @Test
    fun `some expect fun jvm`() = assertTrue {
        someExpectClass.someExpectFun() == "someExpectFunJvm"
    }
}
