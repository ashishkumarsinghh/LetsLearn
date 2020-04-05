package com.example.letslearn

import android.annotation.SuppressLint
import android.app.Activity
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView

class NotesAdapter(private val context: Activity, private val notes: ArrayList<Note>):ArrayAdapter<Note>(context, R.layout.noteslist, notes){
    @SuppressLint("ViewHolder", "InflateParams")
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val inflater = context.layoutInflater
        val rowView = inflater.inflate(R.layout.noteslist, null, true)
        val titleText = rowView.findViewById(R.id.title) as TextView
        val descrText = rowView.findViewById(R.id.description) as TextView
        titleText.text=notes[position].noteTitle
        descrText.text=notes[position].note
        return rowView
    }
}