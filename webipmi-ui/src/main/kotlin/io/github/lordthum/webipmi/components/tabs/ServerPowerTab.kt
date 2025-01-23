package io.github.lordthum.webipmi.components.tabs

import com.github.mvysny.karibudsl.v10.nativeLabel
import io.github.lordthum.webipmi.components.base.BasicTab
import io.github.lordthum.webipmi.components.sensorTextBox

class ServerPowerTab : BasicTab() {

    init {

        nativeLabel("Power")

//        sensorTextBox("Stromverbrauch")
    }
}