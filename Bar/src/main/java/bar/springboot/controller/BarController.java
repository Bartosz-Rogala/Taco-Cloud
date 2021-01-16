package bar.springboot.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import bar.springboot.repository.BarOrderRepository;
import bar.springboot.model.BarOrder;

@RestController
@RequestMapping("/api")
public class BarController {
	
	@Autowired
	private BarOrderRepository barOrderRepository;
	
//	create order
	@PostMapping("/create")
	public BarOrder createOrder(@RequestBody BarOrder barOrder) {
		return barOrderRepository.save(barOrder);
	}
	
//	get all orders
	@GetMapping("/view_orders")
	public List<BarOrder> getAllOrders() {
		return (List<BarOrder>) barOrderRepository.findAll();
	}
	
//	get orders by client name
	@GetMapping("/view_orders/client")
	public List<BarOrder> getOrdersByBarClient(@RequestParam String barClient) {
		return (List<BarOrder>) barOrderRepository.findByBarClient(barClient);
	}
	
//	get orders by order id
	@GetMapping("/view_orders/id")
	public Optional<BarOrder> getOrderById(@RequestParam Long id) {
		return barOrderRepository.findById(id);
	}

}
