package pl.patryk.pizza.remote.rest.api;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.patryk.pizza.remote.rest.dto.common.OrderDto;
import pl.patryk.pizza.remote.rest.dto.response.TokenDto;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RequestMapping(value = "/api/v1/orders", produces = APPLICATION_JSON_VALUE)
@RestController

public class OrderController {
    @PostMapping
public ResponseEntity<TokenDto> addOrder(@RequestBody AddOrderDto addOrderDto){
    return ResponseEntity.ok(null);




}











}
