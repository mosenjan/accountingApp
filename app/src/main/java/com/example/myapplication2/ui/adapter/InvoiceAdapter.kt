package com.example.myapplication2.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication2.R
import com.example.myapplication2.data.Invoice


class InvoiceAdapter(private val invoiceList: List<Invoice>) :
    RecyclerView.Adapter<InvoiceAdapter.ViewHolder>() {
    private lateinit var context: Context

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        context = parent.context
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_item_invoice, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {


        holder.txtProfileName.text = invoiceList[position].personName
        holder.txtInvoiceDetails.text = invoiceList[position].invoiceDetails
        holder.txtDate.text = invoiceList[position].date.toString()
        holder.txtinvoicePrice.text = invoiceList[position].invoicePrice.toString()


        /*      holder.txtProfileName.setOnClickListener { v ->
                  personList[position].author?.username?.let {
                      v.findNavController()
                          .navigate(HomeFragmentDirections.actionHomepageFragmentToProfileFragment(
                              username = it))
                  }
              }
              holder.txtBody.setOnClickListener { v ->
                  personList[position].slug?.let {
                      v.findNavController().navigate(
                          HomeFragmentDirections.actionHomepageFragmentToArticleDetailsFragment(slug = it))
                  }
              }*/
    }

    override fun getItemCount(): Int {
        return invoiceList.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val txtProfileName: TextView = itemView.findViewById(R.id.txtPersonName)
        val txtInvoiceDetails: TextView = itemView.findViewById(R.id.txtInvoiceDetails)
        val txtDate: TextView = itemView.findViewById(R.id.txtDate)
        val txtinvoicePrice: TextView = itemView.findViewById(R.id.txtInvoicePrice)

    }

}
