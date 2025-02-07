package org.jetbrains.kotlinconf

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import org.jetbrains.kotlinconf.theme.KotlinConfTheme
import org.jetbrains.kotlinconf.ui.MainScreen

@Composable
fun App(context: ApplicationContext) {
    KotlinConfTheme {
        val service = ConferenceService(
            context,
            "https://kotlin-conf-staging.labs.jb.gg/"
        )

        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colors.background
        ) {
            MainScreen(service)
        }
    }
}
