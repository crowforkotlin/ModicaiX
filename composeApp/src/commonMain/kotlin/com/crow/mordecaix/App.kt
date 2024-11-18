package com.crow.mordecaix

import androidx.compose.runtime.Composable
import com.crow.mordecaix.ui.theme.MordecaiXTheme
import test.TestApp


@Composable
fun App() {
    MordecaiXTheme {
//        Samples("Haze Sample")
        TestApp()
//        MordecaiXApp()
    }
}