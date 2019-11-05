package be.equality.kitematerials.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*


/**
 * Entity object which stores the information for a KiteObject into the database.
 */

@Entity(tableName = "kite_objects")
data class KiteObject(
    @PrimaryKey @ColumnInfo(name = "id")
    val kiteObjectId : Int,
    val name: String,
    val brand: String,
    val price : Double,
    val description: String,
    val dateManufactured: Date) {



    override fun toString(): String {
        return name
    }
}