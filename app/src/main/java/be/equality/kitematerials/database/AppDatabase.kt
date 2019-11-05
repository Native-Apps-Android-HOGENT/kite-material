package be.equality.kitematerials.database

import android.content.Context
import androidx.room.*
import be.equality.kitematerials.Util.DATABASE_NAME


@Database(entities = [KiteObject::class, OwnedKiteObject::class], version = 1, exportSchema = false)
@TypeConverters(DateConverter::class)
abstract class AppDatabase : RoomDatabase(){

    companion object{

        // The singleton
        @Volatile private var instance: AppDatabase? = null


        fun getInstance(context: Context): AppDatabase {
            return instance?: synchronized(this){
                instance ?: buildDatabase(context).also{ instance = it}
            }
        }

        private fun buildDatabase(context: Context): AppDatabase {
            return Room.databaseBuilder(context, AppDatabase::class.java, DATABASE_NAME)
                .fallbackToDestructiveMigration()
                .build()
        }
    }
}