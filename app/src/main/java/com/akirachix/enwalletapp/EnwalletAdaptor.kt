package com.akirachix.enwalletapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView

class EnwalletAdaptor(var enWallet: List<Enwallet>):RecyclerView.Adapter<EnwalletViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EnwalletViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.recylerview_adaptor,parent,false)
        return EnwalletViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return enWallet.size
    }

    override fun onBindViewHolder(holder: EnwalletViewHolder, position: Int) {
        val wallet = enWallet[position]
        holder.tvSalary.text = wallet.salary
        holder.idSalaryAmount.text = wallet.amount
        holder.idSalaryDate.text = wallet.date


    }

}
class EnwalletViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
    val tvSalary = itemView.findViewById<TextView>(R.id.tvSalary)
    val idSalaryAmount = itemView.findViewById<TextView>(R.id.idSalaryAmount)
    val idSalaryDate = itemView.findViewById<TextView>(R.id.idSalaryDate)
}


