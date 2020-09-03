package com.raitapiasf.userinterface

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.fragment_example.*

class ExampleFragment : Fragment() {
    // TODO: Rename and change types of parameters

    private var title: String = ""
    private var selectedColor: Int = 0

    companion object {
        private val ARG_TITLE="ARG_TITLE"
        private val ARG_COLOR = "ARG_COLOR"
        fun newInstance(title:String , color:Int): ExampleFragment {
            val fragment = ExampleFragment()
            val args =Bundle()
            args.putString(ARG_TITLE, title)
            args.putInt(ARG_COLOR, color)
            fragment.arguments = args
            return fragment
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if(arguments!=null){
            title= arguments!!.getString(ARG_TITLE).toString()
            selectedColor= arguments!!.getInt(ARG_COLOR)
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater!!.inflate(R.layout.fragment_example, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        configureView()
    }

    private fun configureView() {
        if (selectedColor!=0){
            viewContainer.setBackgroundColor(ContextCompat.getColor(activity!!,selectedColor))
        }
        textTitle.text = title

    }


}