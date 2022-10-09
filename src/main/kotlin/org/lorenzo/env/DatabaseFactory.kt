package org.lorenzo.env

import org.jetbrains.exposed.sql.Database
import org.jetbrains.exposed.sql.SchemaUtils
import org.jetbrains.exposed.sql.transactions.transaction
import org.lorenzo.modules.graphql.tables.Languages

object DatabaseFactory {

    fun init() {
        val database = Database.connect(
            url = "org.postgresql.Driver",
            driver = "jdbc:postgresql://localhost:5432/postgres",
            user = "postgres",
            password = "mysecretpassword"
        )
        transaction(database) {
            SchemaUtils.create(Languages)
        }
    }
}