package com.example.tamrinclassi21012022

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.fragment.app.Fragment

class HeadFragment : Fragment(R.layout.fragment_head) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var headImage = view.findViewById<ImageView>(R.id.imageView)
        var counter = 1
        var resID: Int
        headImage.setOnClickListener {
            if (counter > 13) counter = 1
            resID = resources.getIdentifier(
                "head$counter",
                "drawable",
                "com.example.tamrinclassi21012022"
            )
            headImage.setImageResource(resID)
            counter++
        }
    }
}