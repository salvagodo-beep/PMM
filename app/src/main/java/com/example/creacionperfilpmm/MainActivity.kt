package com.example.creacionperfilpmm

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.creacionperfilpmm.ui.theme.CreacionPerfilPMMTheme


class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        enableEdgeToEdge()

        setContent {
            CreacionPerfilPMMTheme {

                Scaffold(
                    modifier = Modifier.fillMaxSize()
                ) { innerPadding ->

                    ProfileScreen(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}


@Composable
fun ProfileScreen(
    modifier: Modifier = Modifier
) {

    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(24.dp),

        horizontalAlignment = Alignment.CenterHorizontally,

        verticalArrangement = Arrangement.Center
    ) {

        // FOTO DE PERFIL
        ArtistAvatar()

        Spacer(
            modifier = Modifier.height(16.dp)
        )

        // NOMBRE
        Text(
            text = "Sofía López",
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(
            modifier = Modifier.height(8.dp)
        )

        // DESCRIPCIÓN
        Text(
            text = "Community Manager y Diseñadora Gráfica",
            fontSize = 16.sp
        )

        Spacer(
            modifier = Modifier.height(24.dp)
        )

        // ESTADÍSTICAS
        Row(
            horizontalArrangement = Arrangement.spacedBy(40.dp)
        ) {

            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                Text(
                    text = "120",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold
                )

                Text(
                    text = "Seguidores"
                )
            }

            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                Text(
                    text = "85",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold
                )

                Text(
                    text = "Seguidos"
                )
            }
        }
    }
}


@Composable
fun ArtistAvatar() {

    Box(
        modifier = Modifier.size(140.dp)
    ) {

        Image(
            painter = painterResource(
                id = R.drawable.images
            ),
            contentDescription = "Foto de perfil",
            modifier = Modifier.fillMaxSize()
        )

        Text(
            text = "✓",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.align(Alignment.BottomEnd)
        )
    }
}


@Preview(showBackground = true)
@Composable
fun ProfileScreenPreview() {

    CreacionPerfilPMMTheme {
        ProfileScreen()
    }
}