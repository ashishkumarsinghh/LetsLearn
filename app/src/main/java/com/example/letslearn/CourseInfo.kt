package com.example.letslearn

class CourseInfo(val courseID: String, var courseTitle: String, var courseDesc: String, var instructors: String, var category: String) {
    override fun toString(): String {
        return courseTitle
    }
}

class CourseCategory(val categoryId: String, var categoryTitle: String) {
    override fun toString(): String {
        return categoryTitle
    }
}

class Note(var noteTitle: String, var note: String) {
    override fun toString(): String {
        return noteTitle
    }
}