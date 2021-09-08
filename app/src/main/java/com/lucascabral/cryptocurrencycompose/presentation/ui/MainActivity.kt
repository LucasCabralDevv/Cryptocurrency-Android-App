package com.lucascabral.cryptocurrencycompose.presentation.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.lucascabral.cryptocurrencycompose.presentation.Screen
import com.lucascabral.cryptocurrencycompose.presentation.coin_detail.CoinDetailScreen
import com.lucascabral.cryptocurrencycompose.presentation.coin_list.CoinListScreen
import com.lucascabral.cryptocurrencycompose.presentation.ui.theme.CryptocurrencyComposeTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CryptocurrencyComposeTheme {
                Surface(color = MaterialTheme.colors.background) {
                    val navController = rememberNavController()
                    NavHost(
                        navController = navController,
                        startDestination = Screen.CoinListScreen.route
                    ) {
                         composable(
                             route = Screen.CoinListScreen.route
                         ) {
                             CoinListScreen(navController)
                         }
                        composable(
                            route = Screen.CoinDetailScreen.route + "/{coinId}"
                        ) {
                            CoinDetailScreen()
                        }
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    CryptocurrencyComposeTheme {

    }
}