package be.equality.kitematerials.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import java.util.*


@Entity(
    tableName = "owned_kite_object",
    foreignKeys = [
    ForeignKey(entity = KiteObject::class, parentColumns = ["id"],
        childColumns = ["kite_object_id"])
    ]
)
data class OwnedKiteObject(

    @ColumnInfo(name = "kite_object_id") val kiteObjectId: Int,

    @ColumnInfo(name = "date_bought") val dateBought : Date,

    @ColumnInfo(name = "price_bought") val priceBought : Double,

    @ColumnInfo(name = "times_used") val timesUsed : Int,

    @ColumnInfo(name = "date_last_used") val dateLastUsed : Date

    ) {
}