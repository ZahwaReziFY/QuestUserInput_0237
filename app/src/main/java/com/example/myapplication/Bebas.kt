package com.example.myapplication

import androidx.compose.material3.OutlinedTextField
import androidx.compose.runtime.Composable

@Composable
fun FormDataDiri(modifier: Modefier){
    //variabel-variabel untuk mengingat nilai masukan dari keyboard
    var textNama by remember {mutableStateOf( value = "")}
    var textAlamat by remember {mutableStateOf( value = "")}
    var textJK by remember {mutableStateOf( value = "")}
    val gender:List<String> = listOf("Laki-Laki","Perempuan")

    //variabel-variabel untuk menyimpan data yang diperoleh dari komponen UI
    var nama by remember {mutableStateOf( value = "")}
    var alamat by remember {mutableStateOf( value = "")}
    var jenis by remember {mutableStateOf( value = "")}

    Column(modifier = Modifier.padding(top = 50.dp),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally) {
        OutlinedTextField(
            value = textNama,
            singleLine = true,
            shape = MaterialTheme.shapes.large,
            modifier = Modifier.width(250.dp)
            label = { Text(text = "Nama Lengkap") },
            onValueChange = {
                textNama = it
            }
        )
        Row {
            gender.forEach { item ->
                Row(modifier = Modifier.selectable(
                    selected = textJK == item,
                    onClick = { textJK = item }
                ), verticalAlignment = Alignment.CenterVertically) {
                    RadioButton(
                        selected = textJK == item,
                        onClick = {
                            textJK = item
                        })
                    Text(item)
                }
            }
        }
        OutlinedTextField(
            value = textAlamat,
            singleLine = true,
            modifier = Modifier.width(250.dp),
            label = { Text("Alamat") },
            onValueChange = {
                textAlamat = it
            }
        )
}