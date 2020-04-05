package com.example.letslearn

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_notes_list3.*
import kotlinx.android.synthetic.main.listview.*

class NotesList : AppCompatActivity() {

    private val tag = "noteslistactivity"
    private lateinit var courseId: String
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_notes_list3)
        courseId = intent.extras?.get("id").toString()
        populateNotesList(courseId)
    }

    private fun populateNotesList(id: String){
        val courseNotes = DataManager.notes[id]
        if (courseNotes != null) {
            listview.adapter = ArrayAdapter(this, R.layout.listitem, courseNotes.toArray())
        }
    }
}
