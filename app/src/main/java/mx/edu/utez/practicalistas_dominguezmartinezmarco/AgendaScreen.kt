package mx.edu.utez.practicalistas_dominguezmartinezmarco
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AgendaScreen(
    agendaViewModel: AgendaViewModel = viewModel()
) {
    val personas by agendaViewModel.personas.collectAsState()

    Scaffold(
        containerColor = Color(0xFFF9F6FE),
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        text = "Agenda",
                        fontSize = 28.sp,
                        fontWeight = FontWeight.Bold
                    )
                },
                actions = {
                    IconButton(onClick = { /* Acción de búsqueda */ }) {
                        Icon(imageVector = Icons.Default.Search, contentDescription = "Buscar")
                    }
                    IconButton(onClick = { /* Opciones */ }) {
                        Icon(imageVector = Icons.Default.MoreVert, contentDescription = "Más opciones")
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Color(0xFFF9F6FE)
                )
            )
        },
        floatingActionButton = {
            FloatingActionButton(
                onClick = { /* Acción agregar */ },
                containerColor = Color(0xFFE8DEF8),
                contentColor = Color(0xFF1D192B)
            ) {
                Icon(imageVector = Icons.Default.Add, contentDescription = "Agregar Persona")
            }
        }
    ) { innerPadding ->
        PersonaList(
            personas = personas,
            modifier = Modifier.padding(horizontal = 16.dp),
            contentPadding = innerPadding
        )
    }
}