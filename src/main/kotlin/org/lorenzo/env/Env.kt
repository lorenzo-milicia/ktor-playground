package org.lorenzo.env

data class Env(
    val dataSource: DataSource = DataSource()
) {

    data class DataSource(
        val url: String = "jdbc:postgresql://localhost:5432/postgres",
        val user: String = "postgres",
        val password: String = "mysecretpassword",
        val driver: String = "org.postgresql.Driver",
    )
}
