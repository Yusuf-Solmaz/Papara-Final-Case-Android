package com.yusuf.paparafinalcase

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.yusuf.paparafinalcase.navigation.Navigation
import com.yusuf.paparafinalcase.presentation.mainViewmodel.MainViewModel
import com.yusuf.paparafinalcase.ui.theme.PaparaFinalCaseTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    private val mainViewModel by viewModels<MainViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PaparaFinalCaseTheme {
                Navigation(mainViewModel = mainViewModel)
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    PaparaFinalCaseTheme {

    }
}