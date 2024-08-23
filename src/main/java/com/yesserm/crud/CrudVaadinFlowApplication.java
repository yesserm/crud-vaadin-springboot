package com.yesserm.crud;

import com.vaadin.flow.component.page.AppShellConfigurator;
import com.vaadin.flow.server.PWA;
import com.vaadin.flow.theme.Theme;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@PWA(name = "Project base for Vaadin with Spring", shortName = "Project base")
@Theme("my-theme")
public class CrudVaadinFlowApplication implements AppShellConfigurator {

	public static void main(String[] args) {
		SpringApplication.run(CrudVaadinFlowApplication.class, args);
	}

}
