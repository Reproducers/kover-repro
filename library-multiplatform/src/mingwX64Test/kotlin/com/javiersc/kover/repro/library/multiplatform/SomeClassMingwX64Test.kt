package com.javiersc.kover.repro.library.multiplatform

import kotlin.test.Test
import kotlin.test.assertTrue

class SomeClassMingwX64Test {

    private val someClassMingwX64 = SomeClassMingwX64()
    private val someExpectClass = SomeExpectClass()

    @Test
    fun `some fun mingwX64`() = assertTrue {
        someClassMingwX64.someFunMingwX64() == "someFunMingwX64"
    }

    @Test
    fun `some expect fun jvm`() = assertTrue {
        someExpectClass.someExpectFun() == "someExpectFunMingwX64"
    }
}
