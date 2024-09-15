package com.example.jetbmicalculator

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    // MainActivityだとrememberで明示的にメモリに保持する必要があったが
    // ViewModelではrememberは不要になる
    var height by mutableStateOf("")
    var weight by mutableStateOf("")
}