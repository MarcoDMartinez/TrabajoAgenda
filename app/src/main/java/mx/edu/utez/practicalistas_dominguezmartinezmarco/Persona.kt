package mx.edu.utez.practicalistas_dominguezmartinezmarco


import androidx.compose.ui.graphics.Color

data class Persona(
    val id: Int,
    val nombre: String,
    val edad: Int,
    val genero: String,
    val telefono: String,
    val email: String,
    val colorAvatar: Color
)