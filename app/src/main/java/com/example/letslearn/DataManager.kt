package com.example.letslearn

import kotlin.collections.ArrayList

object DataManager {
    lateinit var categories: ArrayList<CourseCategory>
    lateinit var courses: ArrayList<CourseInfo>
    lateinit var notes : HashMap<String, ArrayList<Note>>
    var descr = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Etiam quis posuere nisl, nec euismod nisi. Fusce quis pellentesque odio. Praesent eget vestibulum eros. Pellentesque in neque molestie metus maximus blandit. Orci varius natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Donec ac ligula vel libero sollicitudin pulvinar eget at mauris. Phasellus ornare dictum neque vel viverra. Duis blandit est dapibus tristique convallis. Duis sit amet massa libero. Fusce vitae nibh porta, tincidunt felis in, rhoncus arcu. In hac habitasse platea dictumst. Duis blandit tortor ac eros porta porta. Sed congue metus ut ornare rhoncus. Aliquam vel pharetra lacus. Phasellus pretium eu elit sit amet sollicitudin. Nunc consequat iaculis porta. "

    private fun seedNotes(){
        notes = HashMap()
        for(c in courses){
            notes[c.courseID] = ArrayList()
        }
        var newNote = Note("Gradient Descent", "Gradient descent algorithm is to find the direction of movement to reduce the error rate.")
        notes["machineL1"]?.add(newNote)
        notes["machineL1"]?.add(newNote)
        notes["machineL1"]?.add(newNote)
        notes["machineL1"]?.add(newNote)

        newNote = Note("Gradient Descent", "Gradient descent algorithm is to find the direction of movement to reduce the error rate.")
        notes["androiddev"]?.add(newNote)
        notes["androiddev"]?.add(newNote)
        notes["androiddev"]?.add(newNote)
        notes["androiddev"]?.add(newNote)

        newNote = Note("Gradient Descent", "Gradient descent algorithm is to find the direction of movement to reduce the error rate.")
        notes["machineL2"]?.add(newNote)
        notes["machineL2"]?.add(newNote)
        notes["machineL2"]?.add(newNote)
        notes["machineL2"]?.add(newNote)

        newNote = Note("Gradient Descent", "Gradient descent algorithm is to find the direction of movement to reduce the error rate.")
        notes["distributed1"]?.add(newNote)
        notes["distributed1"]?.add(newNote)
        notes["distributed1"]?.add(newNote)
        notes["distributed1"]?.add(newNote)

    }
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
        var course = CourseInfo("androiddev", "Android Development", descr, "Phil Hughes", "development")
        courses.add(course)
        course = CourseInfo("machineL1", "Machine Learning with Python", descr, "Tom Richardson", "machinelearning")
        courses.add(course)
        course = CourseInfo("machineL2", "Machine Learning Concepts", descr, "Johny Sins", "machinelearning")
        courses.add(course)
        course = CourseInfo("distributed1", "Distributed Computing with Azure", descr, "Sam Robert", "distributed")
        courses.add(course)
    }
    init {
        seedCategory()
        seedCourses()
        seedNotes()
    }
}