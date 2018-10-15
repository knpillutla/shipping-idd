package com.threedsoft.shipping.dto.requests;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.threedsoft.util.dto.WMSRequestDTO;
import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@JsonAutoDetect(fieldVisibility = Visibility.ANY)
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
@NoArgsConstructor
@Data
@AllArgsConstructor
public class ShipLineStatusUpdateRequestDTO extends WMSRequestDTO{
	Long id;
	Long orderId;
	String busName;
	Integer locnNbr;
	String orderNbr;
	String company;
	String division;
	String itemBrcd;
	String busUnit;
	Integer qty;
	Integer newStatus;
}
