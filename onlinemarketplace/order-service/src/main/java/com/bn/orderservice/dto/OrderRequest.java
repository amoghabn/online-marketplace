package com.bn.orderservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.ArrayList;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderRequest{
    private List<OrderLineItemsDto> orderLineItemsDtoList = new ArrayList<>();;
}

