package com.example.tamrinclassi21012022

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.fragment.app.Fragment

class BodyFragment : Fragment(R.layout.body_fragment) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var bodyImage = view.findViewById<ImageView>(R.id.imageView)
        var counter = 1
        var resID: Int
        bodyImage.setOnClickListener {
            if (counter > 13) counter = 1
            resID = resources.getIdentifier(
                "body$counter",
                "drawable",
                "com.example.tamrinclassi21012022"
            )
            bodyImage.setImageResource(resID)
            counter++

        }
    }
}