package io.github.lordthum.webipmi.components.tabs

import com.github.mvysny.karibudsl.v10.grid
import com.github.mvysny.karibudsl.v10.nativeLabel
import com.vaadin.flow.data.provider.ListDataProvider
import io.github.lordthum.webipmi.components.base.BasicTab
import io.github.lordthum.webipmi.entity.Fan
import io.github.lordthum.webipmi.entity.Server
import io.github.lordthum.webipmi.server.ServerService

class ServerFanTab(serverService: ServerService) : BasicTab() {

    init {
        nativeLabel("Lüfter")

        grid<Fan> {
            addColumn(Fan::name).setHeader("Lüfter")
            addColumn(Fan::status).setHeader("Status")
            addColumn(Fan::pwm).setHeader("PWM %")
            addColumn(Fan::rpm).setHeader("RPM")

            setItems(ListDataProvider(serverService.getById(1).get().fans))
        }
    }
}