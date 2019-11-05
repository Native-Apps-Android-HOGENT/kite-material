package be.equality.kitematerials.database

import androidx.room.TypeConverter
import java.util.*

/**
 *  [DateConverter] converts a [Date] class to and from the equivalent Unix timestamp
 *  in the database.
 */
class DateConverter(){

    @TypeConverter
    fun fromTimestamp(value: Long?): Date? {
        return value?.let { Date(it) }
    }

    @TypeConverter
    fun dateToTimestamp(date: Date?): Long? {
        return date?.time?.toLong()
    }
}