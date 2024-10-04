package com.example.quadrant_compose


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.layout.weight
import com.example.quadrant_compose.ui.theme.Quadrant_composeTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Quadrant_composeTheme {
                setContent {
                    QuadrantScreen()
                }
            }
        }
    }
}

@Composable
fun QuadrantScreen() {
    Row(modifier = Modifier.fillMaxSize()) {
        // Deux colonnes côte à côte pour les quadrants
        Column(
            modifier = Modifier.weight(1f)
        ) {
            Quadrant(
                title = "Text composable",
                description = "Displays text and follows the recommended Material Design guidelines.",
                backgroundColor = Color(0xFFEADDFF)
            )
            Quadrant(
                title = "Row composable",
                description = "A layout composable that places its children in a horizontal sequence.",
                backgroundColor = Color(0xFFF6EDFF)
            )
        }
        Column(
            modifier = Modifier.weight(1f)
        ) {
            Quadrant(
                title = "Image composable",
                description = "Creates a composable that lays out and draws a given Painter class object.",
                backgroundColor = Color(0xFFD0BCFF)
            )
            Quadrant(
                title = "Column composable",
                description = "A layout composable that places its children in a vertical sequence.",
                backgroundColor = Color(0xFFB69DF8)
            )
        }
    }
}

@Composable
fun Quadrant(title: String, description: String, backgroundColor: Color) {
    Column(
        modifier = Modifier
            .background(color = backgroundColor)
            .padding(16.dp)
            .fillMaxWidth()
            .weight(1f),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = title,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 16.dp),
            fontSize = 16.sp
        )
        Text(
            text = description,
            fontSize = 16.sp
        )
    }
}

@Preview(showBackground = true)
@Composable
fun QuadrantScreenPreview() {
    Surface {
        QuadrantScreen()
    }
    }