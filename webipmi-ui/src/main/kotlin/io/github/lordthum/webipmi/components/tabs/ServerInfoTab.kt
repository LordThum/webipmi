package io.github.lordthum.webipmi.components.tabs

import com.github.mvysny.karibudsl.v10.bind
import com.github.mvysny.karibudsl.v10.formLayout
import com.github.mvysny.karibudsl.v10.nativeLabel
import com.github.mvysny.karibudsl.v10.textField
import com.vaadin.flow.data.binder.Binder
import io.github.lordthum.webipmi.components.base.BasicTab
import io.github.lordthum.webipmi.components.sensorTextBox
import io.github.lordthum.webipmi.entity.Server

class ServerInfoTab(serverBinder: Binder<Server>, server: Server) : BasicTab() {

    init {
        serverBinder.bean = server

        nativeLabel("Info")

        formLayout {

            sensorTextBox("ID")
            sensorTextBox("Name").textField.bind(serverBinder).bind(Server::name)
            sensorTextBox("Hersteller")
            sensorTextBox("IP Adresse").textField.bind(serverBinder).bind(Server::ip)
        }
    }
}