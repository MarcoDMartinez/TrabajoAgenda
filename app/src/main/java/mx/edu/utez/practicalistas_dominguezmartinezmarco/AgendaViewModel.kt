package mx.edu.utez.practicalistas_dominguezmartinezmarco

import androidx.compose.ui.graphics.Color
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class AgendaViewModel : ViewModel() {

    private val _personas = MutableStateFlow<List<Persona>>(emptyList())
    val personas: StateFlow<List<Persona>> = _personas.asStateFlow()

    init {
        cargarPersonas()
    }

    private fun cargarPersonas() {
        _personas.value = listOf(
            Persona(1, "Carlos Mendoza", 28, "Masculino", "+52 55 1234 5678", "carlos.mendoza@email.com",
                Color(0xFF7E57C2)
            ),
            Persona(2, "Ana Lucía Torres", 24, "Femenino", "+52 81 9876 5432", "ana.torres@gmail.com",
                Color(0xFFEC407A)
            ),
            Persona(3, "Alejandro Ríos", 35, "Masculino", "+52 33 4567 8901", "a.rios@outlook.com",
                Color(0xFF00ACC1)
            ),
            Persona(4, "Sofía Guerrero", 31, "Femenino", "+52 55 8765 4321", "sofia.g@empresa.com",
                Color(0xFF66BB6A)
            ),
            Persona(5, "Roberto Gómez", 29, "Masculino", "+52 55 2345 6789", "roberto.gomez@gmail.com",
                Color(0xFFFFB74D)
            ),
            Persona(6, "Mariana Hernández", 26, "Femenino", "+52 81 1122 3344", "marianah@outlook.com",
                Color(0xFFAB47BC)
            ),
            Persona(7, "Diego Fernández", 40, "Masculino", "+52 33 9988 7766", "diego.f@empresa.com",
                Color(0xFF42A5F5)
            ),
            Persona(8, "Valeria Morales", 22, "Femenino", "+52 55 5544 3322", "valeria.m@email.com",
                Color(0xFFFF7043)
            )
        )
    }
}