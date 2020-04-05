package com.example.letslearn

data class CourseInfo(val courseID: String, var courseTitle: String, var courseDesc: String, var instructors: String, var category: String) {
    override fun toString(): String {
        return courseTitle
    }
}

data class CourseCategory(val categoryId: String, var categoryTitle: String) {
    override fun toString(): String {
        return categoryTitle
    }
}

data class Note(var noteTitle: String, var note: String) {
}