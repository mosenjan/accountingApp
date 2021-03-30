package com.example.myapplication2.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.myapplication2.R
import com.example.myapplication2.data.Person
import com.example.myapplication2.ui.adapter.PersonAdapter
import kotlinx.android.synthetic.main.fragment_invoice.*
import kotlinx.android.synthetic.main.fragment_person.*
import kotlinx.android.synthetic.main.fragment_person.iv_back

class PersonFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {




        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_person, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        recyclerViewPerson.adapter = data()?.let { it ->
            PersonAdapter(it)
         }

        onClick()

    }

    fun onClick(){
        iv_back.setOnClickListener {
            findNavController().navigate(PersonFragmentDirections.actionPersonFragmentToHomeFragment())
        }
    }

    fun data():ArrayList<Person>{
        var data: ArrayList<Person> = ArrayList()
            data.add(Person(12,"محسن عسگرزاده","پسرگل","09352666892","مشهد - میدان مرکزی - پلاک 85"))
            data.add(Person(12,"ایمان علیزاده","برنامه نویس","3212125565","مشهد - میدان مرکزی - پلاک 85"))
            data.add(Person(12,"ابولفضل رستگار","برنامه نویس","454565555","مشهد - میدان مرکزی - پلاک 85"))
            data.add(Person(12,"مجتبی دلیر","بیکار","4465458787","مشهد - میدان مرکزی - پلاک 85"))
            data.add(Person(12,"مهدی خاکشوران","تکنسین","8787895665","مشهد - میدان مرکزی - پلاک 85"))
            data.add(Person(12,"حجت عسگری","تکنسین","8787895665","مشهد - میدان مرکزی - پلاک 85"))
            data.add(Person(12,"علی سلطانی","تکنسین","8787895665","مشهد - میدان مرکزی - پلاک 85"))

        return data
    }

}