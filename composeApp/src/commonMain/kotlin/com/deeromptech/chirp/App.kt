package com.deeromptech.chirp

import androidx.compose.runtime.Composable
import com.deeromptech.chirp.navigation.NavigationRoot
import com.deeromptech.core.designsystem.theme.ChirpTheme
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App() {
    ChirpTheme {
        NavigationRoot()
    }
}