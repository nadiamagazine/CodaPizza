package com.nadiamagazine.codapizza

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Checkbox
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.nadiamagazine.codapizza.composeui.AppTheme
import com.nadiamagazine.codapizza.composeui.PizzaBuilderScreen
import com.nadiamagazine.codapizza.composeui.ToppingCell
import com.nadiamagazine.codapizza.model.Topping
import com.nadiamagazine.codapizza.model.ToppingPlacement
import com.nadiamagazine.codapizza.ui.theme.CodaPizzaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppTheme {
                    PizzaBuilderScreen()
                }
            }
        }
    }
