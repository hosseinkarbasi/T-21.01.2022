package com.example.tamrinclassi21012022

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.fragment.app.Fragment

class FootFragment : Fragment(R.layout.foot_fragment) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var footImage = view.findViewById<ImageView>(R.id.imageView)
        var counter = 1
        var resID: Int
        footImage.setOnClickListener {
            if (counter > 13) counter = 1
            resID = resources.getIdentifier(
                "legs$counter",
                "drawable",
                "com.example.tamrinclassi21012022"
            )
            footImage.setImageResource(resID)
            counter++

        }
    }
}