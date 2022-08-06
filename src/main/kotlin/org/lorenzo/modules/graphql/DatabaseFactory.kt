package org.lorenzo.modules.graphql

import org.jetbrains.exposed.sql.Database
import org.jetbrains.exposed.sql.SchemaUtils
import org.jetbrains.exposed.sql.transactions.transaction
import org.lorenzo.modules.graphql.tables.Languages

object DatabaseFactory {

    fun init() {

        val driverClassName = "org.postgresql.Driver"
        val jdbcUrl = "jdbc:postgresql://localhost:5432/postgres?user=postgres&password=mysecretpassword"
        val database = Database.connect(jdbcUrl, driverClassName)
        transaction(database) {
            SchemaUtils.create(Languages)
        }
    }
}