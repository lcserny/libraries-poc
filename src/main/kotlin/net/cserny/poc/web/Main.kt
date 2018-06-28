package net.cserny.poc.web

import spark.Spark

class Main {
    fun main(args: Array<String>) {
        Spark.get("/hello") { _, _ -> "Hello Spark Kotlin" }
    }
}