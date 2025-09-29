package com.deeromptech.chirp

import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController
import com.deeromptech.chirp.navigation.DeepLinkListener
import com.deeromptech.chirp.navigation.NavigationRoot
import com.deeromptech.core.designsystem.theme.ChirpTheme
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App() {
    val navController = rememberNavController()
    DeepLinkListener(navController)

    ChirpTheme {
        NavigationRoot(navController)
    }
}