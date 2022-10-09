package org.lorenzo.modules.graphql.tables

import org.jetbrains.exposed.sql.Table

internal object Languages: Table() {
    val id = integer("id").autoIncrement()
    val name = varchar("name", 128)
    val code = varchar("code", 2)

    override val primaryKey = PrimaryKey(id)
    override val tableName = "language"
}