package com.akirachix.enwalletapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView

//class EnwalletAdaptor(var walletList: List<Enwallet>):RecyclerView.Adapter<walletViewHolder>() {
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): walletViewHolder {
//        val itemView = LayoutInflater.from(parent.context)
//            .inflate(R.layout.recylerview_adaptor, parent,false)
//        return walletViewHolder(itemView)
//
//    }
//
//    override fun onBindViewHolder(holder: walletViewHolder, position: Int) {
//
//    }
//
//    override fun getItemCount(): Int {
//
//    }
//}
//class walletViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
//    val tvImage1 = itemView.findViewById<TextView>(R.id.tvImage1)
//    val tvImage2 = itemView.findViewById<TextView>(R.id.tvImage2)
//    val tvImage3 = itemView.findViewById<TextView>(R.id.tvImage03)
//    val tvImage4 = itemView.findViewById<TextView>(R.id.tvImage4)
//}
//class ContactsAdaptor(var contactsList: List<Contact>): RecyclerView.Adapter<contactsViewHolder>() {
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): contactsViewHolder {
//        val itemView = LayoutInflater.from(parent.context)
//            .inflate(R.layout.contact_list_item, parent,false)
//        return contactsViewHolder(itemView)
//    }
//
//    override fun getItemCount(): Int {
//
//    }
//
//    override fun onBindViewHolder(holder: contactsViewHolder, position: Int) {
//        val contact = contactsList[position]
//        holder.tvName.text =contact.name
//        holder.tvPhoneNumber.text = contact.phoneNumber
//        holder.tvEmail.text = contact.email
//    }
//}
//
//class contactsViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
//    val tvName = itemView.findViewById<TextView>(R.id.tvName)
//    val tvPhoneNumber = itemView.findViewById<TextView>(R.id.tvPhoneNumber)
//    val tvEmail = itemView.findViewById<TextView>(R.id.tvEmail)
//}