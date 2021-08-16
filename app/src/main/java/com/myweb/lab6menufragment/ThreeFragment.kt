package com.myweb.lab6menufragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.myweb.lab6menufragment.databinding.FragmentThreeBinding
import com.myweb.lab6menufragment.databinding.FragmentTwoBinding


class ThreeFragment : Fragment() {

   private lateinit var bindingFrag : FragmentThreeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        bindingFrag = FragmentThreeBinding.inflate(layoutInflater)
        bindingFrag.btnClickFragThree.setOnClickListener() {
            val toast = Toast.makeText(context, "Click on Fragment Three", Toast.LENGTH_SHORT)
            toast.show()
        }
        return bindingFrag.root
    }
}
