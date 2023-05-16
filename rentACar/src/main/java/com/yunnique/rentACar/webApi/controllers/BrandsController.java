package com.yunnique.rentACar.webApi.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yunnique.rentACar.business.abstracts.BrandService;
import com.yunnique.rentACar.business.requests.CreateBrandRequest;
import com.yunnique.rentACar.business.responses.GetAllBrandsResponse;

import lombok.AllArgsConstructor;

@RestController //Annotation
@RequestMapping("/api/brands")
@AllArgsConstructor
public class BrandsController {
	private BrandService brandService;

	
	@GetMapping("/getall")
	public List<GetAllBrandsResponse> getAll(){
		return brandService.getAll();
	}
	
	@PostMapping("/add")
	public void add(CreateBrandRequest createBrandRequest) {//RequestBody
		this.brandService.add(createBrandRequest);
	}
	
}
