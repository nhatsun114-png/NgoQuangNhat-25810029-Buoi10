package edu.hcmute.readandupdatedatawithroom

import android.app.Application
import edu.hcmute.readandupdatedatawithroom.data.AppContainer
import edu.hcmute.readandupdatedatawithroom.data.AppDataContainer

class InventoryApplication : Application() {

    /**
     * AppContainer instance used by the rest of classes to obtain dependencies
     */
    lateinit var container: AppContainer

    override fun onCreate() {
        super.onCreate()
        container = AppDataContainer(this)
    }
}
