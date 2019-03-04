package org.vaadin.paul.spring.ui.views;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.HtmlImport;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.templatemodel.TemplateModel;

@Tag("sa-login-view")
@HtmlImport("frontend://src/views/sa-login-view.html")
@Route(value = LoginView.ROUTE)
@PageTitle("Login")
public class LoginView extends PolymerTemplate<TemplateModel> {
	public static final String ROUTE = "login";
}
