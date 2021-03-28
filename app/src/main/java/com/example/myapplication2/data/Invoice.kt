package com.example.myapplication2.data

data class Invoice(
    val invoiceId: Int,
    val date: Int,
    val time: Int,
    val personId: Int,
    val personName: String,
    val invoiceDetails: String,
    val marketer: Int,
    val checkout: Boolean,
    val checkoutDate: String,
    val invoicePrice: Int,
    val phone: String,
    val user: String?
)