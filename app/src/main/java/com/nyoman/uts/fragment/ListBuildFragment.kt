package com.nyoman.uts.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.nyoman.uts.Build
import com.nyoman.uts.BuildAdapter
import com.nyoman.uts.R



class ListBuildFragment : Fragment() {

    private lateinit var adapter: BuildAdapter
    private lateinit var recyclerView: RecyclerView
    private lateinit var komikArrayList: ArrayList<Build>

    lateinit var image: Array<Int>
    lateinit var title: Array<String>
    lateinit var descriptions: Array<String>


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_listbuild, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        dataInitalize()
        val layoutManager = LinearLayoutManager(context)
        recyclerView = view.findViewById(R.id.rv_build)
        recyclerView.layoutManager = layoutManager
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = adapter

    }

    private fun dataInitalize() {
        komikArrayList = arrayListOf<Build>()
        image = arrayOf(
            R.drawable.heptaseas,
            R.drawable.wind,
            R.drawable.corrosion,
            R.drawable.war,
            R.drawable.guardian,

            )
        title = arrayOf(
            "Blade of the Heptaseas",
            "Wind of Nature",
            "Corrosion Scythe",
            "War Axe",
            "Guardian Helmet",
        )
        descriptions = arrayOf(
            "Meningkatkan damage basic attack jika tidak menyerang/diserang selama 5 detik",
            "Kebal terhadap physical damage selama 1 detik",
            "Mendapatkan stack attack speed",
            "Mendapatkan stack serangan",
            "Memulihkan nyawa jika tidak menerima serangan",

        )
        for (i in image.indices) {
            val komik = Build(image[i], title[i], descriptions[i])
            komikArrayList.add(komik)
        }
    }
}