package com.threedsoft.shipping.dto.responses;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.threedsoft.util.dto.WMSResourceDTO;
import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@JsonAutoDetect(fieldVisibility = Visibility.ANY)
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
@NoArgsConstructor
@Data
@AllArgsConstructor
public class ShipResourceDTO  extends WMSResourceDTO implements Serializable{
	Long id;
	String busName;
	Integer locnNbr;
	String company;
	String division;
	String busUnit;
	String batchNbr;
	Long orderId;
	String orderNbr;
	Integer statCode;
	LocalDateTime orderDttm;
	LocalDateTime shipByDttm;
	LocalDateTime expectedDeliveryDttm;
	String deliveryType;
	String source;
	String transactionName;
	String refField1;
	String refField2;
	LocalDateTime updatedDttm;
	String updatedBy;
	String shipCarrier;
    String shipCarrierService;
    String trackingNbr;
    double shipCost;
    String firstName;
    String lastName;
    String middleName;
    String addr1;
    String addr2;
    String addr3;
    String city;
    String state;
    String country;
    String zipcode;
    String phoneNbr;
	
	List<ShipLineResourceDTO> orderLines = new ArrayList<>();
	

    public void addOrderLine(ShipLineResourceDTO orderLineDTO) {
    	orderLines.add(orderLineDTO);
    }
 
    public void removeOrderLine(ShipLineResourceDTO orderLineDTO) {
    	orderLines.remove(orderLineDTO);
    }
}
