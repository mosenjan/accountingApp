package com.example.myapplication2.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.myapplication2.R
import com.example.myapplication2.data.Invoice
import com.example.myapplication2.ui.adapter.InvoiceAdapter
import kotlinx.android.synthetic.main.fragment_invoice.*


class InvoiceFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {



        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_invoice, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        recyclerViewInvoice.adapter = data()?.let {
            InvoiceAdapter(it)
        }

        super.onViewCreated(view, savedInstanceState)
    }


    fun data():ArrayList<Invoice>{
        var data: ArrayList<Invoice> = ArrayList()

        data.add(Invoice(15,4545,2000,4545,"مجتمع آبان","پارکینگ هاشمیه",5656,false,"25/2/85",4800,"4542255221","آقای بازاریاب"))
        data.add(Invoice(15,4545,2000,4545,"مجتمع آبان","پارکینگ هاشمیه",5656,false,"25/2/85",4800,"4542255221","آقای بازاریاب"))
        data.add(Invoice(15,4545,2000,4545,"مجتمع آبان","پارکینگ هاشمیه",5656,false,"25/2/85",4800,"4542255221","آقای بازاریاب"))
        data.add(Invoice(15,4545,2000,4545,"مجتمع آبان","پارکینگ هاشمیه",5656,false,"25/2/85",4800,"4542255221","آقای بازاریاب"))
        data.add(Invoice(15,4545,2000,4545,"مجتمع آبان","پارکینگ هاشمیه",5656,false,"25/2/85",4800,"4542255221","آقای بازاریاب"))
        data.add(Invoice(15,4545,2000,4545,"مجتمع آبان","پارکینگ هاشمیه",5656,false,"25/2/85",4800,"4542255221","آقای بازاریاب"))
        data.add(Invoice(15,4545,2000,4545,"مجتمع آبان","پارکینگ هاشمیه",5656,false,"25/2/85",4800,"4542255221","آقای بازاریاب"))
        data.add(Invoice(15,4545,2000,4545,"مجتمع آبان","پارکینگ هاشمیه",5656,false,"25/2/85",4800,"4542255221","آقای بازاریاب"))
        data.add(Invoice(15,4545,2000,4545,"مجتمع آبان","پارکینگ هاشمیه",5656,false,"25/2/85",4800,"4542255221","آقای بازاریاب"))
        data.add(Invoice(15,4545,2000,4545,"مجتمع آبان","پارکینگ هاشمیه",5656,false,"25/2/85",4800,"4542255221","آقای بازاریاب"))

        return data
    }

}