package no.ntnu.item.semesterassignment.taxicentral.component;

import container.TaxiMessage;
import no.ntnu.item.arctis.runtime.Block;

public class Component extends Block {

	public String getTopic(TaxiMessage message) {
		return message.getTo();
	}



}
