package com.example.letslearn

import kotlin.collections.ArrayList

class DataManager {
    lateinit var categories: ArrayList<CourseCategory>
    lateinit var courses: ArrayList<CourseInfo>
    private fun seedCategory(){
        categories = ArrayList()
        var cat = CourseCategory("development", "Development")
        categories.add(cat)
        cat = CourseCategory("machinelearning", "Machine Learning")
        categories.add(cat)
        cat = CourseCategory("distributed", "Distributed Computing")
        categories.add(cat)
    }

    private fun seedCourses(){
        courses = ArrayList()
        var course = CourseInfo("androiddev", "Android Development", "Learn Android Development with Kotlin", "Phil Hughes", "development")
        courses.add(course)
        course = CourseInfo("machineL1", "Machine Learning with Python", "Machine Learning with Python", "Tom Richardson", "machinelearning")
        courses.add(course)
        course = CourseInfo("machineL2", "Machine Learning Concepts", "Machine Learning Concepts", "Johny Sins", "machinelearning")
        courses.add(course)
        course = CourseInfo("distributed1", "Distributed Computing with Azure", "Distributed Computing with Azure", "Sam Robert", "distributed")
        courses.add(course)
    }
    init {
        seedCategory()
        seedCourses()
    }
}