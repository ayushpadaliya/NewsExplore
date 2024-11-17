package com.example.explore.dashboard.fragments
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.explore.R
import com.example.explore.databinding.FragmentHomeBinding
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

class HomeFragment : Fragment() {

    lateinit  var binding:FragmentHomeBinding
    private lateinit  var latestDate:String

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_home,container,false)
        //val date = Calendar.getInstance()
        val date = SimpleDateFormat("EEEE, dd MMMM",Locale.US)
        latestDate = date.format(Date())
        binding.tvDate.text = latestDate
        return binding.root
    }


}