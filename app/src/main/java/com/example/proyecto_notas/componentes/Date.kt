package com.example.proyecto_notas.componentes
/*
import android.content.Context
import android.widget.DatePicker
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.DatePickerDialog
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.key.Key.Companion.Calendar
import androidx.compose.ui.unit.dp
import java.util.Calendar.getInstance
import java.util.Date

@Composable
fun showDatePicker(context: Context){

    val year: Int
    val month: Int
    val day: Int

    val calendar = getInstance()
    year = calendar.get(Calendar.YEAR)
    month = calendar.get(Calendar.MONTH)
    day = calendar.get(Calendar.DAY_OF_MONTH)
    calendar.time = Date()

    val date = remember { mutableStateOf("")}
    val datePickerDialog = DatePickerDialog(
        context,
        { : DatePicker, year: Int, month: Int, dayOfMonth: Int ->
            date.value = "$dayOfMonth/$month/$year"
        }, year, month, day
    )
    Column (
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arragment.Center,
        horizontalAlignment = Aligment.CenterHorizontally
    ){
        Text(text = "Selected Date: ${date.value}")
        Spacer(modifier = Modifier.size(16.dp))
        Button(onClick = {
            datePickerDialog.show()
        }) {
            Text(text = "Open Date Picker")
        }
    }

    }

 */












