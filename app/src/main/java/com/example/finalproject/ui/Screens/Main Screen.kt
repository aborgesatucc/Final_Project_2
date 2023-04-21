package com.example.finalproject.ui.Screens

import android.content.Intent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.LocalContext
import com.example.finalproject.ui.SimpleAppScreens

@ExperimentalMaterial3Api
@Composable
fun mainScreen(

) {
    val intent = Intent(Intent.ACTION_SEND).apply {
        type = "text/plain"
        putExtra(Intent.EXTRA_SUBJECT, "Main1Screen")
        putExtra(Intent.EXTRA_TEXT, "test")
    }

    val context = LocalContext.current

    Scaffold(
        floatingActionButton = {
            FloatingActionButton(onClick = {onHabitslistButtonClicked}) {

            }
        },
        topBar = {
            SmallTopAppBar (
                title = { Text("TODO")
                },
                colors = TopAppBarDefaults.smallTopAppBarColors(
                    containerColor = MaterialTheme.colorScheme.surfaceVariant,
                    titleContentColor = MaterialTheme.colorScheme.onSurfaceVariant
                )
                    )
        }

    ) { values ->
        LazyColumn(contentPadding = values) {
                
            }

        }
    Column() {
        
    }
    

    }