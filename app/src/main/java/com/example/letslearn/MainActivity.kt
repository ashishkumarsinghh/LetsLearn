package com.example.letslearn

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.main_activity.*

class MainActivity : AppCompatActivity() {

    private val tag = "LetsLearnMainActivity"
    private lateinit var setCategory: String
    private lateinit var setCourse: String
    private lateinit var notesIntent: Intent

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        notesIntent = Intent(this, NotesList::class.java )
        button.setOnClickListener { startActivity(notesIntent) }
        addCategorySpinner ()
    }

    private fun addCategorySpinner() {
        spnrCategory.adapter = ArrayAdapter(
            this, R.layout.category,
            R.id.tvCategoryItem, DataManager.categories.toArray()
        )
        spnrCategory.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(parent: AdapterView<*>?) {
                TODO("Not yet implemented")
            }
            override fun onItemSelected(
                parent: AdapterView<*>?, view: View?, position: Int, id: Long
            ) {
                setCategory = DataManager.categories[id.toInt()].categoryId
                Log.d(tag, setCategory)
                addCourSpinnerAdapter()
            }
        }
    }

    private fun addCourSpinnerAdapter() {
        val courseArr = DataManager.courses.filter { course -> course.category == setCategory }
        spnrCourse.adapter = ArrayAdapter(this, R.layout.course, R.id.tvCourseItem, courseArr)
        spnrCourse.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(parent: AdapterView<*>?) {
                TODO("Not yet implemented")
            }
            override fun onItemSelected(
                parent: AdapterView<*>?, view: View?, position: Int, id: Long
            ) {
                setCourse =  courseArr[id.toInt()].courseID
                notesIntent.putExtra("id", setCourse)
                instructors.text = courseArr[id.toInt()].instructors
                description.text = courseArr[id.toInt()].courseDesc
            }
        }
    }
}
