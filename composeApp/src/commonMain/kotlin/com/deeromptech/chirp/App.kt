package com.deeromptech.chirp

import androidx.compose.runtime.Composable
import com.deeromptech.auth.presentation.register.RegisterRoot
import com.deeromptech.core.designsystem.theme.ChirpTheme
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App() {
    ChirpTheme {
        RegisterRoot()
    }
}