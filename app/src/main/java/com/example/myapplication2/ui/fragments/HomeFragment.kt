package com.example.myapplication2.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.myapplication2.R
import kotlinx.android.synthetic.main.fragment_home.*


class HomeFragment : Fragment() {



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

/*




 */
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }



    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        onClick()

    }


    private fun onClick(){

        btnShop.setOnClickListener(View.OnClickListener {
            findNavController().navigate(HomeFragmentDirections.actionHomeFragmentToSaleFragment())
        })

        btnPerson.setOnClickListener {
            findNavController().navigate(HomeFragmentDirections.actionHomeFragmentToPersonFragment())
        }

        btnBuy.setOnClickListener {
            findNavController().navigate(HomeFragmentDirections.actionHomeFragmentToInvoiceFragment())
        }

        btnSetting.setOnClickListener {
           // findNavController().navigate(HomeFragmentDirections.actionHomeFragmentToInvoiceFragment())
            findNavController().navigate(HomeFragmentDirections.actionHomeFragmentToSettingFragment())
        }

        ivAccount.setOnClickListener {
            findNavController().navigate(HomeFragmentDirections.actionHomeFragmentToProfileFragment())

        }




    }

}