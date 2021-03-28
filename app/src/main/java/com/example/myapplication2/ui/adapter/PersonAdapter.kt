package com.example.myapplication2.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication2.R
import com.example.myapplication2.data.Person


class PersonAdapter(private val personList: List<Person>) :
    RecyclerView.Adapter<PersonAdapter.ViewHolder>() {
    private lateinit var context: Context

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        context = parent.context
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_item_person, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {


        holder.txtProfileName.text = personList[position].name
        holder.txtAddress.text = personList[position].address
        holder.txtPhone.text = personList[position].phone
        holder.txtId.text = personList[position].id.toString()
        holder.txtStatus.text = personList[position].status


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
        return personList.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val txtProfileName: TextView = itemView.findViewById(R.id.txtPersonName)
        val txtAddress: TextView = itemView.findViewById(R.id.txtInvoiceDetails)
        val txtPhone: TextView = itemView.findViewById(R.id.txtDate)
        val txtStatus: TextView = itemView.findViewById(R.id.txtInvoicePrice)
        val txtId: TextView = itemView.findViewById(R.id.txtId)

    }

}
