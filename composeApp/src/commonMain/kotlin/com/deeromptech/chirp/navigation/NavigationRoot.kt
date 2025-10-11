package com.deeromptech.chirp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.deeromptech.auth.presentation.navigation.AuthGraphRoutes
import com.deeromptech.auth.presentation.navigation.authGraph
import com.deeromptech.chat.presentation.navigation.ChatGraphRoutes
import com.deeromptech.chat.presentation.navigation.chatGraph

@Composable
fun NavigationRoot(
    navController: NavHostController,
    startDestination: Any
) {
    NavHost(
        navController = navController,
        startDestination = startDestination
    ) {
        authGraph(
            navController = navController,
            onLoginSuccess = {
                navController.navigate(ChatGraphRoutes.Graph) {
                    popUpTo(AuthGraphRoutes.Graph) {
                        inclusive = true
                    }
                }
            }
        )
        chatGraph(
            navController = navController
        )
    }
}