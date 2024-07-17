package com.brendakhamali.suubi_frontend

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager

import com.brendakhamali.suubi_frontend.databinding.ActivityReportLayoutBinding

class report_layout : AppCompatActivity() {
    lateinit var binding: ActivityReportLayoutBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

       binding = ActivityReportLayoutBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.rvReport.layoutManager= LinearLayoutManager(this)

        binding.imgHome2.setOnClickListener {
            val intent = Intent(this, loans_section_Activity::class.java)
            startActivity(intent)
        }

        displayReports()

    }

    fun displayReports(){
        val report = reportList("12/2/24", 2000.0, 2000.0 )
        val report1 = reportList("12/2/24", 2000.0, 4000.0 )
        val displaylist = listOf(report,report1)

        val listAdapter = ReportAdapter(displaylist)
        binding.rvReport.adapter=listAdapter
    }

}


