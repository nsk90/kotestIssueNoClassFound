package com.example.myapplication

import io.kotest.core.spec.style.BehaviorSpec

// <-- if you run from here, it works (gradle configuration)
class ExampleUnitTest : BehaviorSpec({

    // <--- if you run from here, it fails with java.lang.NoClassDefFoundError (kotest configuration)
    Given("test") {
        val data = EvilClass()
        When("when") {
            Then("then") {
                // nothing
            }
        }
    }
})