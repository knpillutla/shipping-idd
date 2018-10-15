package com.threedsoft.shipping.dto.responses;

import java.io.Serializable;
import java.time.LocalDateTime;

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
public class ShipLineResourceDTO  extends WMSResourceDTO implements Serializable{
	Long id;
	Integer shipLineNbr;
	String itemBrcd;
	Integer qty;
	double itemWidth;
	double itemHeight;
	double itemLength;
	double itemUnitWt;
	double itemUnitVol;
	String source;
	String transactionName;
	String refField1;
	String refField2;
	LocalDateTime updatedDttm;
	String updatedBy;
}
