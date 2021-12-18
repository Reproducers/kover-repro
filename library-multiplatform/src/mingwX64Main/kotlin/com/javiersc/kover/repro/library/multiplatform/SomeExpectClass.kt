package com.javiersc.kover.repro.library.multiplatform

actual class SomeExpectClass {

    actual fun someExpectFun(): String = "someExpectFunMingwX64"

    actual fun someExpectUntestedFun() : String = "someExpectUntestedFun"
}
