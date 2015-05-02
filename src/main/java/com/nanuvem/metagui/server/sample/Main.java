package com.nanuvem.metagui.server.sample;

import java.util.Date;

import com.nanuvem.metagui.server.MetaGuiEntryPoint;
import com.nanuvem.metagui.server.container.DomainModelContainer;
import com.nanuvem.metagui.server.sample.entities.Client;
import com.nanuvem.metagui.server.sample.repositories.ClientRepository;

public class Main {

	public static void main(String[] args) {
		MetaGuiEntryPoint.run(args);
		DomainModelContainer.deploy("client", Client.class, ClientRepository.class);
		Client client = new Client();
		client.setName("Delano Oliveira");
		client.setBirthdate(new Date());
		DomainModelContainer.saveInstance("client", client);
	}
	
}
