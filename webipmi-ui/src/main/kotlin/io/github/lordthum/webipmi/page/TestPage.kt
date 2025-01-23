package io.github.lordthum.webipmi.page

import com.vaadin.flow.router.PageTitle
import com.vaadin.flow.router.Route
import com.vaadin.flow.router.RouteAlias

@Route(value = "test")
@RouteAlias(value = "/test")
@PageTitle("Test")
class TestPage : BasicPage("Test") {
}