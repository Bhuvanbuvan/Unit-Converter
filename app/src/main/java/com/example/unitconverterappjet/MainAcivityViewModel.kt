package com.example.unitconverterappjet

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainAcivityViewModel:ViewModel() {
    var onePound:Double=2.205
    var Pound=MutableLiveData<Double>()

    fun covert(input:String){
        Pound.value=input.toInt()*onePound
    }
}