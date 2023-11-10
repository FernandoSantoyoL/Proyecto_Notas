package com.example.proyecto_notas.componentes
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Card
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController


/*fun BotonAgregar(navControler : NavController,modifier : Modifier = Modifier) {
FloatingActionButton(
    onClick = { navControler.navigate("Agregar")}
   ) {
    Icon(Icons.Filled.Add, "Localized description")
    
}
}*/

@Composable
fun BotonAgregar(
    navControler : NavController,
    modifier: Modifier = Modifier
) {
    var isTextClicked by remember { mutableStateOf(false) }
    FloatingActionButton(onClick = {
        navControler.navigate("Agregar")
    }) {
        Icon(Icons.Filled.Add,"")
    }
}