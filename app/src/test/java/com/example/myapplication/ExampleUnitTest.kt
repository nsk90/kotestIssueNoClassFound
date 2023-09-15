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

                //I am using Android Studio Giraffe | 2022.3.1 Patch 1
                // and Kotest IDE  plugin version 1.3.69-IC-2022.3
            }
        }
    }
})