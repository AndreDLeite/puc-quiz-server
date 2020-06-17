package com.puc.quiz.model

data class StatusResponseEntity<T> (val status: Boolean, val message: String, val entity: T?)
