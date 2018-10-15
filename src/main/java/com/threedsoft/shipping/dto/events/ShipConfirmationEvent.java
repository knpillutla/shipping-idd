package com.threedsoft.shipping.dto.events;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.threedsoft.shipping.dto.responses.ShipResourceDTO;
import com.threedsoft.util.dto.events.WMSEvent;
import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Data;
import lombok.NoArgsConstructor;

@JsonAutoDetect(fieldVisibility = Visibility.ANY)
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
@NoArgsConstructor
@Data
public class ShipConfirmationEvent extends WMSEvent {
	public ShipConfirmationEvent(ShipResourceDTO resourceDTO, String serviceName) {
		this(resourceDTO, serviceName, null);
	}

	public ShipConfirmationEvent(ShipResourceDTO resourceDTO, String serviceName, Map headerMap) {
		super("ShipConfirmationEvent", resourceDTO.getBusName(), resourceDTO.getLocnNbr(), resourceDTO.getCompany(),
				resourceDTO.getDivision(), resourceDTO.getBusUnit(), "", "", serviceName,
				resourceDTO);
		if (headerMap != null)
			this.setHeaderMap(headerMap);
	}
}
