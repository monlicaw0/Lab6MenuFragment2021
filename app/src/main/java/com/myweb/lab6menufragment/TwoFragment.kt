package com.myweb.lab6menufragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.myweb.lab6menufragment.databinding.FragmentOneBinding
import com.myweb.lab6menufragment.databinding.FragmentTwoBinding


class TwoFragment : Fragment() {

    private lateinit var bindingFrag: FragmentTwoBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        bindingFrag = FragmentTwoBinding.inflate(layoutInflater)
        bindingFrag.btnClickFragTwo.setOnClickListener(){
            val toast = Toast.makeText(context,"Click on Fragment Two", Toast.LENGTH_SHORT)
            toast.show()
        }
        return bindingFrag.root
    }
}


