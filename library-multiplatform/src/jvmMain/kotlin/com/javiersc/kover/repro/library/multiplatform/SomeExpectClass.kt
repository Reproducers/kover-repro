package com.javiersc.kover.repro.library.multiplatform

actual class SomeExpectClass {

    actual fun someExpectFun(): String = "someExpectFunJvm"

    actual fun someExpectUntestedFun() : String = "someExpectUntestedFun"
}
