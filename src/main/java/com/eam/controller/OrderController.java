package com.eam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.eam.model.Order;
import com.eam.repository.IOrderRepository;



@Controller
@RequestMapping("/order")
public class OrderController {
	

	  @Autowired
	    private IOrderRepository  orderRepository;
	  
		@GetMapping("")
		public String mostrarFormulario(Order order) {
			return "orderform";
		}
		
	  @GetMapping("/list")
	    public String mostrarList(Order order, Model model) {
	    	List<Order> orders = orderRepository.findAll();
	    	model.addAttribute("order",orders);
	        return "orderlist";
	    }

	    @PostMapping("")
	    public String guardarOrder(Order order) {
	    	System.out.println("HOLAAAAAAA");
	        orderRepository.save(order);
	        return "redirect:/order/list";
	    }
}
