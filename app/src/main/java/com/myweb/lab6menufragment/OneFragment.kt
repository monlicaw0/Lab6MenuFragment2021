package com.myweb.lab6menufragment

import android.os.Bundle
import android.renderscript.ScriptGroup
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.myweb.lab6menufragment.databinding.ActivityMainBinding
import com.myweb.lab6menufragment.databinding.FragmentOneBinding

class OneFragment : Fragment() {
    private lateinit var bindingFrag: FragmentOneBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        bindingFrag = FragmentOneBinding.inflate(layoutInflater)
        bindingFrag.btnClickFragOne.setOnClickListener(){
            var fragment : Fragment? = null
            fragment = TwoFragment()
            replaceFragment(fragment)
        }
        return bindingFrag.root
    }
    fun replaceFragment(someFragment:Fragment){
        var binding: ActivityMainBinding
        binding = ActivityMainBinding.inflate(layoutInflater)


        val transaction = requireActivity().supportFragmentManager.beginTransaction()
        //transaction.replace(R.id.frameLayout, someFragment)
        transaction.replace(binding.frameLayout.id, someFragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }
}
