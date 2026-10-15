package com.example.myapplication

import androidx.compose.runtime.Composable

@Composable
fun FormDataDiri(modifier: Modefier){
    //variabel-variabel untuk mengingat nilai masukan dari keyboard
    var textNama by remember {mutableStateOf( value = "")}
    var textAlamat by remember {mutableStateOf( value = "")}
    var textJK by remember {mutableStateOf( value = "")}
}