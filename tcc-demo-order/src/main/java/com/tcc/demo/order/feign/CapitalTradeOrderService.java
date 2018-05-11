package com.tcc.demo.order.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.tcc.demo.order.dto.CapitalTradeOrderDto;

import io.prong.boot.tcc.support.TransactionEntity;

@FeignClient(name="tcc-capital")
public interface CapitalTradeOrderService {
	
	@PostMapping("api/capital/record")
    public String record(@RequestBody TransactionEntity<CapitalTradeOrderDto> entity);
}
