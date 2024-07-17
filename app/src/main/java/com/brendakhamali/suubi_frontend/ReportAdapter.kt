package com.brendakhamali.suubi_frontend

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

import com.brendakhamali.suubi_frontend.databinding.ReportLayoutBinding

class ReportAdapter(val reports: List<reportList>):RecyclerView.Adapter<ReportViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ReportViewHolder {
        var binding =ReportLayoutBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ReportViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ReportViewHolder, position: Int) {
//        val reportlist = reports[position]
//        holder.binding..text = reportlist.date
//        holder.binding..text = reportlist.saving.toString()
//        holder.binding..text = reportlist.balance.toString()

        val reportList = reports[position]
        holder.binding.tvDate.text=reportList.date
        holder.binding.tvSaving.text= reportList.saving.toString()
        holder.binding.tvBalance.text= reportList.balance.toString()

    }

    override fun getItemCount(): Int {
        return reports.size
    }
}
class ReportViewHolder(var binding: ReportLayoutBinding):RecyclerView.ViewHolder(binding.root){}


