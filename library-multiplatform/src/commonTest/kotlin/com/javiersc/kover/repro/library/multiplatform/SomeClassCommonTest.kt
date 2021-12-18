package com.javiersc.kover.repro.library.multiplatform

import kotlin.test.Test
import kotlin.test.assertTrue

class SomeClassCommonTest {

    private val someClassCommon = SomeClassCommon()

    @Test fun `some fun common`() = assertTrue { someClassCommon.someFunCommon() == "someFunCommon" }
}
